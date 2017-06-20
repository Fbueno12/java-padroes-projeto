package exe7;

public class FansObserver extends Observer{
	public FansObserver(FootstarSub mensagem) {
		super(mensagem);
	}

	@Override
	public void update() {
		System.out.println("Messi nega que conta astronômica de bar seja sua e debocha: ‘Como inventam...’");
	}
}
