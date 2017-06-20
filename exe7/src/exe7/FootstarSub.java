package exe7;

import java.util.ArrayList;

public class FootstarSub {
	protected ArrayList<Observer> observers;
	protected FootStarApp mensagem;
	
	public FootstarSub() {
		observers = new ArrayList<Observer>();
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(int indice) {
		observers.remove(indice);
	}

	public void setState(FootStarApp mensagem) {
		this.mensagem = mensagem;
		notifica();
	}

	private void notifica() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	public FootStarApp getState() {
		return mensagem;
	}
	
}
