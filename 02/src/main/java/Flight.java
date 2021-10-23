import java.util.LinkedList;
import java.util.Scanner;

public class Flight {
	
	
	private String FlightNumber;
	private String Origin;
	private String Destination;
	private int Duration;
	private int NoOfSeats;
	private int AvailSeats;
	private int TypeOfSeats[]=new int [3];
	private boolean SeatStatus[];
	private String Date;
	private String Time;
	private int Fares[]=new int[3];  //stores Economy Class at Index 0, Business Class at Index 1, First Class at Index 2
	private String Airline_Name;
	private String Plane_Name;
	public LinkedList<Passenger> PassengersList=new LinkedList<Passenger>();
	
	
	
	public Flight()
	{
		
	}
	
	
	public Flight(String FNum, String Orig, String Desti, int Dur, int Seats, String D,String T,int[] Fare,String Airline,String Plane)
	{
		this.FlightNumber=FNum;
		this.Origin=Orig;
		this.Destination=Desti;
		this.Duration=Dur;
		this.NoOfSeats=Seats;
		this.AvailSeats=Seats;
		this.TypeOfSeats[0]=NoOfSeats/2;   //Economy
		this.TypeOfSeats[1]=(NoOfSeats-this.TypeOfSeats[0])/2;   //Business
		this.TypeOfSeats[2]=NoOfSeats - (this.TypeOfSeats[0]+this.TypeOfSeats[1]);   //First Class
		SeatStatus=new boolean[this.NoOfSeats];
		for (int i=0;i<NoOfSeats;i++)
		{
			SeatStatus[i]=false;
		}
		this.Date=D;
		this.Time=T;
		
		for (int i=0;i<3;i++)
		{
			this.Fares[i]=Fare[i];
		}
		
		this.Airline_Name=Airline;
		this.Plane_Name=Plane;
		this.PassengersList=new LinkedList<Passenger>();
	}


	public String getFlightNumber()
	{
		return this.FlightNumber;
	}
	
	public void setFlightNumber(String FNum)
	{
		this.FlightNumber=FNum;
	}
	
	public String getOrigin()
	{
		return this.Origin;
	}
	
	public void setOrigin(String Orig)
	{
		this.Origin=Orig;
	}
	
	public String getDestination()
	{
		return this.Destination;
	}
	
	public void setDestination(String Desti)
	{
		this.Destination=Desti;
	}
	
	public int getDuration()
	{
		return this.Duration;
	}
	
	public void setDuration(int Dur)
	{
		this.Duration=Dur;
	}
	
	public int getNoOfSeats()
	{
		return this.NoOfSeats;
	}
	
	public void setNoOfSeats(int Seats)
	{
		this.NoOfSeats=Seats;
	}
	
	public boolean[] getSeatStatus()
	{
		return this.SeatStatus;
	}
	
	public boolean getSeatStatusofOneSeat(int SeatNum)
	{
		return this.SeatStatus[SeatNum];
	}
	
	public void setSeatStatustoTrue(int SeatNum)
	{
		this.SeatStatus[SeatNum]=true;
	}
	
	public void setSeatStatustoFalse(int SeatNum)
	{
		this.SeatStatus[SeatNum]=false;
	}
	
	public String getDate()
	{
		return this.Date;
	}
	
	public void setDate(String D)
	{
		this.Date=D;
	}
	
	public String getTime()
	{
		return this.Time;
	}
	
	public void setTime(String T)
	{
		this.Time=T;
	}
	
	public int getEcoFare()
	{
		return this.Fares[0];
	}
	
	public int getBusinessFare()
	{
		return this.Fares[1];
	}
	
	public int getFirstClassFare()
	{
		return this.Fares[2];
	}
	
	public int[] getAllFares()
	{
		return this.Fares;
	}
	
	public void setEcoFare(int F)
	{
		this.Fares[0]=F;
	}
	
	public void setBusinessFare(int F)
	{
		this.Fares[1]=F;
	}
	
	public void setFirstClassFare(int F)
	{
		this.Fares[2]=F;
	}
	
