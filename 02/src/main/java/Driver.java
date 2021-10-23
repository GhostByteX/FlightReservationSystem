import java.util.LinkedList;
import java.util.Scanner;

public class Driver {

	public static void main(String args[]) {
		
		LinkedList<Flight> FlightsList=new LinkedList<Flight>();
		int fare[]= {350,400,500};
		Flight obj2=new Flight("FA123","Lahore","NewYork",23,450,"12/12/2021","23:45:00",fare,"Emirates","Boeing777");
		FlightsList.add(obj2);
		obj2=new Flight("FA128","Lisbon","Amsterdam",21,400,"12/12/2021","23:45:00",fare,"Emirates","Boeing777");
		FlightsList.add(obj2);
		fare[0]=275;
		fare[1]=325;
		fare[2]=399;
		obj2=new Flight("FA129","Lisbon","Amsterdam",23,440,"12/22/2021","01:45:00",fare,"Etihad","Boeing742");
		FlightsList.add(obj2);
		
		Passenger obj=new Passenger();
		Scanner inp = new Scanner(System.in);
		int choice;		

		do {	
		
		System.out.print(	"\nWelcome to the ticket reservation system."
						+	"\nChoose from the below options..."
						+	"\n1) Book your flight."
						+	"\n2) Edit your flight."
						+	"\n3) Cancel your flight."
						+	"\n4) Display All Flights."
						+   "\n5) Print your Ticket."
						+   "\n6) Exit.\n\n"
				
				
						);
				
			choice = inp.nextInt();
			
			switch(choice) {
			
			
			case 1:
			
				String Orig="";
				String Dest="";
				String Type="";
				obj=userDetails();
				inp.nextLine();
				System.out.print("\nEnter your Origin\n\n");
				Orig+=inp.nextLine();
				//inp.nextLine();
				System.out.print("\nEnter your Destination\n\n");
				Dest+=inp.nextLine();
				//inp.nextLine();
				System.out.print("\nEnter the Type of Class you want to Travel in e.g Economy,Business,First Class\n\n");
				Type+=inp.nextLine();
				//inp.nextLine();
				String FlightNum="";
				boolean flag=false;
				int temp=0;
				int index=0;
				for (int i=0;i<FlightsList.size();i++)
				{
					
					
					if(FlightsList.get(i).getOrigin().equals(Orig) && FlightsList.get(i).getDestination().equals(Dest))
					{
						
						FlightsList.get(i).displayFlights();
						flag=true;
						temp++;
						index=i;
						
					}
					
						
					
					
				}
				
				if(!flag)
				{
					System.out.print("\nNO FLIGHTS AVAILABLE\n\n");
				}
				
				if(temp>=2)
				{
					System.out.print("\nPlease Enter the Flight Number of the Flight You want to choose based on the Fares\n\n");
					FlightNum+=inp.nextLine();
					
					for (int i=0;i<FlightsList.size();i++)
					{
						if(FlightsList.get(i).getFlightNumber().equals(FlightNum))
						{
							FlightsList.get(i).BookTicket(obj, Type);
							
						}
					}
					
				}
				
				else if (temp==1)
				{
					FlightsList.get(index).BookTicket(obj, Type);
					
				}
				break;
			
			case 2:
			{
				String FNum="";
				String PNum="";
				//Passenger temp=new Passenger();
				int Findex=0;
				int Pindex=0;
				inp.nextLine();
				System.out.print("\nPlease Enter your Flight Number\n\n");
				FNum+=inp.nextLine();
				System.out.print("\nPlease Enter your Passport Number\n\n");
				PNum+=inp.nextLine();
				
				for (int i=0;i<FlightsList.size();i++)
				{
					if(FlightsList.get(i).getFlightNumber().equals(FNum))
					{
						Findex=i;
						for (int j=0;j<FlightsList.get(Findex).PassengersList.size();j++)
							{
								if(FlightsList.get(Findex).PassengersList.get(j).equals(PNum))
								{
									Pindex=j;
								}
							}
					}
				}
				if (Findex==-1 || Pindex==-1)
					System.out.print("\nInvalid Input\n\n");
				
				do {
					
					
					
				
				System.out.print(	"\nSelect one from the below options :"
								+	"\n1. Edit your Name."
								+	"\n2. Edit your Age."
								+	"\n3. Edit your Gender."
								+	"\n4. Edit your Address."
								+	"\n5. Edit your Phone Number."
								+	"\n6. Edit your Email."
								+	"\n7. Edit your Card Number."
								+	"\n8. Display Details."
								+   "\n9. Exit."
								
								
								
								);
								
					 
					 String Name ="";
					 int Age = 0;
					 char Gender=' ';
					 String Address="";
					 String Passport_Number="";
					 long Phone_Number=0;
					 String Email="";
					 long Card_Number=0;
					
					 
					 choice = inp.nextInt();
					 
					
					switch(choice) {
						
					case 1:
						
						System.out.print("Enter your Name : ");
						inp.nextLine();
						Name += inp.nextLine();
						FlightsList.get(Findex).PassengersList.get(Pindex).setName(Name);
					//	inp.nextLine();
						
						break;
						
					case 2:
	
						System.out.print("Enter your Age ");
						Age += inp.nextInt();
						FlightsList.get(Findex).PassengersList.get(Pindex).setAge(Age);
						//inp.nextLine();
						break;
						
					case 3:
	
						System.out.print("Enter your Gender : ");
						Gender = inp.next().charAt(0);
						FlightsList.get(Findex).PassengersList.get(Pindex).setGender(Gender);
						inp.nextLine();
						break;
						
					case 4:
	
						System.out.print("Enter your Address : ");
						inp.nextLine();
						Address += inp.nextLine();
						FlightsList.get(Findex).PassengersList.get(Pindex).setAddress(Address);
						//inp.nextLine();
						break;
						
					
					case 5:
	
						System.out.print("Enter your Phone Number : ");
						Phone_Number += inp.nextLong();
						FlightsList.get(Findex).PassengersList.get(Pindex).setPhoneNum(Phone_Number);
						inp.nextLine();
						break;
						
					case 6:
	
						System.out.print("Enter your Email : ");
						inp.nextLine();
						Email += inp.nextLine();
						FlightsList.get(Findex).PassengersList.get(Pindex).setEmail(Email);
					//	inp.nextLine();
						break;
						
					case 7:
						
						System.out.print("Enter your Card Number : ");
						Card_Number += inp.nextLong();
						FlightsList.get(Findex).PassengersList.get(Pindex).setCardNum(Card_Number);
					//	inp.nextLine();
						break;
						
					
						
					case 8:
						FlightsList.get(Findex).PassengersList.get(Pindex).displayDetails();
						break;

					
					}
								
				} while(choice != 8);
				
				break;
			}	
			case 3:
				String FNum="";
				String PNum="";
				inp.nextLine();
				System.out.print("\nPlease Enter your Flight Number\n\n");
				FNum+=inp.nextLine();
				System.out.print("\nPlease Enter your Passport Number\n\n");
				PNum+=inp.nextLine();
				
				for (int i=0;i<FlightsList.size();i++)
				{
					if(FlightsList.get(i).getFlightNumber().equals(FNum))
					{
						FlightsList.get(i).CancelFlight(PNum);
					}
				}
				
				break;
				
				
			
				
			case 4:
				
				for (int i=0;i<FlightsList.size();i++)
				{
					FlightsList.get(i).displayFlights();
				}
				break;
				
				
				
				
			case 5:
				
				String FlNum="";
				String PassNum="";
				inp.nextLine();
				System.out.print("\nPlease Enter your Flight Number\n\n");
				FlNum+=inp.nextLine();
				System.out.print("\nPlease Enter your Passport Number\n\n");
				PassNum+=inp.nextLine();
				boolean flag1=false;
				for (int i=0;i<FlightsList.size();i++)
				{
					if(FlightsList.get(i).getFlightNumber().equals(FlNum))
					{
						
						FlightsList.get(i).printTicket(PassNum);
						flag1=true;
						
					}
					
				}
				if(!flag1)
				{
					
					System.out.print("\nRECORD NOT FOUND\n\n");
				}
				
				break;
				
				
				
				
				
			case 6:
				exit(0);
			
			
			}
		
		} while(choice !=6);
	
	
	}

