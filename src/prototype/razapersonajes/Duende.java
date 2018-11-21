package prototype.razapersonajes;

public class Duende extends Personaje {

	public static int VIDA=200;
	public static String caracteristica="estatura baja";

	public Duende(){
		super(VIDA,caracteristica);
	}
	@Override
	public PersonajeClonable clone() {
		Duende clon =new Duende();
		clon.VIDA=this.VIDA;
		clon.caracteristica=this.caracteristica;
		return clon;
	}
	
	public String toString(){
		return "Duendecillo";
	}

}
