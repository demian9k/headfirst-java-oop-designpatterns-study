package io.demian._06_Command_01_SimpleRemote;

import io.demian._06_Command_01_SimpleRemote.Command.*;
import io.demian._06_Command_01_SimpleRemote.Invoker.SimpleRemoteControl;
import io.demian._06_Command_01_SimpleRemote.Receiver.GarageDoor;
import io.demian._06_Command_01_SimpleRemote.Receiver.Light;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand garageOpen = 
		    new GarageDoorOpenCommand(garageDoor);
 
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
    }
	
}
