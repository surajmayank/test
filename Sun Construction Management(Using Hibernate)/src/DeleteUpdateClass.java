import java.io.Console;
import java.util.Scanner;

import javax.security.sasl.SaslClient;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Transaction;

public class DeleteUpdateClass {
	public void deleteowner()
	{
		Transaction trans = ConfigurationClass.session.beginTransaction();
		String query="delete from Owner where ownerId= :ownerId";
	    Query qry = ConfigurationClass.session.createQuery(query);
	    Scanner s = new Scanner(System.in);
	    System.out.println("ENTER THE OWNER ID");
	    qry.setInteger("ownerId", s.nextInt());
	    qry.executeUpdate();
	    trans.commit();
	    ConfigurationClass.session.close();
	}
public void updateFacilites()
{
	Transaction trans = ConfigurationClass.session.beginTransaction();
	String query="update Facilities set facilitiesname= :facilitiesname where OWNER_ID= :ownerId";
	Query  qry=ConfigurationClass.session.createQuery(query);
	Scanner s = new Scanner(System.in);
	System.out.println("PLEASE ENTER OWNER ID YOU WANT TO UPDATE");
	qry.setInteger("ownerId", s.nextInt());
	System.out.println("ENTER FACILITIES NAME YOU WANT TO UPDATE");
	//Console c=System.console();
	//System.out.println(c);
	qry.setString("facilitiesname", s.next());
	qry.executeUpdate();
	trans.commit();
	ConfigurationClass.session.close();
}
public void deleteFacilities()
{
	Transaction trans = ConfigurationClass.session.beginTransaction();
	String query="delete from Facilities where OWNER_ID = :ownerId";
    Query qry = ConfigurationClass.session.createQuery(query);
    Scanner s = new Scanner(System.in);
    System.out.println("ENTER THE OWNER ID");
    qry.setInteger("ownerId", s.nextInt());
    qry.executeUpdate();
    trans.commit();
    ConfigurationClass.session.close();
}
}
