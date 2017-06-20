package exe7;

public class Teste {

	public static void main(String[] args) {
		FootstarSub msg = new FootstarSub();
		msg.attach(new FansObserver(msg));
		msg.attach(new ImprensaObserver(msg));

		msg.setState(new FootStarApp("Messi nega conta no bar"));
}

}
