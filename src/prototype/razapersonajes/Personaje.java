package prototype.razapersonajes;

public abstract class Personaje implements PersonajeClonable {

	public int vida;
	public String caracteristica;
	
	public Personaje(int vida, String caracteristica){
		this.vida=vida;
		this.caracteristica=caracteristica;
	}
	
	@Override
	public abstract PersonajeClonable clone();

}
