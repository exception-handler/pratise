package p1;

public class Ticket {
	
	String from; 
	String to; 
	Double distance; 
	Double fare; 
	String scheduledDepartureTime; 
	String scheduledArrivalTime;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Double getDistance() {
		return distance;
	}
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
	}
	public String getScheduledDepartureTime() {
		return scheduledDepartureTime;
	}
	public void setScheduledDepartureTime(String scheduledDepartureTime) {
		this.scheduledDepartureTime = scheduledDepartureTime;
	}
	public String getScheduledArrivalTime() {
		return scheduledArrivalTime;
	}
	public void setScheduledArrivalTime(String scheduledArrivalTime) {
		this.scheduledArrivalTime = scheduledArrivalTime;
	}
	@Override
	public String toString() {
		return "Ticket [from=" + from + ", to=" + to + ", distance=" + distance + ", fare=" + fare
				+ ", scheduledDepartureTime=" + scheduledDepartureTime + ", scheduledArrivalTime="
				+ scheduledArrivalTime + "]";
	}
	public Ticket(String from, String to, Double distance, Double fare, String scheduledDepartureTime,
			String scheduledArrivalTime) {
		super();
		this.from = from;
		this.to = to;
		this.distance = distance;
		this.fare = fare;
		this.scheduledDepartureTime = scheduledDepartureTime;
		this.scheduledArrivalTime = scheduledArrivalTime;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
}
