import java.util.Scanner;

public class Driver {

	public static void main(String args[]) {
		
		Passenger obj = new Passenger();
		Scanner inp = new Scanner(System.in);
		int choice;		

		do {	
		
		System.out.print(	"\nWelcome to the ticket reservation system."
						+	"\nChoose from the below options..."
						+	"\n1) Book your flight."
						+	"\n2) Edit your flight."
						+	"\n3) Cancel your flight."
						+	"\n4) View the price list."
						+	"\n5) Exit from the system.\n"
				
				
						);
				
			choice = inp.nextInt();
			
			switch(choice) {
			
			
			case 1:
			
				obj=userDetails();
				break;
			
			case 2:
					
				do {
				
				System.out.print(	"\nSelect one from the below options :"
								+	"\n1. Edit your Name."
								+	"\n2. Edit your Age."
								+	"\n3. Edit your Gender."
								+	"\n4. Edit your Address."
								+	"\n5. Edit your Passport Number."
								+	"\n6. Edit your Phone Number."
								+	"\n7. Edit your Email."
								+	"\n8. Edit your Card Number."
								+	"\n9. Edit your CVC Code."
								+	"\n10. Edit your Expiry Date of the Card."
								+	"\n11. Display Details."
								+   "\n12. Exit."
								
								
								
								);
								
					 
					 String Name ="";
					 int Age = 0;
					 char Gender=' ';
					 String Address="";
					 String Passport_Number="";
					 long Phone_Number=0;
					 String Email="";
					 long Card_Number=0;
					 int CVC=0;
					 String Exp_Date_Card="";
					 
					 choice = inp.nextInt();
					 
					
					switch(choice) {
						
					case 1:
						
						System.out.print("Enter your Name : ");
						Name += inp.nextLine();
						obj.setName(Name);
						inp.nextLine();
						
						break;
						
					case 2:
	
						System.out.print("Enter your Age ");
						Age += inp.nextInt();
						obj.setAge(Age);
						inp.nextLine();
						break;
						
					case 3:
	
						System.out.print("Enter your Gender : ");
						Gender = inp.next().charAt(0);
						obj.setGender(Gender);
						inp.nextLine();
						break;
						
					case 4:
	
						System.out.print("Enter your Address : ");
						Address += inp.nextLine();
						obj.setAddress(Address);
						inp.nextLine();
						break;
						
					case 5:
	
						System.out.print("Enter your Passport Number : ");
						Passport_Number += inp.nextLine();
						obj.setPassportNum(Passport_Number);
						inp.nextLine();
						break;
						
					case 6:
	
						System.out.print("Enter your Phone Number : ");
						Phone_Number += inp.nextLong();
						obj.setPhoneNum(Phone_Number);
						inp.nextLine();
						break;
						
					case 7:
	
						System.out.print("Enter your Email : ");
						Email += inp.nextLine();
						obj.setEmail(Email);
						inp.nextLine();
						break;
						
					case 8:
						
						System.out.print("Enter your Card Number : ");
						Card_Number += inp.nextLong();
						obj.setCardNum(Card_Number);
						inp.nextLine();
						break;
						
					case 9:
						
						System.out.print("Enter your CVC Code : ");
						CVC += inp.nextInt();
						obj.setCVC(CVC);
						inp.nextLine();
						break;
						
					case 10:
						
						System.out.print("Enter your Expiry Date of the Card : ");
						Exp_Date_Card += inp.nextLine();
						obj.setExpDate(Exp_Date_Card);
						inp.nextLine();
						break;
						
					case 11:
						obj.displayDetails();
						break;
						
					}
								
				} while(choice != 12);
				
			case 3:
				
				
			case 4:
			case 5:
				exit(0);
			
			
			}
		
		} while(choice != 5);
	
	
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
		 
		 inp2.nextLine();
		 
		 System.out.print(	"\nEnter your Gender : ");
		 Gender = inp2.next().charAt(0);
		 
		 inp2.nextLine();
		 
		
		 System.out.print(	"\nEnter your Address : ");
		 Address += inp2.nextLine();
		
		 System.out.print(	"\nEnter your Passpoer Number : ");
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
		obj.displayDetails();
		return obj;
	}

}
