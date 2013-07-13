package com.horia.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {

	public OwnerInvocationHandler(PersonBean person) {
		super();
		this.person = person;
	}

	PersonBean person;

	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2)
			throws IllegalAccessException {
		try {
			if (arg1.getName().startsWith("get")) {
				return arg1.invoke(person, arg2);
			} else if (arg1.getName().startsWith("setHotOrNotRating")) {
				throw new IllegalAccessException();
			} else if (arg1.getName().startsWith("set")) {
				return arg1.invoke(person, arg2);
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

}