	private static void exit(int i) {
		// TODO Auto-generated method stub
		
	}

	public static Passenger userDetails() {
		
		Scanner inp2 = new Scanner(System.in);
		
		 String Name = "";
		 int Age = 0;
		 char Gender=' ';
		 String Address = "";
		 String Passport_Number="";
		 long Phone_Number = 0;
		 String Email="";
		 long Card_Number = 0;
		 int CVC=0;
		 String Exp_Date_Card="";
	
		 System.out.print(	"\nEnter your Name : ");
		 Name += inp2.nextLine();
		 
		 
		 System.out.print(	"\nEnter your Age : ");
		 Age += inp2.nextInt();
		 
		 while(Age<18 || Age>120)
		 {
			 System.out.print("\n Invalid Age, You need to 18 or above to Book a Flight\n\n");
			 Age+=inp2.nextInt();
		 }
		 
		 
		 inp2.nextLine();
		 
		 System.out.print(	"\nEnter your Gender : ");
		 Gender = inp2.next().charAt(0);
		 
		 inp2.nextLine();
		 
		
		 System.out.print(	"\nEnter your Address : ");
		 Address += inp2.nextLine();
		
		 System.out.print(	"\nEnter your Passport Number : ");
		 Passport_Number += inp2.nextLine();
		
		 System.out.print(	"\nEnter your Phone Number : ");
		 Phone_Number += inp2.nextLong();
		
		 inp2.nextLine();
		 
		 System.out.print(	"\nEnter your Email : ");
		 Email += inp2.nextLine();
		
		 System.out.print(	"\nEnter your Card Number : ");
		 Card_Number += inp2.nextLong();
		
		 inp2.nextLine();
		 
		 
		 System.out.print(	"\nEnter your CVC Code : ");
		 CVC += inp2.nextInt();
		 
		 inp2.nextLine();
		 
		
		 System.out.print(	"\nEnter your Expiry Date of your Card : ");
		 Exp_Date_Card += inp2.nextLine();
		
	
		Passenger obj = new Passenger(Name,Age,Gender,Address,Passport_Number,Phone_Number,Email,Card_Number,CVC,Exp_Date_Card);
		return obj;
	}

	
	
	
	
	
}
