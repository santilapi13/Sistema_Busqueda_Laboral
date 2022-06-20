package modelo.aspectos;

public class HomeOffice extends Locacion {

	@Override
	public double enfrentar(Enfrentable aspecto) {
		return aspecto.enfrentarPri(this);
	}

	@Override
	public double enfrentarPri(Enfrentable aspecto) {
		return 1;
	}

	@Override
	public double enfrentarSeg(Enfrentable aspecto) {
		return -1;
	}

	@Override
	public double enfrentarTer(Enfrentable aspecto) {
		return 0.5;
	}

	@Override
	public String toString() {
		return "HomeOffice";
	}
	
}
