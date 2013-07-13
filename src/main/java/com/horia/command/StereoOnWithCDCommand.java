package com.horia.command;

public class StereoOnWithCDCommand implements Command {

	Stereo stereo = null;

	public StereoOnWithCDCommand(Stereo aStereo) {
		stereo = aStereo;
	}
	
	@Override
	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}

	@Override
	public void undo() {
		stereo.off();
		
	}
	
}
