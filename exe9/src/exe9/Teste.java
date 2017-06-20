package exe9;

public class Teste {

	public static void main(String[] args) {
		QuadrilateroProxy q = new QuadrilateroProxy(50, 40);
		System.out.println("Retangulo");
		q.CalcArea();
		q.CalcPermietro();
	
		System.out.println();
		
		QuadrilateroProxy w = new QuadrilateroProxy(10, 10);
		System.out.println("Quadrado");
		w.CalcArea();
		w.CalcPermietro();
		
		System.out.println();
		
		QuadrilateroProxy z = new QuadrilateroProxy(0, -10);
		System.out.println("Inexistente");
		z.CalcArea();
		z.CalcPermietro();
	}

}
