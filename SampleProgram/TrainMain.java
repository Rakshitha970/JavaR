package SampleProgram;

import java.util.List;
import java.util.Scanner;

public class TrainMain
{
	 static int availableTickets=3,upper=1,
		      lower=1,middle=1,wlLimit=0;
		  static int pid=1;;
		  static List<Passeger> bkdPassengers = new ArrayList();
		  static List<Passeger>  wlPassengers = new ArrayList();
		  
		  public static void main(String[] args) {
		    System.out.println("Welcome to Train Booking");
		    Scanner s = new Scanner(System.in);
		    String isContinue = "Y";
		    while(isContinue.equalsIgnoreCase("Y")) {
		        System.out.println("1.Book ticket\n2.Cancel\n3.View\n4.WL Status");
		    
		    System.out.println("Enter your choice");
		    int choice = s.nextInt();
		    
		    switch(choice) {
		    case 1:
		      System.out.println("Enter your name");
		      s.next();
		      String pname = s.nextLine();  
		      Berth berth =null;
		      while(true) {
		        try {
		          System.out.println("Enter your Pref berth"+Arrays.toString(Berth.values()));
		          String prefberth = s.nextLine();
		          berth = Berth.valueOf(prefberth);
		          break;
		        }catch(Exception e) {
		          System.out.println("Invalid enum");
		        }
		      }
		      Passeger p= new Passeger();
		      p.setPid(pid);
		      p.setPassengerName(pname);
		      p.setPrefBerth(berth);
		      bookTicket(p);
		      pid++;
		      break;
		    case 2:
		      System.out.println("Enter ur pId");
		      int passId = s.nextInt();
		      cancelTicket(passId);
		      break;
		    case 3:
		      System.out.println("Waiting List passengers" +wlPassengers);
		      System.out.println("Booked List passengers" +bkdPassengers);
		      break;
		    case 4:
		    default:
		      System.out.println("Invalid option");
		    }
		    System.out.println("Do you want to continue Y/N");
		    isContinue = s.next();
		  }
		  }

		  private static void bookTicket(Passeger p) {
			// TODO Auto-generated method stub
			
		}

		private static void cancelTicket(int passId) {
		    List<Passenger> isBkdPass = bkdPassengers.stream()
		        .filter(e->e.getPid() == passId)
		        .collect(Collectors.toList());
		    List<Passenger> isWlPass = wlPassengers.stream()
		        .filter(e->e.getPid() == passId)
		        .collect(Collectors.toList());
		    if(isBkdPass != null && !isBkdPass.isEmpty()) {
		      //there is person in WL
		      if(wlLimit>0) {
		        System.out.println("There are person is Wl");
		        wlPassengers.get(0).setAllocatedBerth(isBkdPass.get(0).getAllocatedBerth());
		        bkdPassengers.removeIf(e->e.getPid() == passId);
		        bkdPassengers.add(wlPassengers.get(0));
		        System.out.println("Your ticket got confirmed "+wlPassengers.get(0).getPassengerName());
		        wlPassengers.remove(0);
		        wlLimit--;
		      }else {
		        bkdPassengers.removeIf(e->e.getPid() == passId);
		        if(isBkdPass.get(0).getAllocatedBerth().equals(Berth.UPPER)) {
		          upper++;
		        }
		        availableTickets++;
		      }
		    }else if( isWlPass != null && !isWlPass.isEmpty()) {
		      System.out.println("Cancelling WL passenger");
		      wlPassengers.removeIf(e->e.getPid()==passId);
		      wlLimit--;
		    }else {
		      System.out.println("Invalid passenger");
		    }
		  }

		static void allocateBerth(Passenger p) {
		    switch(p.getPrefBerth()) {
		    case UPPER:
		      if (upper>0) {
		        p.setAllocatedBerth(Berth.UPPER);
		        upper--;
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
