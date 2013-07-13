package com.horia.compositeTree;

import java.util.Iterator;

public class MenuItem extends MenuComponent{

	private String name;
	private String description;
	private boolean vegetarian;
	private double price;

	public MenuItem(String name, String description, boolean vegetarian,
			double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", description=" + description
				+ ", vegetarian=" + vegetarian + ", price=" + price + "]";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void print() {
		System.out.print(getName()+", ");
		System.out.print(getPrice()+"----");
		System.out.print(getDescription()+"\n");
	}

	@Override
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}
	
	
}
