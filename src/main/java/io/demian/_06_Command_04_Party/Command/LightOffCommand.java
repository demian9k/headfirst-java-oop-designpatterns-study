package io.demian._06_Command_04_Party.Command;
import io.demian._06_Command_04_Party.Receiver.*;
public class LightOffCommand implements Command {
	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}

	public void undo() {
		light.on();
	}
}
