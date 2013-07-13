package com.horia.compositeTree;

import java.util.Iterator;

public abstract class MenuComponent {

	public void add(MenuComponent menu) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent menu) {
		throw new UnsupportedOperationException();
	}
	
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
	
	public void print() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Composite iterator
	 * @author Horia Constantin
	 * @return
	 */
	public Iterator<MenuComponent> createIterator() {
		throw new UnsupportedOperationException();
	}
	
}
