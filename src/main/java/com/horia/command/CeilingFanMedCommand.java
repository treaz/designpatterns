package com.horia.command;

public class CeilingFanMedCommand implements Command {

	private CeilingFan fan;
	private int prevSpeed;

	public CeilingFanMedCommand(CeilingFan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		prevSpeed = fan.getSpeed();
		fan.med();

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
