
public class Stop implements Command{
	
	public BackPackDevice backpackDevice ;
	
	public Stop(BackPackDevice device) {
		backpackDevice = device;
	}

	public BackPackDevice getBackpackDevice() {
		return backpackDevice;
	}

	public void setBackpackDevice(BackPackDevice backpackDevice) {
		this.backpackDevice = backpackDevice;
	}

	@Override
	public void executeProcess() {
		 
		backpackDevice.stop();
	}

}
