import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FlightTest {

	
	@Test
	public void testAddandDeletePass() {
		Flight obj=new Flight();
		Passenger obj2=new Passenger("Usman",23,'M',"H34","AAF23",3453,"usmanmalik740@gmail.com",45465,343,"12/12/2029");
		boolean flag=obj.addPassenger(obj2);
		assertEquals(flag,true);
		flag=obj.DeletePassenger(obj2);
		assertEquals(flag,true);
		Passenger obj3=new Passenger();
		flag=obj.DeletePassenger(obj3);
		assertEquals(flag,false);
		
	}

	@Test
	public void testBookTicket() {
		int fare[]= {350,400,450};
		Flight obj=new Flight("FA123","Lahore","NewYork",23,450,"12/12/2021","23:45:00",fare,"Emirates","Boeing777");
		Passenger obj2=new Passenger("Usman",23,'M',"H34","AAF23",3453,"usmanmalik740@gmail.com",45465,343,"12/12/2029");
		int result=obj.BookTicket(obj2, "Economy");
		assertEquals(result,0);
		
	}
	@Test
	public void testCancelTicket() {
		int fare[]= {350,400,450};
		Flight obj=new Flight("FA123","Lahore","NewYork",23,450,"12/12/2021","23:45:00",fare,"Emirates","Boeing777");
		Passenger obj2=new Passenger("Usman",23,'M',"H34","AAF23",3453,"usmanmalik740@gmail.com",45465,343,"12/12/2029");
		int result=obj.BookTicket(obj2, "Economy");
		boolean flag=obj.CancelFlight("AAF23");
		assertEquals(flag,true);
		
		
		
	}

	
}
