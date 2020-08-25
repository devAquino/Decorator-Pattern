
public class Bauru extends Sanduiche{
	
	private String
		pao = "pão",
		carne = "carne", 
		ovo = "ovo", 
		alface = "alface";

	public Bauru() {
		this.pao = "pão";
		this.carne = "carne";
		this.ovo = "ovo";
		this.alface = "alface";
	}
	
//	public String getPao() {
//		return pao;
//	}
//
//	public String getCarne() {
//		return carne;
//	}
//
//	public String getOvo() {
//		return ovo;
//	}
//
//	public String getAlface() {
//		return alface;
//	}

	@Override
	double mostrarPreco() {
		return 5.50;
	}

	@Override
	String mostrarIngredientes() {	
		return "Ingredientes: "+this.pao+", "+this.carne+", "+this.ovo+", "+this.alface;
	}

}
