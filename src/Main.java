
public class Main {
	public static void main(String[] args) {
		BoxGreen boxGreen = new BoxGreen();
		ObserverBlue observerBlue = new ObserverBlue(boxGreen);
		boxGreen.open();
	}
}

