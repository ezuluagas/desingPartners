package prototype.razapersonajes;

public class AppPersonaje {

	public static void main(String[] args) {
		Personaje personaje=new Duende();
		
		System.out.println("creando "+personaje.toString());
		System.out.println("bienvenido al mundo maldito "+personaje.clone());

	}

}
