package exe8;

public enum Bolas {
	NIKE{
		public Fabricante criarBola(){
			return new BolaNike("Jabulani","rosa","tecido e polister");
		}
	}, ADIDAS{
		public Fabricante criarBola(){
			return new BolaAdidas("Crebs","Verde","Couro");
		}
	}, PUMA{
		public Fabricante criarBola(){
			return new BolaPuma("batata","Pardo","Lona");
		}
	};
	
	public abstract Fabricante criarBola();
	
}