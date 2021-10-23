import java.util.Scanner;


public class Passenger {

	private String Name;
	private int Age;
	private char Gender;
	private String Address;
	private String Passport_Number;
	private long Phone_Number;
	private String Email;
	private long Card_Number;
	private int CVC;
	private String Exp_Date_Card;
	private int SeatNum;
	private String Type;
	
	public Passenger() 
	{
		Name="";
		Age=0;
		Gender=' ';
		Address="";
		Passport_Number="";
		Phone_Number=0;
		Email="";
		Card_Number=0;
		CVC=0;
		Exp_Date_Card="";
		SeatNum=0;
		Type="";
	}

	public Passenger(String name,int age,char G,String Addr, String passportNumber, long PNum, String email, long CardNum, int cvc, String expDate) {
		
		this.Name=name;
		this.Age = age;
		this.Gender=G;
		this.Address=Addr;
		this.Passport_Number = passportNumber;
		this.Phone_Number = PNum;
		this.Email=email;
		this.Card_Number=CardNum;
		this.CVC=cvc;
		this.Exp_Date_Card=expDate;
		this.SeatNum=0;
		this.Type="";
	}

	public String getName()
	{
		return this.Name;
		
	}
	
	public void setName(String n)
	{
		
		this.Name=n;
	}
	
	public int getAge()
	{
		return this.Age;
	}
	
	public void setAge(int a)
	{
		this.Age=a;
	}
	
	public char getGender()
	{
		return this.Gender;
	}
	
	public void setGender(char g)
	{
		this.Gender=g;
	}
	
	public String getAddress()
	{
		return this.Address;
	}
	
	public void setAddress(String add)
	{
		this.Address=add;
	}
	
	public String getPassportNum()
	{
		return this.Passport_Number;
	}
	
	public void setPassportNum(String pNum)
	{
		this.Passport_Number=pNum;
	}
	
	public long getPhoneNum()
	{
		return this.Phone_Number;
	}
	
	public void setPhoneNum(long phone)
	{
		this.Phone_Number=phone;
	}
	
	public String getEmail()
	{
		return this.Email;
	}
	
	public void setEmail(String email)
	{
		this.Email=email;
	}
	
	public long getCardNum()
	{
		return this.Card_Number;
	}
	
	public void setCardNum(long CardNum)
	{
		this.Card_Number=CardNum;
	}
	
	public int getCVC()
	{
		return this.CVC;
	}
	
	public void setCVC(int cvc)
	{
		this.CVC=cvc;
	}
	
	public String getExpDate()
	{
		return this.Exp_Date_Card;
	}
	
	public void setExpDate(String expDate)
	{
		this.Exp_Date_Card=expDate;
	}
	
	public int getSeatNum()
	{
		return this.SeatNum;
	}
	
	public void setSeatNum(int S)
	{
		this.SeatNum=S;
	}
	
	public String getType()
	{
		return this.Type;
	}
	
	
	public void setType(String T)
	{
		this.Type=T;
	}
	
	
	public void displayDetails()
	{
		System.out.print("\n______________________________________________________________________________________________\n\n				PASSENGER DETAILS\n\n\n");
		System.out.print("NAME:                                     "+Name);
		System.out.print("\nAGE:                                      "+Age);
		System.out.print("\nGENDER:                                   "+Gender);
		System.out.print("\nADDRESS:                                  "+Address);
		System.out.print("\nPASSPORT NUMBER:                          "+Passport_Number);
		System.out.print("\nPHONE NUMBER:                             "+Phone_Number);
		System.out.print("\nEMAIL:                                    "+Email);
		System.out.print("\nCARD NUMBER:                              "+Card_Number);
		System.out.print("\nSEAT NUM:                                 "+SeatNum);
		System.out.print("\n\n_______________________________________________________________________________________________\n\n\n");
		
		
		
		
		
	}
	
	
	public Passenger getobject()
	{
		
		return this;
	}
	
}
