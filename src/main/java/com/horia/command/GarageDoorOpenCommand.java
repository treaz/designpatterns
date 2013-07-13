package com.horia.command;

public class GarageDoorOpenCommand implements Command {

	GarageDoor garage;
	
	public GarageDoorOpenCommand(GarageDoor aGarage) {
		garage = aGarage;
	}
	@Override
	public void execute() {
		garage.up();
	}
	@Override
	public void undo() {
		garage.down();
		
	}

}
