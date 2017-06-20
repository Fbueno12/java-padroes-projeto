package exe2;
public class Foo implements Cloneable{
	
	private int x;
	private Bar bar;
	
	public Foo(int x, Bar bar){
		this.x = x;
		this.bar = bar;
	}
	
	public Foo(Foo tt){
		this.x = tt.x + 1;
		this.bar = tt.bar;
	}
	
	public Foo clone(){
		return new Foo(this);
	}
	
	public void Info(){
		System.out.println(bar.getY()+" numero "+x);
	}
	
}
