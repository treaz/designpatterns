package com.horia.iterator;

import java.util.ArrayList;
import java.util.List;

public class MenuTestDrive {
	public static void main(String[] args) {
		PancakeHouseMenuAggregate pmenu = new PancakeHouseMenuAggregate();
		DinerMenuAggregate dmenu = new DinerMenuAggregate();
		CafeMenuAggregate cafeMenu = new CafeMenuAggregate();
		
		List<IMenuAggregate> menu = new ArrayList<>();
		menu.add(dmenu);
		menu.add(pmenu);
		menu.add(cafeMenu);
		WaitressClient waitress = new WaitressClient(menu);
		waitress.printMenu();
		
	}
}
