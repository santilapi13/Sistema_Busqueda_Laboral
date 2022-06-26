package persistencia;

import modelo.Agencia;

public class UtilAgencia {
	
	public static AgenciaDTO AgenciaToAgenciaDTO(Agencia agencia) {
		AgenciaDTO respuesta = new AgenciaDTO();
		respuesta.setFondos(agencia.getFondos());
		respuesta.setContratos(agencia.getContratos());
		respuesta.setEleccionesEmpleadores(agencia.getEleccionesEmpleadores());
		respuesta.setEleccionesEmpleados(agencia.getEleccionesEmpleados());
		respuesta.setEmpleadores(agencia.getEmpleadores());
		respuesta.setEmpleados(agencia.getEmpleados());
		respuesta.setAdministradores(agencia.getAdministradores());
		return respuesta;
	}
	
	public static void AgenciaDTOToAgencia(AgenciaDTO agenciaDTO, Agencia agencia) {
		agencia.setFondos(agenciaDTO.getFondos());
		agencia.setContratos(agenciaDTO.getContratos());
		agencia.setEleccionesEmpleadores(agenciaDTO.getEleccionesEmpleadores());
		agencia.setEleccionesEmpleados(agenciaDTO.getEleccionesEmpleados());
		agencia.setEmpleadores(agenciaDTO.getEmpleadores());
		agencia.setEmpleados(agenciaDTO.getEmpleados());
		agencia.setAdministradores(agenciaDTO.getAdministradores());
	}
}
