package prototype.bicicleta;

public abstract class Bicicleta implements Cloneable {
	
	private String color;
	private String rodada;
	private String type;
	
	public Bicicleta clone(){
		
		try {
			return (Bicicleta) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("imposible Clone");
			e.printStackTrace();
			return null;
		}
	}
	
	public abstract String verBicicleta();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRodada() {
		return rodada;
	}

	public void setRodada(String rodada) {
		this.rodada = rodada;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
