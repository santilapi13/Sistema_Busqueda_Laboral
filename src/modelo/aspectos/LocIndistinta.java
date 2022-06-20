package modelo.aspectos;

public class LocIndistinta extends Locacion {

	@Override
	public double enfrentar(Enfrentable aspecto) {
		return aspecto.enfrentarTer(this);
	}

	@Override
	public double enfrentarPri(Enfrentable aspecto) {
		return 0.5;
	}

	@Override
	public double enfrentarSeg(Enfrentable aspecto) {
		return 0.5;
	}

	@Override
	public double enfrentarTer(Enfrentable aspecto) {
		return 1;
	}

	@Override
	public String toString() {
		return "Indistinta";
	}
	
}

