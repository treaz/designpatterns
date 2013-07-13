package com.horia.command;

public class GarageDoorCloseCommand implements Command {

	GarageDoor garage;
	
	public GarageDoorCloseCommand(GarageDoor aGarage) {
		garage = aGarage;
	}
	@Override
	public void execute() {
		garage.down();
	}
	@Override
	public void undo() {
		garage.up();
		
	}

}
