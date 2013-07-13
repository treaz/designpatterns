package com.horia.command;

public class CeilingFanOffCommand implements Command {

	private CeilingFan fan;
	private int prevSpeed;

	public CeilingFanOffCommand(CeilingFan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		prevSpeed = fan.getSpeed();
		fan.off();

	}

	@Override
	public void undo() {
		if (prevSpeed == CeilingFan.HIGH) {
			fan.high();
		} else if (prevSpeed == CeilingFan.MED) {
			fan.med();
		} else if (prevSpeed == CeilingFan.LOW) {
			fan.low();
		} else if (prevSpeed == CeilingFan.OFF) {
			fan.off();
		}
	}

}
