package util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;


import Model.bebe;
import Model.bebeMedico;
import Model.mae;
import Model.medico;
import Model.residente;


public class HibernateUtil {
  
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				
				Configuration configuration = new Configuration();
				 
				//Propriedades de conexao
				Properties prop = new Properties();
				prop.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				prop.put(Environment.URL, "jdbc:mysql://localhost:3306/HibernateEx3?createDatabaseIfNotExist=true");
				prop.put(Environment.USER, "Rodrigo");
				prop.put(Environment.PASS, "8970Roferocha");
				prop.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
				prop.put(Environment.SHOW_SQL,"true");
				prop.put(Environment.HBM2DDL_AUTO, "update");
				
				configuration.setProperties(prop);
			    configuration.addAnnotatedClass(bebe.class);
			    configuration.addAnnotatedClass(medico.class);
			    configuration.addAnnotatedClass(residente.class);
			    configuration.addAnnotatedClass(bebeMedico.class);
			    configuration.addAnnotatedClass(mae.class);
			    

			    
					ServiceRegistry registry = new StandardServiceRegistryBuilder()
							.applySettings(configuration.getProperties())
							.build();
					
					sessionFactory = configuration.buildSessionFactory(registry);
		}catch (Exception e) {
		e.printStackTrace();
	}
				
	} return sessionFactory;
		
  }
	
}
