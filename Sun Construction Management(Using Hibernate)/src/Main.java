import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		ConfigurationClass.trans();
		OwnerMain om=new OwnerMain();
		FacilitiesMain fm= new FacilitiesMain();
		Maintenance m =new Maintenance();
		DeleteUpdateClass du = new DeleteUpdateClass();
		while(true)
		{
		Scanner s = new Scanner(System.in);
		System.out.println("1. ADD NEW OWNER ");
		System.out.println("2. SEE FACILITIES ");
		System.out.println("3. SEE MAINTENANCE");
		System.out.println("4. TO REMOVE OWNER ");
		System.out.println("5. TO UPDATE FACILITIES OF OWNER");
		System.out.println("6. TO CHECK DETAILS (REPORT)");
		System.out.println("7. TO EXIT SYSTEM");
		int c = s.nextInt();
		switch(c)
		{
		case 1: 
			System.out.println("ADD OWNER");
		      om.addowner();
			break;
		case 2 :
			System.out.println("1. SEE FACILITIES DETAILS");
			System.out.println("2. ADD DETAILS IN FACILITIES");
			int b = s.nextInt();
			switch(b)
			{
			case 1: 
			{
				fm.facilitiesDetails();
				break;
			}
			case 2:{
				      fm.addfacilities();
				break;
			}
			default :
				{
					System.out.println("wrong input please enter right input");
				}
			}
			
		break;
		case 3:
			System.out.println("1. SEE MAINTENANCE DETAILS");
			System.out.println("2. ADD DETAILS IN MAINTENANCE");
			int g = s.nextInt();
			switch(g)
			{
			case 1: 
				
			 m.MaintenanceDetails();
				break;
			case 2:
			   m.Maintenanceused();
				break;
			default :
			{
				System.out.println("wrong input please enter right input");
			}
			}
			break;	
		case 4:
			   du.deleteowner();
			break;
		case 5:
			
			System.out.println("1. UPDATE FACILITIES DETAILS");
			System.out.println("2. DELETE  FACILITIES DETAILS OF OWNER");
			int l = s.nextInt();
			switch(l)
			{
			case 1: 
			{
				du.updateFacilites();
				break;
			}
			case 2:{
				du.deleteFacilities();
				break;
			}
			default :
				{
					System.out.println("wrong input please enter right input");
				}
			}
			
			break;
			
		case 6:
			System.out.println("1. CHECK OWNER DETAILS");
			System.out.println("2. CHECK THE DETAILS OF FACILITIES USED BY OWNER");
			System.out.println("3. CHECK THE DETAILS OF MAINTENANCE OF OWNERS");
			int r= s.nextInt();
			switch(r)
			{
			case 1:
			om.ownerDetails();
				break;
			case 2:
				fm.facilitiesUsedDetails();
				
				break;
			case 3:
				m.MaintenanceusedDetails();
			
				break;
				default :
					System.out.println("wrong input please enter right input");
			}
			break;
		case 7:
			System.exit(0);
			
		}
		}
    
       
	}


}
