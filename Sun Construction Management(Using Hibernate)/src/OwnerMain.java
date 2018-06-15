import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;

public class OwnerMain {
	//this class will add new owner and fetch owner details from table.
	
	public void addowner()
	{
	    Transaction trans=ConfigurationClass.session.beginTransaction();
	    Owner o = new Owner();
	    Scanner s = new Scanner(System.in);
	    System.out.println("ENTER FLAT NO");
	    o.setFlatno(s.nextInt());
	    System.out.println("ENTER OWNER NAME"); 
        o.setOwnername(s.next());
        ConfigurationClass.session.save(o);
        trans.commit();
        ConfigurationClass.session.close();
        s.close();
	}
   public void ownerDetails()
   {
	   Transaction trans=ConfigurationClass.session.beginTransaction();
	   Criteria cri = ConfigurationClass.session.createCriteria(Owner.class);
	   List<Owner> listOwner = cri.list();
	   System.out.println("FlatNO----OwnerName");
		for (Owner e : listOwner) {
			System.out.println(e.getFlatno()+"         "+e.getOwnername());
		}
		ConfigurationClass.session.close();
   }
}
