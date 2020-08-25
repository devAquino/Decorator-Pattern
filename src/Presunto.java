
public class Presunto extends Recheio{

	private Sanduiche sanduiche;
	
	public Presunto(Sanduiche sanduiche) {
		this.sanduiche = sanduiche;
	}
	
	@Override
	double mostrarPreco() {
		return sanduiche.mostrarPreco() + 1.00;
	}

	@Override
	String mostrarIngredientes() {
		return sanduiche.mostrarIngredientes() + ", presunto";
	}
	
}
