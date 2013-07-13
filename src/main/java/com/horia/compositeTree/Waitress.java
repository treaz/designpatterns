package com.horia.compositeTree;

import java.util.Iterator;

public class Waitress {

	public Waitress(MenuComponent allMenus) {
		super();
		this.allMenus = allMenus;
	}

	MenuComponent allMenus;

	public void printMenu() {
		allMenus.print();
	}

	public void printVegetarianMenu() {
		System.out.println("veg menu");
		Iterator iterator = allMenus.createIterator();
		while (iterator.hasNext()) {
			try {
				MenuComponent menuComp = (MenuComponent) iterator.next();
				if (menuComp.isVegetarian()) {
					menuComp.print();
				}
			} catch (UnsupportedOperationException ex) {
			}
		}
	}
}
