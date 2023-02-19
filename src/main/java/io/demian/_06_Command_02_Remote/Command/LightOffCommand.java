package io.demian._06_Command_02_Remote.Command;

import io.demian._06_Command_02_Remote.Receiver.Light;

public class LightOffCommand implements Command {
	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
}
