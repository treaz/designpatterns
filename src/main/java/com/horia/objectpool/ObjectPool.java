/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horia.objectpool;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Horia
 */
public abstract class ObjectPool<T> {

	private static final Logger LOG = LoggerFactory.getLogger(ObjectPool.class);
	private long OBJECT_EXPIRATION_TIME = 30000;
	private HashMap<T, Long> locked, unlockedPool;

	public ObjectPool() {
		locked = new HashMap<>();
		unlockedPool = new HashMap<>();
	}

	protected abstract T create() throws IOException;

	public abstract boolean isValid(T o);

	public abstract void expire(T o);

	public synchronized T getConnection() throws IOException {
		LOG.debug("entering getConnection");
		long now = System.currentTimeMillis();
		T t = null;
		if (unlockedPool.size() > 0) {
			t = getObjectFromUnlockedPool(now);
		}
		// no objects available, create a new one
		if (t == null) {
			t = create();
		}
		locked.put(t, now);
		LOG.debug("returning connection: {}", t);
		LOG.debug("exiting getConnection");
		return (t);
	}

	public synchronized void release(T t) {
		LOG.debug("entering release");
		locked.remove(t);
		unlockedPool.put(t, System.currentTimeMillis());
		LOG.debug("exiting release");
	}

	private T getObjectFromUnlockedPool(long now) {
		T t = null;
		Iterator<T> e = unlockedPool.keySet().iterator();
		while (e.hasNext()) {
			t = e.next();
			if ((now - unlockedPool.get(t)) > OBJECT_EXPIRATION_TIME) {
				unlockedPool.remove(t);
				expire(t);
				t = null;
			} else {
				if (isValid(t)) {
					unlockedPool.remove(t);
					locked.put(t, now);
				} else {
					// object failed validation
					unlockedPool.remove(t);
					expire(t);
					t = null;
				}
			}
		}
		return t;
	}
}