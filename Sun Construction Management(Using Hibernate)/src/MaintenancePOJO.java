import java.sql.Date;

public class MaintenancePOJO {
	private int mId;
	private float amount;
	private boolean paymentstatus;
	private Date paymentdate;
	private String paymentmonth;
	private Owner owner;
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public boolean isPaymentstatus() {
		return paymentstatus;
	}
	public void setPaymentstatus(boolean paymentstatus) {
		this.paymentstatus = paymentstatus;
	}
	public Date getPaymentdate() {
		return paymentdate;
	}
	public void setPaymentdate(Date paymentdate) {
		this.paymentdate = paymentdate;
	}
	public String getPaymentmonth() {
		return paymentmonth;
	}
	public void setPaymentmonth(String paymentmonth) {
		this.paymentmonth = paymentmonth;
	}

}
