package ar.com.ggc.util;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	private static final Configuration cfg = null;
	private static Logger log = Logger.getLogger(HibernateUtil.class);

	private static SessionFactory buildSessionFactory(){
		try{
//			cfg = new Configuration()
			return new Configuration().configure().buildSessionFactory(
						new StandardServiceRegistryBuilder().build()
					);
		}catch(Throwable ex){
			log.error("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
