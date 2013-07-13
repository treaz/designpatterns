package com.horia.command;

public class StereoOffCommand implements Command {

	Stereo stereo = null;

	public StereoOffCommand(Stereo aStereo) {
		stereo = aStereo;
	}
	
	@Override
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		stereo.on();
		
	}
	
}
