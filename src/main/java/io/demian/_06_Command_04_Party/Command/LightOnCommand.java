package io.demian._06_Command_04_Party.Command;
import io.demian._06_Command_04_Party.Receiver.*;
public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}

	public void undo() {
		light.off();
	}
}
