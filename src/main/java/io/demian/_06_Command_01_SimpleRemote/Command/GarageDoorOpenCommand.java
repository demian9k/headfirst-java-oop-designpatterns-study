package io.demian._06_Command_01_SimpleRemote.Command;

import io.demian._06_Command_01_SimpleRemote.Receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
