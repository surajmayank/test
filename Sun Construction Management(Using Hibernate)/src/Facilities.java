import java.sql.Date;

public class Facilities {
	
	private Owner owner;
	private int id;
	private String facilitiesname;
	private Date startdate;
	private Date enddate;
	private boolean paymentstatus;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public String getFacilitiesname() {
		return facilitiesname;
	}
	public void setFacilitiesname(String facilitiesname) {
		this.facilitiesname = facilitiesname;
	}
	
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public boolean isPaymentstatus() {
		return paymentstatus;
	}
	public void setPaymentstatus(boolean paymentstatus) {
		this.paymentstatus = paymentstatus;
	}
	
	

}
