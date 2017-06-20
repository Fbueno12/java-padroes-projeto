package exe8;

public class BolaNike extends Fabricante{
	public BolaNike(String nome, String cor, String materiais){
		super(nome, cor, materiais);
	}
	
	public void info(){
		System.out.println("Fabricante: nike\nNome: "+nome+"\nCor: "+cor+"\nMateriais: "+materiais);
	}
}
