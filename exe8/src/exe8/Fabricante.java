package exe8;

public abstract class Fabricante {
	protected String nome;
	protected String cor;
	protected String materiais;
	
	Fabricante(String nome, String cor, String materiais){
		this.nome = nome;
		this.cor = cor;
		this.materiais = materiais;
	}
	
	public void info(){
		System.out.println("Bola criada...");
	}
	
}
