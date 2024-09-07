package com.lgcns.mission.travel;

public class Travel {
	private String travelCode;
	private String cityName;
	private String flight;
	private String travelType;
	private int reserved;

	
	public Travel(String travelCode, String cityName, String flight, String travelType) {
		super();
		this.travelCode = travelCode;
		this.cityName = cityName;
		this.flight = flight;
		this.travelType = travelType;
		this.reserved=0;
	}
	
	

	public Travel(String travelCode, String cityName, String flight) {
		super();
		this.travelCode = travelCode;
		this.cityName = cityName;
		this.flight = flight;
	}

public String getFlight() {
	return flight;
}
public String getCityName() {
	return cityName;
}

	public int getReserved() {
		return reserved;
	}

	public void setReserved(int reserved) {
		this.reserved = reserved;
	}

	public String getTravelCode() {
		return travelCode;
	}

	public String getTravelType() {
		return travelType;
	}
	
	@Override
	public String toString() {
		return String.format("%-12s %-15s %-20s %-20s %-20s", 
	    travelCode, cityName, flight, travelType, reserved);
	}
}
