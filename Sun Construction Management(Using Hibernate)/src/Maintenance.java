import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Maintenance {
   public void MaintenanceDetails()
   {
	   Transaction trans = ConfigurationClass.session.beginTransaction();
	   Criteria cri = ConfigurationClass.session.createCriteria(MaintenanceList.class);
	   List<MaintenanceList> mlist = cri.list();
	   for(MaintenanceList ml:mlist)
	   {
		   System.out.println(ml.getMaintenanceId()+" "+ml.getMaintenanceCharge()+" "+ml.getMaintenanceName());
	   }
	   ConfigurationClass.session.close();
   }
   public void Maintenanceused()
   {
	   Transaction trans = ConfigurationClass.session.beginTransaction();
	   MaintenancePOJO p = new MaintenancePOJO();
	   Scanner s = new Scanner(System.in);
	   System.out.println("ENTER THE OWNER_ID");
	   int ownerid=s.nextInt();
	   Owner o = (Owner)ConfigurationClass.session.get(Owner.class, ownerid);
	   System.out.println(o.getOwnerId());
	   p.setOwner(o);
	   System.out.println("ENTER THE AMOUNT");
	   p.setAmount(s.nextFloat());
	   System.out.println("ENTER THE PAYMENTSTATUS");
	   p.setPaymentstatus(s.nextBoolean());
	   System.out.println("ENTER THE PAYMENTDATE");
	   String str = s.next();
	   Date d = Date.valueOf(str);
	   p.setPaymentdate(d);
	   System.out.println("ENTER THE PAYMENTMONTH");
	   p.setPaymentmonth(s.next());
	   System.out.println(o);
	   ConfigurationClass.session.save(p);
	   trans.commit(); 
	   ConfigurationClass.session.close();
   }
  public void MaintenanceusedDetails()
  {
	  Transaction trans = ConfigurationClass.session.beginTransaction();
	  Criteria cri = ConfigurationClass.session.createCriteria(MaintenancePOJO.class);
	  List< MaintenancePOJO> mplist=cri.list();
	  for(MaintenancePOJO m :mplist)
	  {
		  System.out.println(m.getOwner().getOwnerId()+" "+m.getOwner().getFlatno()+" "+m.getAmount()+" "+
	  m.isPaymentstatus()+" "+m.getPaymentdate()+" "+m.getPaymentmonth());
	  }
	  ConfigurationClass.session.close();
  }
}
