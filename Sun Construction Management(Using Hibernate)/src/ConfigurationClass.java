import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConfigurationClass {
	static SessionFactory sessionFactory;
	static Session session;
	public static void trans()
	{
		 Configuration conf = new Configuration();
	      //Loading configuration properties file and building Hibernate
	        sessionFactory = conf.configure("hibernate.cfg.xml").buildSessionFactory();
	       /* if(sessionFactory != null) */
           session = sessionFactory.getCurrentSession();
           session=sessionFactory.openSession();
            System.out.println(session.isOpen());
}
}
