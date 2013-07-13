package com.horia.proxy.protection;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {

	public static void main(String[] args) {
		MatchMakingTestDrive td = new MatchMakingTestDrive();
		td.drive();
	}
	
	private void drive() {
		PersonBean joe = new PersonBeanImpl();
		joe.setName("joe");
		PersonBean ownerproxy = getOwnerProxy(joe);
		System.out.println(ownerproxy.getName());
		try {
		ownerproxy.setHotOrNotRating(10);
		} catch (Exception ex) {
			System.out.println("bad");
		}
		
		System.out.println(ownerproxy.getHotOrNotRating());
		
		PersonBean nonowner = getNotOwnerProxy(joe);
		nonowner.setHotOrNotRating(10);
		System.out.println(ownerproxy.getHotOrNotRating());
		nonowner.setName("gigi");
		
	}

	public PersonBean getOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person)); 
	}
	
	public PersonBean getNotOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person)); 
	}
}
