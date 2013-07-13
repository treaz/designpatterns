package com.horia.templateMethod;

public class DrinkTest {
public static void main(String[] args) {
	Tea tea = new Tea();
	tea.prepareRecipe();
	CoffeeWithHook coffee = new CoffeeWithHook();
	coffee.prepareRecipe();
}
}
