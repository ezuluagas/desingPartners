package prototype.bicicleta;

public class ejecucionAPP {

	public static void main(String[] args) {
		Bicicleta laNegra=new BicicletaModificada();
		laNegra.setColor("Negro");
		laNegra.setRodada("4");
		laNegra.setType("Montaña");
		System.out.println(laNegra.verBicicleta());
		/*Bicicleta laVerde=laNegra;
		laVerde.setColor("Verde");
		System.out.println(laNegra.verBicicleta());
		System.out.println(laVerde.verBicicleta());
		*/
		Bicicleta laVerdePro =laNegra.clone();
		laVerdePro.setColor("Verde Limon");
		laNegra.setType("Urbana");
		
		System.out.println(laNegra.verBicicleta());
		System.out.println(laVerdePro.verBicicleta());
		

	}

}
