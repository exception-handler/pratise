package p1;

public class Stage {
	String from; 
	Double distance;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public Double getDistance() {
		return distance;
	}
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "Stage [from=" + from + ", distance=" + distance + "]";
	}
	public Stage(String from, Double distance) {
		super();
		this.from = from;
		this.distance = distance;
	}
	public Stage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
