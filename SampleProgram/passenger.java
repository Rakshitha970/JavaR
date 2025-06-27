package SampleProgram;

import java.time.LocalDateTime;

enum Berth
{
	UPPER,
	MIDDLE,
	LOWER,
}
public class passenger
{
	private int pID;
	private String passengerName;
	private Berth preBerth;
	private Berth allocatedBerth;
	private LocalDateTime bkdDt;
	private String currentWlLimit;
	private String bkdDtWlLimit;

	
	
	public String getBkdDtWlLimit() {
		return bkdDtWlLimit;
	}

	
	public void setBkdDtWlLimit(String bkdDtWlLimit) {
		this.bkdDtWlLimit = bkdDtWlLimit;
	}

	public int getpID() {
		return pID;
	}
	
	public void setpID(int pID) {
		this.pID = pID;
	}
	
	public String getCurrentWlLimit() {
		return currentWlLimit;
	}

	
	public void setCurrentWlLimit(String currentWlLimit) {
		this.currentWlLimit = currentWlLimit;
	}

	public String getPassengerName() {
		return passengerName;
	}
	
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	
	public Berth getPreBerth() {
		return preBerth;
	}
	
	public void setPreBerth(Berth preBerth) {
		this.preBerth = preBerth;
	}
	
	public Berth getAllocatedBerth() {
		return allocatedBerth;
	}
	
	public void setAllocatedBerth(Berth allocatedBerth) {
		this.allocatedBerth = allocatedBerth;
	}
	
	public LocalDateTime getBkdDt() {
		return bkdDt;
	}
	
	public void setBkdDt(LocalDateTime bkdDt) {
		this.bkdDt = bkdDt;
	}
}
