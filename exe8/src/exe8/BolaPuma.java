package exe8;

public class BolaPuma extends Fabricante {

	public BolaPuma(String nome, String cor, String materiais) {
		super(nome, cor, materiais);
	}

	public void info(){
		System.out.println("Fabricante: Puma\nNome: "+nome+"\nCor: "+cor+"\nMateriais: "+materiais);
	}	
	
}
