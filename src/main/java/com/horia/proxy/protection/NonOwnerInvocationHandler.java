package com.horia.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {

	public NonOwnerInvocationHandler(PersonBean person) {
		super();
		this.person = person;
	}

	PersonBean person;

	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2)
			throws IllegalAccessException {
		try {
			if (arg1.getName().startsWith("get")) {
				throw new IllegalAccessException();
			} else if (arg1.getName().startsWith("setHotOrNotRating")) {
				return arg1.invoke(person, arg2);
			} else if (arg1.getName().startsWith("set")) {
				throw new IllegalAccessException();
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

}
