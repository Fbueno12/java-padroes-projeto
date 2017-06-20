package exe9;

public class Quadrado implements Quadrilatero{
	private double larg;
	private double altu;
	private double res;
	public Quadrado(double larg, double altu) {
		this.larg = larg;
		this.altu = altu;
	}
	@Override
	public void CalcArea() {
		res = (larg * larg);
		System.out.println("area: "+res);
	}

	@Override
	public void CalcPermietro() {
		res = (larg + altu) * 2;
		System.out.println("perimetro: "+res);
	}

}
