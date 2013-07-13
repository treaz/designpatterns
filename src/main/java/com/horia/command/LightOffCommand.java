package com.horia.command;

public class LightOffCommand implements Command {

	Light light = null;

	public LightOffCommand(Light aLight) {
		light = aLight;
	}
	
	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
		
	}
	
}
