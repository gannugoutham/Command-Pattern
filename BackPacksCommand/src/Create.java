
public class Create implements Command{
	
	public BackPackDevice backpackDevice ;

	public Create(BackPackDevice device) {
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
		 
		backpackDevice.create();
	}

}
