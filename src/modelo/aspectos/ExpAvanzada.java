package modelo.aspectos;

public class ExpAvanzada extends ExpPrevia {

	@Override
	public double enfrentar(Enfrentable aspecto) {
		return aspecto.enfrentarTer(this);
	}

	@Override
	public double enfrentarPri(Enfrentable aspecto) {
		return -2;
	}

	@Override
	public double enfrentarSeg(Enfrentable aspecto) {
		return -1.5;
	}

	@Override
	public double enfrentarTer(Enfrentable aspecto) {
		return 1;
	}
}
