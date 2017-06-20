package exe8;

public class Teste {

	public static void main(String[] args) {
		Fabricante f = Bolas.NIKE.criarBola();
		f.info();
		System.out.println();
		Fabricante x = Bolas.ADIDAS.criarBola();
		x.info();
		System.out.println();
		Fabricante p = Bolas.PUMA.criarBola();
		p.info();
	}

}
