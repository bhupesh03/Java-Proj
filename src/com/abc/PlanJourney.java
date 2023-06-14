package com.abc;

import java.util.Scanner;

public class PlanJourney {
	private String Source;
	private String Destination;
	private int NoOfPassengers;

	public void JourneyDetails() {
		Scanner JourneyInput = new Scanner(System.in);
		System.out.println("Please Enter Your Source City");
		Source = JourneyInput.next();
		System.out.println("Please Enter Your Source Destination");
		Destination = JourneyInput.next();
		System.out.println("Please Enter No Of Passengers Travelling");
		NoOfPassengers = JourneyInput.nextInt();
		JourneyInput.close();

	}

	public PlanJourney(String source, String destination, int noOfPassengers) {
		Source = source;
		Destination = destination;
		NoOfPassengers = noOfPassengers;
	}

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public int getNoOfPassengers() {
		return NoOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		NoOfPassengers = noOfPassengers;
	}

}
