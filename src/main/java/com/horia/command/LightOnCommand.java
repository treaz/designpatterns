package com.horia.command;

public class LightOnCommand implements Command {

	Light light = null;

	public LightOnCommand(Light aLight) {
		light = aLight;
	}
	
	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
		
	}
	
}
