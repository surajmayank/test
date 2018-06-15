import java.util.Set;

public class Owner {
	private int ownerId;
	private int Flatno;
	private String ownername;
	/*private Set<Facilities> facilities;
	private Set<MaintenancePOJO> maintenance;
	*/
	

	public int getOwnerId() {
		return ownerId;
	}

	
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}


	public int getFlatno() {
		return Flatno;
	}

	public void setFlatno(int flatno) {
		Flatno = flatno;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}


}
