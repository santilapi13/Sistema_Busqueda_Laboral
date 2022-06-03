package modelo.aspectos;

public class Secundario extends Estudios {

	@Override
	public double enfrentar(Enfrentable aspecto) {
		return aspecto.enfrentarSeg(this);
	}

	@Override
	public double enfrentarPri(Enfrentable aspecto) {
		return -0.5;
	}

	@Override
	public double enfrentarSeg(Enfrentable aspecto) {
		return 1;
	}

	@Override
	public double enfrentarTer(Enfrentable aspecto) {
		return 1.5;
	}
}
