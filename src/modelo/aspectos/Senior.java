package modelo.aspectos;

public class Senior extends PuestoLaboral {

	public Senior() {
		this.tasaComision = 90;
	}
	
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
		return -0.5;
	}
}
