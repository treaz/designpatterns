package com.horia.compositeTree;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent> {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public MenuItem next() {
		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException(); 
	}

}
