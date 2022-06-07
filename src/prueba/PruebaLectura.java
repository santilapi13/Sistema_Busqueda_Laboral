package prueba;

import java.io.IOException;
import java.io.Serializable;

import modelo.Agencia;
import persistencia.AgenciaDTO;
import persistencia.IPersistencia;
import persistencia.PersistenciaBIN;
import persistencia.UtilAgencia;

public class PruebaLectura {

	public static void main(String[] args) {
		IPersistencia<Serializable> persistencia = new PersistenciaBIN();
		Agencia agencia = Agencia.getInstance();
		try {
			persistencia.abrirInput("Agencia.bin");
			System.out.println("Archivo abierto");
            AgenciaDTO adto=(AgenciaDTO) persistencia.leer();
            UtilAgencia.AgenciaDTOToAgencia(adto,agencia);
            System.out.println("Agencia recuperada");
            persistencia.cerrarInput();
            System.out.println("Archivo cerrado");
            
            System.out.println("Primer Contrato: " + agencia.getContratos().get(0) + "\nSegundo Contrato: " + agencia.getContratos().get(1));
            
            
		} catch (IOException e) {
			 System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
        }
	}
}
