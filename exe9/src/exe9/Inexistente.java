package exe9;

public class Inexistente implements Quadrilatero{

	@Override
	public void CalcArea() {
		System.out.println("Figura inexistente...");
	}

	@Override
	public void CalcPermietro() {
		System.out.println("Figura inexistente...");
	}


}
