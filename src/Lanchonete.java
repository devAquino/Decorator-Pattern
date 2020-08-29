
public class Lanchonete {
	
	public static void main(String[] args) {
		
		Sanduiche sanduiche = new Bauru();
		sanduiche = new Presunto(sanduiche);
		sanduiche = new Queijo(sanduiche);
		System.out.println("Sanduiche de "+sanduiche.getNome()+ sanduiche.getPreco());
		
	}
}
