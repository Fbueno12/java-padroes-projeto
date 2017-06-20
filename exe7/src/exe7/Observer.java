package exe7;

public abstract class Observer {
	protected FootstarSub mensagem;

	public Observer(FootstarSub mensagem) {
		this.mensagem = mensagem;
	}

	public abstract void update();
}
