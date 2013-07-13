package com.horia.command;

public class NoCommmand implements Command {

	@Override
	public void execute() {
		System.out.println("nothing");

	}

	@Override
	public void undo() {
	}

}
