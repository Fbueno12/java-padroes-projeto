package exe8;

public class BolaAdidas extends Fabricante{
	public BolaAdidas(String nome, String cor, String materiais){
		super(nome, cor, materiais);
	}
	
	public void info(){
		System.out.println("Fabricante: Adidas\nNome: "+nome+"\nCor: "+cor+"\nMateriais: "+materiais);
	}
}
