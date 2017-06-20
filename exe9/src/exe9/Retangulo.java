package exe9;

public class Retangulo implements Quadrilatero{
	private double larg;
	private double altu;
	private double res;
	public Retangulo(double larg, double altu) {
		this.larg = larg;
		this.altu = altu;
	}
	
	@Override
	public void CalcArea() {
		res = (larg * altu);
		System.out.println("area: "+res+"cm2");
	}

	@Override
	public void CalcPermietro() {
		res = (larg * 2) + (altu * 2);
		System.out.println("perimetro: "+res+"cm");
	}

}
