package com.horia.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {

	public DinerMenuIterator(MenuItem[] menuItems) {
		super();
		this.menuItems = menuItems;
	}

	MenuItem[] menuItems;
	int position = 0;

	@Override
	public boolean hasNext() {
		if (position >= menuItems.length || menuItems[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = menuItems[position];
		position++;
		return menuItem;
	}

	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
				("You can't remove an item until you've done at least one next()");
		}
		if (menuItems[position-1] != null) {
			for (int i = position-1; i < (menuItems.length-1); i++) {
				menuItems[i] = menuItems[i+1];
			}
			menuItems[menuItems.length-1] = null;
		}
	}

}
