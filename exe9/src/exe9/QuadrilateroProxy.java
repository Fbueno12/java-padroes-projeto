package exe9;

public class QuadrilateroProxy implements Quadrilatero{
	
	private Quadrilatero quad;
	
	protected double larg;
	protected double altu;
	
	public QuadrilateroProxy(double larg, double altu) {
		
		if(larg < 0 || altu < 0){
			quad = new Inexistente();
		}else if(larg != altu){
			quad = new Retangulo(larg,altu);
		}else{
			quad = new Quadrado(larg,altu);
		}
	}

	@Override
	public void CalcArea() {
		quad.CalcArea();
	}

	@Override
	public void CalcPermietro() {
		quad.CalcPermietro();
	}

}
