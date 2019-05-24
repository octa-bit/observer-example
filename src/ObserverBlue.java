
public class ObserverBlue extends Observer {
	
	private BoxGreen box;
	
	public ObserverBlue(BoxGreen box) {
		this.box = box;
		box.attach(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		if (box.getIsOpen()) {
			System.out.println("The box is now opened!!");
		}
	}

}


