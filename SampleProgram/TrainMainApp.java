package SampleProgram;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;

public class TrainMainApp 
{
	static int availableTickets=3, UPPER=1,MIDDLE=1,LOWER=1,WLList=0;
	static int pidCounter=1;
	
	static List<passenger> bkdpassenger=new ArrayList<passenger>();
	static List<passenger> wlpassenger=new ArrayList<passenger>();
	
	private static int wlLimit;
	public static void main(String[] args)
	{
		System.out.println("welcome to Trainapp");
		Scanner sc=new Scanner(System.in);
		String isContiue="y";
		
		while(isContiue.equalsIgnoreCase("y"))
		{
			System.out.println("1.BookedTickets\n2.ViewTicket\n3.cancelTicket\nwllist");
			System.out.println("Enter your choice");
			int choice =sc.nextInt();
			
			
			switch(choice)
			{
			case 1:
				System.out.println("enter your name");
				sc.nextLine();
				String pname=sc.nextLine();
				Berth berth=null;
				while(true)
				{
				try 
				{
					System.out.println("enter the preferred berth"+ Arrays.toString(Berth.values()));
					String preberth=sc.nextLine();
					berth=Berth.valueOf(preberth);
					break;
				}
				
				catch(Exception e)
				{
					System.out.println("Invalid enum");
			}
		}
	
			passenger p=new passenger();
			p.setpID(pidCounter);
			p.setPassengerName(pname);
			p.setPreBerth(berth);
			bookTicket(p);
			pidCounter++;
			break;
			
			case 2:
				System.out.println("enter ur pidCounter");
				int passID=sc.nextInt();
				cancelTicket(passID=1);
				System.out.println("Ticket is cancel");
				break;
				
			case 3:
				System.out.println("waiting list passenger" +wlpassenger);
				System.out.println("Booked list passenger" +bkdpassenger);
				break;
				
			case 4:
				System.out.println("Enter your Pid");
		        int Wlchecked = sc.nextInt();
		        List<passenger> isWlpass = wlpassenger.stream().filter(e -> e.getpID() == Wlchecked).collect(Collectors.toList());

		        if (isWlpass != null && !isWlpass.isEmpty()) {
		            System.out.println("Booked WL limit: " + isWlpass.get(0).getBkdDt());
		            System.out.println("Current WL limit: " + isWlpass.get(0).getCurrentWlLimit());
		        } else {
		           // wlpassenger.forEach(e -> e.setCurrentWlLimit(wlLimit));
		            System.out.println("Your ID is not in WL");
		       break;
		        }
		       
	        default:
	      System.out.println("Invalid option");
	    }
	    System.out.println("Do you want to continue Y/N");
	    isContiue = sc.next();

		        

		}
	}
	
	private static void cancelTicket(int passID)
	{
		List<passenger> isBkdpass=bkdpassenger.stream().filter(e -> e.getpID() == passID).collect(Collectors.toList());
		List<passenger> isWlpass=wlpassenger.stream().filter(e -> e.getpID() == passID).collect(Collectors.toList());
		if(isBkdpass !=null && ! isBkdpass.isEmpty())
		{
			if(wlLimit>0)
			{
				System.out.println("there is person in wl");
				
				wlpassenger.get(0).setAllocatedBerth(isBkdpass.get(0).getAllocatedBerth());
				bkdpassenger.removeIf(e->e.getpID() == passID);
				
				bkdpassenger.add(wlpassenger.get(0));
				System.out.println("your ticket got confirmed" +wlpassenger.get(0).getPassengerName());
				wlpassenger.remove(0);
				wlLimit--;
			}
			else
			{
				bkdpassenger.removeIf(e->e.getpID()== passID);
					if(isBkdpass.get(0).getAllocatedBerth().equals(Berth.UPPER))
					{
						upper++;
					}
					availableTicket++;
			}
		}
			else if(isWlpass!= null&&!isWlpass.isEmpty())
			{
				System.out.println("cancelling WLpassenger");
				wlpassenger.removeIf(e->e.getpID()==passID);
				wlLimit--;
			}
			else {
				System.out.println("invaild passenger");
			}
	}
	
			
			
			
			private static void allocatedBerth(passenger p) 
			{
				switch(p.getPreBerth())
				{
				case UPPER:
					if(upper > 0)
					{
						p.setAllocatedBerth(Berth.UPPER);
						upper--;
					}
					else if(middle > 0)
					{
						p.setAllocatedBerth(Berth.MIDDLE);
						middle--;
					}
					else(lower > 0)
					{
						p.setAllocatedBerth(Berth.LOWER);
						lower--;
					}
					
				case LOWER;
				case MIDDLE;
				}
			BkdDtpassenger.add(p);
			availableTicket--;
			}
			
			
			
			
			private static void bookTicket(passenger p)
			{
				if(availableTickets >0)
				{
					allocatedBerth(p);
					p.setBkdDt(LocalDateTime.now());
					System.out.println("Ticket booked");
				}
				else if(wlLimit <3)
				{
					wlpassenger.add(p);
					int bkdDtWlLimit;
					p.setBkdDtWlLimit(wlLimit);
					wlLimit++;
					System.out.println("Ticket in WL");
					}
				else
				{
					System.out.println("regret");
				}
				
			}
}