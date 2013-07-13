package com.horia.command;

public class SimpleRemoteControl {

	private Command[] onCommands;
	private Command[] offCommands;
	private Command lastCommmand = new NoCommmand();
	
	public SimpleRemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
//		this is a null object
		Command noCommmand = new NoCommmand();
		for (int i=0;i<onCommands.length;i++) {
			onCommands[i] = noCommmand;
			offCommands[i] = noCommmand;
		}
	}
	
	public void setCommand(int i, Command onCommand, Command offCommand) {
		onCommands[i] = onCommand;
		offCommands[i] = offCommand;
	}
	
	public void onButtonWasPressed(int slot) {
		onCommands[slot].execute();
		lastCommmand = onCommands[slot];
	}
	
	public void offButtonWasPressed(int slot) {
		offCommands[slot].execute();
		lastCommmand = offCommands[slot];
	}

	public void undoButtonPressed() {
		lastCommmand.undo();
		
	}
	
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		for (int i=0;i<onCommands.length;i++) {
			result.append("slot "+i+": "+onCommands[i].getClass().getName()+"     "+offCommands[i].getClass().getName()+"\n");
		}
		return result.toString();
	}
}
