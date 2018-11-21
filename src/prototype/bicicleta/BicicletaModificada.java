package prototype.bicicleta;

public class BicicletaModificada extends Bicicleta {

	@Override
	public String verBicicleta() {
		// TODO Auto-generated method stub
		return "La bicicleta es del color "+this.getColor()+" es del tipo "+this.getType()+" tiene "+this.getRodada()+" km.";
	}

}
