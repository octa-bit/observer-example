
public class BoxGreen extends Box {
	private boolean isOpen;
	
	public void open() {
		System.out.println("Opening the box...");
		this.isOpen = true;
		this.notifier();
	}

	public boolean getIsOpen() {
		return isOpen;
	}
}
