
public class Flight {
	
	
	private int lowestFare;
	private int highestFare;
	private int availableSeats;
	private int unavailableSeats;
	private int seatNum;
	private int size;
	private boolean[] seat;
	
	
	
	
	public Flight(int lowestFare, int highestFare, int availableSeats, int unavailableSeats, int seatNum, int size, boolean[] seat) {
		this.lowestFare = lowestFare;
		this.highestFare = highestFare;
		this.availableSeats = availableSeats;
		this.unavailableSeats = unavailableSeats;
		this.seatNum = seatNum;
		this.size = size;
		this.seat = seat;
	}


	public int getLowestFare() {
		return lowestFare;
	}


	public void setLowestFare(int lowestFare) {
		this.lowestFare = lowestFare;
	}


	public int getHighestFare() {
		return highestFare;
	}


	public void setHighestFare(int highestFare) {
		this.highestFare = highestFare;
	}


	public int getAvailableSeats() {
		return availableSeats;
	}


	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}


	public int getUnavailableSeats() {
		return unavailableSeats;
	}


	public void setUnavailableSeats(int unavailableSeats) {
		this.unavailableSeats = unavailableSeats;
	}


	public int getSeatNum() {
		return seatNum;
	}


	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public boolean[] getSeat() {
		return seat;
	}


	public void setSeat(boolean[] seat) {
		this.seat = seat;
	}


	public boolean book(int num) {
		
		if(seat[num] == false)
		{
			System.out.print("Seat not available. Please choose another seat.");
			return false;
		}
		
		else
		{
			seat[num] = true;
			System.out.print("Seat booked successfully.");
			return true;
		}
			
	}
	
	
	public boolean cancel() {
		
		if(seat[seatNum] == true)
		{
			System.out.print("Seat is not booked by anyone. Try again.");
			return false;
		}
		
		else 
		{
			seat[seatNum] = false;
			return true;			
		}
		
	}
	
	
}
