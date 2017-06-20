package exe7;

public class ImprensaObserver extends Observer{
	
	public ImprensaObserver(FootstarSub mensagem){
		super(mensagem);
	}
	
	@Override
	public void update() {
		System.out.println("O craque Lionel Messi foi assunto nas redes sociais, neste domingo. Uma conta de um bar na Espanha, que deu cerca de 37 mil euros ");
	}

}
