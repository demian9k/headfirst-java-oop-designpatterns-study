package io.demian._06_Command_01_SimpleRemote.Command;

import io.demian._06_Command_01_SimpleRemote.Receiver.Light;

public class LightOnCommand implements Command {
	Light light;
  
	public LightOnCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.on();
	}
}
