
public class Lanchonete {
	
	public static void main(String[] args) {
		
		Sanduiche bauru = new Bauru();
		imprimeIngredintes(bauru);
		
		Sanduiche bauruComPresunto = new Presunto(bauru);
		imprimeIngredintes(bauruComPresunto);
		
		Sanduiche bauruComPresuntoEQuijo = new Queijo(bauruComPresunto);
		imprimeIngredintes(bauruComPresuntoEQuijo);
		
		
	}
	
	public static void imprimeIngredintes(Sanduiche sanduiche) {
		System.out.println("Sanduiche de "+sanduiche.getClass().getName()+" -> "+ sanduiche.mostrarIngredientes()+" | preço: "+sanduiche.mostrarPreco());
		
	}

}
