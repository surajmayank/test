import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Transaction;

public class FacilitiesMain {
	//this class will add facilities used by owner and check all details.
	
	@SuppressWarnings("unchecked")
	public void  facilitiesDetails()
	{
		 Transaction trans=ConfigurationClass.session.beginTransaction();;
		 Criteria cri = ConfigurationClass.session.createCriteria(FacilitiesDetails.class);
		 List<FacilitiesDetails> fdlist =cri.list();
		 for(FacilitiesDetails f : fdlist)
		 {
			 System.out.println(f.getFacilitiesId()+"   "+f.getFacilitiesName()+"  "+f.getMonthlycharge());
			 
		 }
		 trans.commit();
	}
	public void addfacilities()
	{
		 Transaction trans=ConfigurationClass.session.beginTransaction();
		 Facilities f = new Facilities(); 
		 Scanner s = new Scanner(System.in);
		//Query qry = ConfigurationClass.session.createSQLQuery("insert into faciliti_used values(:n,:n1,:n2,:n3,:n4,:n5)");
		System.out.println("ENTER OWNER-ID");
		int ownerId= s.nextInt();
		Owner o = (Owner) ConfigurationClass.session.get(Owner.class,ownerId );
		System.out.println(o.getOwnerId());
		f.setOwner(o);
		System.out.println("ENTER FACILITIES NAME");
		f.setFacilitiesname(s.next());
		System.out.println("ENTER START DATE YYYY-MM-DD");
		Date d=Date.valueOf(s.next());
		f.setStartdate(d);
		System.out.println("ENTER END DATE YYYY-MM-DD");
		Date d1=Date.valueOf(s.next());
		f.setEnddate(d1);
		System.out.println("ENTER PAYMENT STATUS");
		f.setPaymentstatus(s.nextBoolean());
		ConfigurationClass.session.save(f);
		trans.commit();
	}
	public void facilitiesUsedDetails()
	{
		 Transaction trans=ConfigurationClass.session.beginTransaction();
		 Criteria cri = ConfigurationClass.session.createCriteria(Facilities.class);
		 List<Facilities> flist= cri.list();
		 for(Facilities fc:flist)
		 {
			 System.out.println(fc.getOwner().getOwnerId()+"   "+fc.getFacilitiesname()+ "  "+fc.getStartdate()+" "+fc.getEnddate()+" "+fc.isPaymentstatus());
		 }
		 trans.commit();
		 
	}

}
