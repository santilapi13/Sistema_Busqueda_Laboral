package modelo;

import java.util.ArrayList;
import java.util.Random;

public abstract class Util {

	public static Random r = new Random();
	public static String[] rubros = {"Salud","Comercio local","Comercio internacional"};

	public static void espera() {
		try {
			Thread.sleep(r.nextInt(4000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
