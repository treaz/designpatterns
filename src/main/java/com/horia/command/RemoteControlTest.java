package com.horia.command;

public class RemoteControlTest {
	
	public static void main(String[] args) {
//		Invoker
		SimpleRemoteControl remote = new SimpleRemoteControl();
//		Receiver
		Light livingLight = new Light();
		GarageDoor gd = new GarageDoor();
		Stereo stereo = new Stereo();
		CeilingFan fan = new CeilingFan();
//		ConcreteCommand
		LightOnCommand livingLightOnCommand = new LightOnCommand(livingLight);
		LightOffCommand livingLightOffCommand = new LightOffCommand(livingLight);
		
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(gd);
		GarageDoorCloseCommand garageClose = new GarageDoorCloseCommand(gd);
		
		CeilingFanHighCommand fanHigh = new CeilingFanHighCommand(fan);
		CeilingFanMedCommand fanMed = new CeilingFanMedCommand(fan);
		CeilingFanOffCommand fanOff = new CeilingFanOffCommand(fan);
		
		StereoOffCommand stereoOff = new StereoOffCommand(stereo); 
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo); 
		
		remote.setCommand(0,livingLightOnCommand, livingLightOffCommand);
		remote.setCommand(3,stereoOn, stereoOff);
		
		remote.setCommand(5, fanHigh, fanOff);
		remote.setCommand(6, fanMed, fanOff);
		
		System.out.println(remote);
		
		remote.onButtonWasPressed(0);
		remote.offButtonWasPressed(0);
		remote.onButtonWasPressed(3);
		remote.undoButtonPressed();
		remote.offButtonWasPressed(3);
		remote.undoButtonPressed();
		
		remote.onButtonWasPressed(5);
		remote.offButtonWasPressed(5);
		remote.undoButtonPressed();
		remote.onButtonWasPressed(6);
		remote.undoButtonPressed();
		
		Command[] partyOnCommands = {stereoOn, livingLightOffCommand};
		Command[] partyOffCommands = {stereoOff, livingLightOnCommand};
		MacroCommand partyOnCommand = new MacroCommand(partyOnCommands);
		MacroCommand partyOffCommand = new MacroCommand(partyOffCommands);
		remote.setCommand(2, partyOnCommand, partyOffCommand);
		
		remote.onButtonWasPressed(2);
		remote.offButtonWasPressed(2);
	}
}
