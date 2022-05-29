package datos;

public class MatrizFactory {
	public static double[][] getMatriz(String aspecto) {
		double[][] respuesta = null;
		if (aspecto.equalsIgnoreCase("CargaHoraria")) {
			respuesta = new double[3][3];
			respuesta[0][0]=1; respuesta[0][1]=-0.5; respuesta[0][2]=-1;
			respuesta[1][0]=-0.5; respuesta[1][1]=1; respuesta[1][2]=-0.5;
			respuesta[2][0]=-1; respuesta[2][1]=0.5; respuesta[2][2]=1;
		} else if (aspecto.equalsIgnoreCase("Remuneracion")) {	
			respuesta = new double[3][3];
			respuesta[0][0]=1; respuesta[0][1]=-0.5; respuesta[0][2]=-1;
			respuesta[1][0]=1; respuesta[1][1]=1; respuesta[1][2]=-0.5;
			respuesta[2][0]=1; respuesta[2][1]=1; respuesta[2][2]=1;
		} else if (aspecto.equalsIgnoreCase("Locacion")) {	
			respuesta = new double[3][3];
			respuesta[0][0]=1; respuesta[0][1]=-1; respuesta[0][2]=0.5;
			respuesta[1][0]=-1; respuesta[1][1]=1; respuesta[1][2]=0.5;
			respuesta[2][0]=0.5; respuesta[2][1]=0.5; respuesta[2][2]=1;
		} else if (aspecto.equalsIgnoreCase("EstudiosCursados")) {
			respuesta = new double[3][3];
			respuesta[0][0]=1; respuesta[0][1]=1.5; respuesta[0][2]=2;
			respuesta[1][0]=-0.5; respuesta[1][1]=1; respuesta[1][2]=1.5;
			respuesta[2][0]=-2; respuesta[2][1]=-1.5; respuesta[2][2]=1;
		} else if (aspecto.equalsIgnoreCase("ExpPrevia")) {	
			respuesta = new double[3][3];
			respuesta[0][0]=1; respuesta[0][1]=1.5; respuesta[0][2]=2;
			respuesta[1][0]=-0.5; respuesta[1][1]=1; respuesta[1][2]=1.5;
			respuesta[2][0]=-2; respuesta[2][1]=-1.5; respuesta[2][2]=1;
		} else if (aspecto.equalsIgnoreCase("RangoEtario")) {	
			respuesta = new double[3][3];
			respuesta[0][0]=1; respuesta[0][1]=-0.5; respuesta[0][2]=-1;
			respuesta[1][0]=-0.5; respuesta[1][1]=1; respuesta[1][2]=-0.5;
			respuesta[2][0]=-1; respuesta[2][1]=0.5; respuesta[2][2]=1;
		} else if (aspecto.equalsIgnoreCase("TipoPuesto")) {	
			respuesta = new double[3][3];
			respuesta[0][0]=1; respuesta[0][1]=-0.5; respuesta[0][2]=-1;
			respuesta[1][0]=0.5; respuesta[1][1]=1; respuesta[1][2]=-0.5;
			respuesta[2][0]=-1; respuesta[2][1]=0.5; respuesta[2][2]=1;
		}
		return respuesta;
	}
}