	public void setAllFares(int[] F)
	{
		for (int i=0;i<3;i++)
		{
			this.Fares[i]=F[i];
		}
	}
	
	public String getAirline()
	{
		return this.Airline_Name;
	}
	
	public void setAirline(String AName)
	{
		this.Airline_Name=AName;
	}
	
	public String getPlaneName()
	{
		return this.Plane_Name;
	}
	
	public void setPlaneName(String PName)
	{
		this.Plane_Name=PName;
	}
	
	public boolean addPassenger(Passenger P)
	{
		if(!PassengersList.contains(P))
		{
			PassengersList.add(P);
			System.out.print("\nPassenger Added Successfully\n\n");
			return true;
		}
		System.out.print("\nPassenger already exists\n\n");
		return false;
	}
	
	public boolean DeletePassenger(Passenger P)
	{
		if(PassengersList.contains(P))
		{
			PassengersList.remove(P);
			System.out.print("\nPassenger Deleted Successfully\n\n");
			return true;
		}
		System.out.print("\nPassenger Doesn't Exist\n\n");
		return false;
	}
	
	public Passenger getPassengerObject(int index)
	{
		return this.PassengersList.get(index);
	}
	
	public <PassengersList> PassengersList getAllPassengers()
	{
		return (PassengersList) this.PassengersList;
	}
	
	public int BookTicket(Passenger P,String Type)
	{
		int T=-1;
		if(Type.equals("Economy"))
			T=0;
		else if (Type.equals("Business"))
			T=1;
		else if (Type.equals("First Class"))
			T=2;
		else
			System.out.print("\nInvalid Input\n\n");
		
		if(T==0)
		{
			System.out.print("\nECONOMY CLASS\n\n");
			for (int i=0;i<this.TypeOfSeats[0];i++)
			{
				if(this.SeatStatus[i]==false)
				{
					this.SeatStatus[i]=true;
					this.AvailSeats--;
					System.out.print("\nSEAT BOOKED SUCCESSFULLY\n\n");
					if(PassengersList.contains(P) && PassengersList!=null)
					{
						System.out.print("\nPassenger Has Already Booked a Ticket for this Flight\n\n");
						return -1;
					}
					else
					PassengersList.add(P);
					P.setSeatNum(i);
					P.setType(Type);
					System.out.print("\nPAYMENT SUCCESFULLY DONE\n\n");
					return i;
				}
			}
			System.out.print("\nNO SEATS AVAILABLE\n\n");
			return -1;
		}
		
		if(T==1)
		{
			System.out.print("\nBUSINESS CLASS\n\n");
			for (int i=this.TypeOfSeats[0];i<this.TypeOfSeats[0]+this.TypeOfSeats[1];i++)
			{
				if(this.SeatStatus[i]==false)
				{
					this.SeatStatus[i]=true;
					this.AvailSeats--;
					System.out.print("\nSEATS BOOKED SUCCESSFULLY\n\n");
					if(PassengersList.contains(P))
					{
						System.out.print("\nPassenger Has Already Booked a Ticket for this Flight\n\n");
						return -1;
					}
					else
						PassengersList.add(P);
					P.setSeatNum(i);
					P.setType(Type);
					System.out.print("\nPAYMENT SUCCESFULLY DONE\n\n");
					return i;
				}
			}
			System.out.print("\nNO SEATS AVAILABLE\n\n");
			return -1;
		}
		
		if(T==2)
		{
			System.out.print("\nFIRST CLASS\n\n");
			for (int i=this.TypeOfSeats[0]+this.TypeOfSeats[1];i<this.NoOfSeats;i++)
			{
				if(this.SeatStatus[i]==false)
				{
					this.SeatStatus[i]=true;
					this.AvailSeats--;
					System.out.print("\nSEATS BOOKED SUCCESSFULLY\n\n");
					if(PassengersList.contains(P))
					{
						System.out.print("\nPassenger Has Already Booked a Ticket for this Flight\n\n");
						return -1;
					}
					
					else
						PassengersList.add(P);
					P.setSeatNum(i);
					P.setType(Type);
					System.out.print("\nPAYMENT SUCCESFULLY DONE\n\n");
					return i;
				}
			}
			System.out.print("\nNO SEATS AVAILABLE\n\n");
			return -1;
		}
		
		
		
		return -1;
	}
	
	
	public boolean CancelFlight(String PassportNum)
	{
		int SeatNum=0;
		for (int i=0;i<PassengersList.size();i++)
		{
			if (PassengersList.get(i).getPassportNum().equals(PassportNum))
			{
				SeatNum=PassengersList.get(i).getSeatNum();
				PassengersList.remove(PassengersList.get(i).getobject());
				System.out.print("\nFlight Cancelled Successfully\n\n");
				this.SeatStatus[SeatNum]=false;
				this.AvailSeats++;
				return true;
			}
		}
		
		System.out.print("\nPASSENGER NOT FOUND\n\n");
		return false;
	}
	
