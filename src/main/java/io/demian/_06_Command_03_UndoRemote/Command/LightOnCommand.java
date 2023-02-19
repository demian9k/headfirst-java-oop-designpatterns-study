package io.demian._06_Command_03_UndoRemote.Command;

import io.demian._06_Command_03_UndoRemote.Receiver.Light;

public class LightOnCommand implements Command {
	Light light;
	int level;
	public LightOnCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
        level = light.getLevel();
		light.on();
	}
 
	public void undo() {
		light.dim(level);
	}
}
