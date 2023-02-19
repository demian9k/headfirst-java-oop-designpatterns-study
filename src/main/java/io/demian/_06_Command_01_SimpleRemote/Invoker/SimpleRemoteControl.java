package io.demian._06_Command_01_SimpleRemote.Invoker;

import io.demian._06_Command_01_SimpleRemote.Command.Command;

//
// This is the invoker
//
public class SimpleRemoteControl {
	Command slot;
 
	public SimpleRemoteControl() {}
 
	public void setCommand(Command command) {
		slot = command;
	}
 
	public void buttonWasPressed() {
		slot.execute();
	}
}