	public void printTicket(String PassportNumber)
	{
		boolean flag=false;
		for(int i=0;i<PassengersList.size();i++)
		{
			if(PassengersList.get(i).getPassportNum().equals(PassportNumber))
			{
				System.out.print("\n\n____________________________________________________________________________\n 				TICKET				\n\n");
				System.out.print("\nFLIGHT NUMBER:                    "+this.FlightNumber);
				System.out.print("\nORIGIN:                           "+this.Origin);
				System.out.print("\nDESTINATION:                      "+this.Destination);
				System.out.print("\nDURATION:                         "+this.Duration+" Hours");
				System.out.print("\nDATE:                             "+this.Date);
				System.out.print("\nTIME:                             "+this.Time);
				String Type="";
				Type=this.PassengersList.get(i).getType();
				if(Type.equals("Economy"))
				{
					System.out.print("\nFARE:                             $"+this.Fares[0]);
				}
				else if(Type.equals("Business"))
				{
					System.out.print("\nFARE:                             $"+this.Fares[1]);
				}
				
				else if(Type.equals("First Class"))
				{
					System.out.print("\nFARE:                             $"+this.Fares[2]);
				}
				
				System.out.print("\nAIRLINE NAME:                     "+this.Airline_Name);
				System.out.print("\nPLANE NAME:                       "+this.Plane_Name);
				this.PassengersList.get(i).displayDetails();
				flag=true;
				
			}
			
		}
		if(!flag)
		{
			
			System.out.print("\nRECORD NOT FOUND\n\n");
		}
		
		
		
	
	}
	
	public void displayFlights()
	{
		System.out.print("\n\n________________________________________________________________\n                  ALL FLIGHTS\n");
		System.out.print("\nFLIGHT NUMBER:                    "+this.FlightNumber);
		System.out.print("\nORIGIN:                           "+this.Origin);
		System.out.print("\nDESTINATION:                      "+this.Destination);
		System.out.print("\nDURATION:                         "+this.Duration+" Hours");
		System.out.print("\nDATE:                             "+this.Date);
		System.out.print("\nTIME:                             "+this.Time);
		System.out.print("\nNUMBER OF SEATS:                  "+this.NoOfSeats);
		System.out.print("\nAVAILABLE SEATS:                  "+this.AvailSeats);
		
		
		System.out.print("\nECONOMY CLASS FARE:               $"+this.Fares[0]);
		System.out.print("\nBUSINESS CLASS FARE:              $"+this.Fares[1]);
		System.out.print("\nFIRST CLASS FARE:                 $"+this.Fares[2]);
		
		
		
		System.out.print("\nAIRLINE NAME:                     "+this.Airline_Name);
		System.out.print("\nPLANE NAME:                       "+this.Plane_Name);
		System.out.print("\n\nDISPLAY ALL PASSENGERS\n\n");
		for (int i=0;i<PassengersList.size();i++)
		{
			System.out.print("\nPASSENGER NUMBER:    "+i+1);
			PassengersList.get(i).displayDetails();
		}
		
		
	}
	
}
