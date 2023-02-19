package io.demian._06_Command_01_SimpleRemote.Command;

import io.demian._06_Command_01_SimpleRemote.Receiver.Light;

public class LightOffCommand implements Command {
	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
}
