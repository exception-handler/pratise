package p1;

public class Fare {
	int start; 
	int end; 
	double pricePerKM;
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public double getPricePerKM() {
		return pricePerKM;
	}
	public void setPricePerKM(double pricePerKM) {
		this.pricePerKM = pricePerKM;
	}
	@Override
	public String toString() {
		return "Fare [start=" + start + ", end=" + end + ", pricePerKM=" + pricePerKM + "]";
	}
	public Fare(int start, int end, double pricePerKM) {
		super();
		this.start = start;
		this.end = end;
		this.pricePerKM = pricePerKM;
	}
	public Fare() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
}
