
public class RemoteControl {
	
	public Command cmd ;

	public RemoteControl(Command bigBackPackCommand) {
		cmd = bigBackPackCommand ;
	}

	 

	public Command getCmd() {
		return cmd;
	}

	public void setCmd(Command cmd) {
		this.cmd = cmd;
	}
	
	public void pressButton() {
		cmd.executeProcess();
	}

}
