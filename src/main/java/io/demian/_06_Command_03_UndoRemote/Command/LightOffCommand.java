package io.demian._06_Command_03_UndoRemote.Command;

import io.demian._06_Command_03_UndoRemote.Receiver.Light;

public class LightOffCommand implements Command {
	Light light;
	int level;
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
        level = light.getLevel();
		light.off();
	}
 
	public void undo() {
		light.dim(level);
	}
}
