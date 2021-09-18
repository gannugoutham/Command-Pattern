
public class BackpackCommandDemo {

	public static void main(String[] args) {
		
		BackPackDevice bigBackPack = new BigBackPack();
		
		Create bigBackPackCommand = new Create(bigBackPack);
		
		RemoteControl bigBackPackControl = new RemoteControl(bigBackPackCommand);
		bigBackPackControl.pressButton();
		
		System.out.println("\n");
		
        BackPackDevice sBackPack = new SmallBackPack();
		
		Stop sBackPackCommandStop = new Stop(sBackPack);
		
		RemoteControl sBackPackControl = new RemoteControl(sBackPackCommandStop);
		sBackPackControl.pressButton();
		

	}

}
