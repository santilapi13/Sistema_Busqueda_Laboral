package modelo;

import modelo.aspectos.CargaCompleta;
import modelo.aspectos.CargaExtendida;
import modelo.aspectos.CargaHoraria;
import modelo.aspectos.CargaMedia;
import modelo.aspectos.EdadAvanzada;
import modelo.aspectos.EdadMedia;
import modelo.aspectos.EdadTemprana;
import modelo.aspectos.Estudios;
import modelo.aspectos.ExpAvanzada;
import modelo.aspectos.ExpMedia;
import modelo.aspectos.ExpNula;
import modelo.aspectos.ExpPrevia;
import modelo.aspectos.HomeOffice;
import modelo.aspectos.Junior;
import modelo.aspectos.LocIndistinta;
import modelo.aspectos.Locacion;
import modelo.aspectos.Managment;
import modelo.aspectos.Presencial;
import modelo.aspectos.Primario;
import modelo.aspectos.PuestoLaboral;
import modelo.aspectos.RangoEtario;
import modelo.aspectos.RemunAlta;
import modelo.aspectos.RemunBaja;
import modelo.aspectos.RemunMedia;
import modelo.aspectos.Remuneracion;
import modelo.aspectos.Secundario;
import modelo.aspectos.Senior;
import modelo.aspectos.Terciario;

public class FormularioFactory {

	public Formulario getFormulario(String locacion,String remuneracion,String cargaHoraria,String puestoLaboral,String rangoEtario,String expPrevia,String estudios) {
		Locacion loc = null;
		Remuneracion rem = null;
		CargaHoraria ch = null;
		PuestoLaboral pl = null;
		RangoEtario re = null;
		ExpPrevia ep = null;
		Estudios est = null;
		
		if (locacion.equalsIgnoreCase("HomeOffice"))
			loc = new HomeOffice();
		else if (locacion.equalsIgnoreCase("Presencial"))
			loc = new Presencial();
		else if (locacion.equalsIgnoreCase("Indistinto"))
			loc = new LocIndistinta();
		
		if (remuneracion.equalsIgnoreCase("Baja"))
			rem = new RemunBaja();
		else if (remuneracion.equalsIgnoreCase("Media"))
			rem = new RemunMedia();
		else if (remuneracion.equalsIgnoreCase("Alta"))
			rem = new RemunAlta();
		
		if (cargaHoraria.equalsIgnoreCase("Media"))
			ch = new CargaMedia();
		else if (cargaHoraria.equalsIgnoreCase("Completa"))
			ch = new CargaCompleta();
		else if (cargaHoraria.equalsIgnoreCase("Extendida"))
			ch = new CargaExtendida();
		
		if (puestoLaboral.equalsIgnoreCase("Junior"))
			pl = new Junior();
		else if (puestoLaboral.equalsIgnoreCase("Senior"))
			pl = new Senior();
		else if (puestoLaboral.equalsIgnoreCase("Managment"))
			pl = new Managment();
		
		if (rangoEtario.equalsIgnoreCase("Edad Temprana"))
			re = new EdadTemprana();
		else if (rangoEtario.equalsIgnoreCase("Edad Media"))
			re = new EdadMedia();
		else if (rangoEtario.equalsIgnoreCase("Edad Avanzada"))
			re = new EdadAvanzada();
		
		if (expPrevia.equalsIgnoreCase("Nada"))
			ep = new ExpNula();
		else if (expPrevia.equalsIgnoreCase("Media"))
			ep = new ExpMedia();
		else if (expPrevia.equalsIgnoreCase("Mucha"))
			ep = new ExpAvanzada();
		
		if (estudios.equalsIgnoreCase("Primario"))
			est = new Primario();
		else if (estudios.equalsIgnoreCase("Secundario"))
			est = new Secundario();
		else if (estudios.equalsIgnoreCase("Terciario"))
			est = new Terciario();
		
		return new Formulario(loc,rem,ch,pl,re,ep,est);
	}
}
