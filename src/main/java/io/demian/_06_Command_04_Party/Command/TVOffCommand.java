package io.demian._06_Command_04_Party.Command;

import io.demian._06_Command_04_Party.Receiver.TV;

public class TVOffCommand implements Command {
	TV tv;

	public TVOffCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.off();
	}

	public void undo() {
		tv.on();
	}
}
