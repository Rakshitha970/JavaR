package SampleProgram;

public class Passeger
{
	private static final int UPPER = 0;
	static void allocateBerth(Passeger p) {
	    switch(p.getPrefBerth()) {
	    case UPPER:
	      if (UPPER>0) {
	        p.setAllocatedBerth(Berth.UPPER);
	        UPPER--;
	      }else if(middle>0) {
	        p.setAllocatedBerth(Berth.MIDDLE);
	        middle--;
	      }else {
	        p.setAllocatedBerth(Berth.LOWER);
	        lower--;
	      }
	    
	    case LOWER:
	    case MIDDLE:
	      
	    }
	    bkdPassengers.add(p);
	    availableTickets--;
	  }
	  private int getPrefBerth() {
		// TODO Auto-generated method stub
		return 0;
	}
	private static void bookTicket(Passenger p) {
	    if(availableTickets > 0) {
	      allocateBerth(p);
	      p.setBkdDt(LocalDateTime.now());
	      System.out.println("Ticket booked");
	    }else if(wlLimit<3) {
	      wlPassengers.add(p);
	      p.setBkdWlLimit(wlLimit);
	      wlLimit++;
	      System.out.println("Ticket in WL");
	    }else {
	      System.out.println("regret");
	    }
	    }

	
	private String BookedTicket;
	private String CancelTicket;
	private String ViewTicket;
	private String WatingList;
	public String getBookedTicket()
	{
		return BookedTicket;
	}
	
	public void setBookedTicket(String bookedTicket) 
	{
		BookedTicket = bookedTicket;
	}
	public String getCancelTicket() {
		return CancelTicket;
	}

	public void setCancelTicket(String cancelTicket) {
		CancelTicket = cancelTicket;
	}

	public String getViewTicket() {
		return ViewTicket;
	}

	public void setViewTicket(String viewTicket) {
		ViewTicket = viewTicket;
	}
	public String getWatingList() {
		return WatingList;
	}

	public void setWatingList(String watingList) {
		WatingList = watingList;
	}

	public void setPid(int pid) {
		// TODO Auto-generated method stub
		
	}

	public void setPassengerName(String pname) {
		// TODO Auto-generated method stub
		
	}


}
