package com.horia.compositeTree;


public class MenuTestDrive {
	public static void main(String[] args) {
		Menu pMenu = new Menu("Pancake", "breakfast");
		Menu lMenu = new Menu("Diner", "lunch");
		Menu dMenu = new Menu("Cafe", "dinner");
		Menu desertMenu = new Menu("Dessert", "sweeet");
		
		Menu allMenus = new Menu("All menus", "integrated");
		
		
		lMenu.add( new MenuItem("Pasta",
				"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
				true, 3.89));
		
		
		
		desertMenu.add(new MenuItem("apple pie", "some apple pie desc", true, 1.59));
		
		dMenu.add( new MenuItem("Veggie Burger and Air Fries",
				"Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
				true, 3.99));
		dMenu.add( new MenuItem("Soup of the day",
				"A cup of the soup of the day, with a side salad", false, 3.69));
		dMenu.add( new MenuItem("Burrito",
				"A large burrito, with whole pinto beans, salsa, guacamole",
				true, 4.29));
		lMenu.add(desertMenu);
		allMenus.add(dMenu);
		allMenus.add(lMenu);
		allMenus.add(pMenu);
		
		Waitress waitress = new Waitress(allMenus);
//		waitress.printMenu();
		waitress.printVegetarianMenu();
		
	}
}
