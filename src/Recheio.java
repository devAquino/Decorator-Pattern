
public abstract class Recheio extends Sanduiche{
	
	Sanduiche sanduiche;
	
	public Recheio(Sanduiche sanduiche) {
		this.sanduiche = sanduiche;
	}
	
	public Sanduiche getSaunduiche() {
		return sanduiche;
	}
	
	public String getNome() {
		return this.sanduiche.getNome() + this.nome;
	}
	
	public double getPreco() {
		return this.sanduiche.getPreco() + this.preco;
	}
}
