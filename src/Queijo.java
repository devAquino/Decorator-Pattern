
public class Queijo extends Sanduiche{
	
	private Sanduiche sanduiche;
	
	public Queijo(Sanduiche sanduiche) {
		this.sanduiche = sanduiche;
	}

	@Override
	double mostrarPreco() {
		
		return sanduiche.mostrarPreco() + 1.50;
	}

	@Override
	String mostrarIngredientes() {
		return sanduiche.mostrarIngredientes() + ", queijo";
	}

}
