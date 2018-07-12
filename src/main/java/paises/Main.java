package paises;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import ar.com.ggc.model.Partido;
import ar.com.ggc.model.Pais;
import ar.com.ggc.model.Provincia;
import ar.com.ggc.util.HibernateUtil;

public class Main {
	private static Logger log = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		log.info("Aplicacion *Paises*");
		
		Pais pais = new Pais();
		pais.setActivo(true);
		pais.setDescripcionPais("Argentina");
		
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(pais);
		
		Provincia provincia = null;
		
		provincia = new Provincia("Buenos Aires", pais);
		session.save(provincia);
		session.save(new Partido("La matanza",provincia));
		session.save(new Partido("Tigre",provincia));
		session.save(new Partido("3 de febrero",provincia));
		
		provincia = new Provincia("Catamarca", pais);
		session.save(provincia);
		session.save(new Partido("",provincia));
		session.save(new Partido("",provincia));
		session.save(new Partido("",provincia));
		
		provincia = new Provincia("Chaco", pais);
		session.save(provincia);
		
		provincia = new Provincia("Chubut", pais);
		session.save(provincia);
		
		provincia = new Provincia("Cordoba", pais);
		session.save(provincia);
		session.save(new Partido("",provincia));
		session.save(new Partido("",provincia));
		session.save(new Partido("",provincia));
		
		provincia = new Provincia("Corrientes", pais);
		session.save(provincia);
		
		provincia = new Provincia("Entre Rios", pais);
		session.save(provincia);
		session.save(new Partido("",provincia));
		session.save(new Partido("",provincia));
		session.save(new Partido("",provincia));
		
		provincia = new Provincia("Formosa", pais);
		session.save(provincia);
		
		provincia = new Provincia("Jujuy", pais);
		session.save(provincia);
		
		provincia = new Provincia("La Pampa", pais);
		session.save(provincia);
		
		provincia = new Provincia("La Rioja", pais);
		session.save(provincia);
		
		provincia = new Provincia("Mendoza", pais);
		session.save(provincia);
		
		provincia = new Provincia("Misiones", pais);
		session.save(provincia);
		
		provincia = new Provincia("Neuquen", pais);
		session.save(provincia);
		
		provincia = new Provincia("Rio Negro", pais);
		session.save(provincia);
		session.save(new Partido("",provincia));
		session.save(new Partido("",provincia));
		
		provincia = new Provincia("Salta", pais);
		session.save(provincia);
		
		provincia = new Provincia("San Juan", pais);
		session.save(provincia);
		
		provincia = new Provincia("San Luis", pais);
		session.save(provincia);
		
		provincia = new Provincia("Santa Cruz", pais);
		session.save(provincia);
		
		provincia = new Provincia("Santa Fe", pais);
		session.save(provincia);
		session.save(new Partido("",provincia));
		
		provincia = new Provincia("Santiago del Estero", pais);
		session.save(provincia);
		
		provincia = new Provincia("Tierra del Fuego", pais);
		session.save(provincia);
		session.save(new Partido("",provincia));
		
		provincia = new Provincia("Tucuman", pais);
		session.save(provincia);
		session.save(new Partido("",provincia));
		session.save(new Partido("",provincia));
		

		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
		
		log.info("Fin main");
	}

}
