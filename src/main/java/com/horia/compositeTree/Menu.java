package com.horia.compositeTree;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {

	public Menu(String name,
			String description) {
		super();
		this.menuComponents = new ArrayList<>();
		this.name = name;
		this.description = description;
	}

	private ArrayList<MenuComponent> menuComponents;
	private String name;
	private String description;

	@Override
	public void add(MenuComponent menu) {
		menuComponents.add(menu);
	}

	@Override
	public void remove(MenuComponent menu) {
		menuComponents.remove(menu);
	}

	@Override
	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void print() {
		System.out.print(getName()+", ");
		System.out.print(getDescription()+"\n");
		for (MenuComponent menuComponent:menuComponents) {
			menuComponent.print();
		}
	}

	@Override
	public String toString() {
		return "Menu [menuComponents=" + menuComponents + ", name=" + name
				+ ", description=" + description + "]";
	}

	@Override
	public Iterator<MenuComponent> createIterator() {
		return new CompositeIterator(menuComponents.iterator());
	}
	
	
}
