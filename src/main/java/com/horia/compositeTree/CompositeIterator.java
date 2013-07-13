package com.horia.compositeTree;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {

	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack = new Stack<>();
		stack.push(iterator);
	}

	private Stack<Iterator<MenuComponent>> stack;

	@Override
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

	@Override
	public MenuComponent next() {
		if (hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent menuComp = iterator.next();
			if (menuComp instanceof Menu) {
				stack.push(menuComp.createIterator());
			}
			return menuComp;
		} else {
			return null;
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
