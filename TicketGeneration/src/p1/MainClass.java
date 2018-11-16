package p1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	static List<Fare> fares = new ArrayList();
	static List<Stage> stages = new ArrayList();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		MainClass runner = new MainClass();
		runner.intializeLists();
		int choice;
		while (true) {
			System.out.println("enter 1 for ticket generation");
			System.out.println("enter 2 to see fares");
			System.out.println("enter 3 to see stages");
			System.out.println("enter 0 to exit");
			choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				runner.generateTicket(fares, stages, 60.0, "09.00", "TELKAPALLY", "KOTI", JourneyType.FORWARD);
				break;
			case 2:
				runner.fares();
				break;
			case 3:
				runner.stages();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				try {
					throw new MyException("Wrong choice");
				} catch (MyException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public void generateTicket(List<Fare> fare, List<Stage> stages, Double avgSpeed, String startTime, String from,
			String to, JourneyType journeyType) throws IOException {
		Double fromDistance = 0.0;
		Double toDistance = 0.0;
		for (Stage stage : stages) {
			if (from.equals(stage.from)) {
				fromDistance = stage.distance;
			}
			if (to.equals(stage.from)) {
				toDistance = stage.distance;
			}

		}
		Double distance = (Double) (fromDistance - toDistance);
		Double km = 0.0;
		for (Fare f : fares) {
			if (f.start < distance && distance < f.end) {
				km = f.pricePerKM;
			}
		}
		Double totalFare = (Double) (km * distance);
		/*System.out.println("total fare"+totalFare);
		System.out.println("km"+distance);
		System.out.println("avgspeed"+avgSpeed);*/
		Double time=distance/avgSpeed;
		/*System.out.println(time);*/
		Double endTime=Double.parseDouble(startTime)+time;
		String arrivalTime=endTime+"";

		Ticket ticket = new Ticket(from, to, distance, totalFare, startTime, arrivalTime);
		File file=new File("File.txt");
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("\nTo: "+ticket.getTo()+
				"\nFrom: "+ticket.getFrom()+
				"\nDistance: "+ticket.getDistance()+
				"\nFare: "+ticket.getFare()+
				"\nDepartureTime: "+ticket.getScheduledDepartureTime()+
				"\nArrivalTime: "+ticket.getScheduledArrivalTime());
		bw.close();
		System.out.println("FileUpdated");
		
		System.out.println(ticket);
	}

	public void intializeLists() {

		fares.add(new Fare(0, 40, 0.90));
		fares.add(new Fare(41, 60, 0.80));
		fares.add(new Fare(61, 80, 0.70));
		fares.add(new Fare(81, 100, 0.65));
		fares.add(new Fare(101, 500, 0.60));

		stages.add(new Stage("KAMMAREDDYPALLY", 100.0));
		stages.add(new Stage("TELKAPALLY", 94.0));
		stages.add(new Stage("RAGUPATHIPET", 85.0));
		stages.add(new Stage("KALWAKURTHI", 70.0));
		stages.add(new Stage("VELDANDA", 60.0));
		stages.add(new Stage("THANDA", 55.0));
		stages.add(new Stage("AMANGAL", 40.0));
		stages.add(new Stage("KADTHAL", 30.0));
		stages.add(new Stage("THUKKUGUDA", 20.0));
		stages.add(new Stage("CHANDRAN GUTTA", 15.0));
		stages.add(new Stage("SANTHOSH NAGAR", 10.0));
		stages.add(new Stage("NALGONDA X ROAD", 5.0));
		stages.add(new Stage("KOTI", 1.0));
		stages.add(new Stage("HYDERABAD", 0.0));
	}

	public void fares() {
		for (Fare fare : fares) {
			System.out.println(fare);
		}
	}

	public void stages() {
		for (Stage stage : stages) {
			System.out.println(stage);
		}
	}

}
