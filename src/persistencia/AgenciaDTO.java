package persistencia;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import modelo.Admin;
import modelo.Contrato;
import modelo.ElemRE;
import modelo.Empleado;
import modelo.Empleador;

@SuppressWarnings("serial")
public class AgenciaDTO implements Serializable {
	
	private double fondos;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	private ArrayList<Empleador> empleadores = new ArrayList<Empleador>();
	private ArrayList<ElemRE> eleccionesEmpleadores = new ArrayList<ElemRE>();
	private Map<String, ElemRE> eleccionesEmpleados = new HashMap<String, ElemRE>();
	private ArrayList<Contrato> contratos = new ArrayList<Contrato>();
	private ArrayList<Admin> administradores = new ArrayList<Admin>();

	public double getFondos() {
		return fondos;
	}

	public void setFondos(double fondos) {
		this.fondos = fondos;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public ArrayList<Empleador> getEmpleadores() {
		return empleadores;
	}

	public void setEmpleadores(ArrayList<Empleador> empleadores) {
		this.empleadores = empleadores;
	}

	public ArrayList<ElemRE> getEleccionesEmpleadores() {
		return eleccionesEmpleadores;
	}

	public void setEleccionesEmpleadores(ArrayList<ElemRE> eleccionesEmpleadores) {
		this.eleccionesEmpleadores = eleccionesEmpleadores;
	}

	public Map<String, ElemRE> getEleccionesEmpleados() {
		return eleccionesEmpleados;
	}

	public void setEleccionesEmpleados(Map<String, ElemRE> eleccionesEmpleados) {
		this.eleccionesEmpleados = eleccionesEmpleados;
	}

	public ArrayList<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(ArrayList<Contrato> contratos) {
		this.contratos = contratos;
	}

	public ArrayList<Admin> getAdministradores() {
		return administradores;
	}

	public void setAdministradores(ArrayList<Admin> administradores) {
		this.administradores = administradores;
	}

}
