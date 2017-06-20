package exe2;
public class Teste {

	public static void main(String[] args) {
		Bar um = new Bar("Clone teste");
		
		Foo t = new Foo(1,um);
		t.Info();
		
		Foo x = t.clone();
		x.Info();
		
		Foo j = x.clone();
		j.Info();
	}

}
