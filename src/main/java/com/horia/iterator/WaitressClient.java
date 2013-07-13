package com.horia.iterator;
import java.util.Iterator;
import java.util.List;
public class WaitressClient {

	public WaitressClient(List<IMenuAggregate> menus) {
		super();
		this.menus = menus;
	}
	List<IMenuAggregate> menus;
	
	public void printMenu() {
		for (IMenuAggregate menu:menus) {
			printMenu(menu.createIterator());
		}
//		Iterator<?> pancakeIterator = pancakeHouseMenu.createIterator();
//		Iterator<?> cafeIt = cafeMenu.createIterator();
//		System.out.println("Menu \nBreakfast");
//		printMenu(pancakeIterator);
//		System.out.println("lunch");
//		printMenu(dinerIterator);
//		System.out.println("cafe");
//		printMenu(cafeIt);
		
	}

	private void printMenu(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.print(menuItem.getName()+", ");
			
			System.out.print(menuItem.getPrice()+"----");
			System.out.print(menuItem.getDescription()+"\n");
		}
		
	}
}
