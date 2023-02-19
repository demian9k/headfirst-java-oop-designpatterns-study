package io.demian._06_Command_02_Remote.Command;

import io.demian._06_Command_02_Remote.Receiver.Stereo;

public class StereoOffCommand implements Command {
	Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.off();
	}
}
