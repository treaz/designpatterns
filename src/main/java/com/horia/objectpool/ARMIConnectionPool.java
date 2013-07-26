/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horia.objectpool;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Horia
 */
public class ARMIConnectionPool extends ObjectPool<Connection> {

	private InetSocketAddress armiAddress;
	private Map<String, String> objectIdCache = new HashMap<>();

	public ARMIConnectionPool(InetSocketAddress armiAddress) {
		super();
		this.armiAddress = armiAddress;
	}

	@Override
	protected Connection create() throws IOException {
		Connection conn = new Connection(armiAddress);
		conn.launchListener();
		return conn;
	}

	@Override
	public boolean isValid(Connection connection) {
		return !connection.isClosed() && connection.successfulHandshake();
	}

	@Override
	public void expire(Connection connection) {
			connection.close();
	}

	public String getArmiObjectId(String absoluteObjectName) throws IOException {
		String objectId = objectIdCache.get(absoluteObjectName);
		objectIdCache.put(absoluteObjectName, objectId);
		return objectId;
	}

	public void invalidateObjectIdCache() {
		objectIdCache.clear();
	}
}
