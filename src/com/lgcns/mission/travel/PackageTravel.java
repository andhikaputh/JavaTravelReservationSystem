package com.lgcns.mission.travel;

public class PackageTravel extends Travel {
	private int minPeople;
	
	public PackageTravel(String travelCode, String cityName, String flight, int minPeople) {
		super(travelCode, cityName, flight,"Paket Travel");
		this.minPeople = minPeople;
	}

	@Override
	public String toString() {
		return String.format("%-12s %-15s %-20s %-20s %-43s %-36s %-25s", 
				getTravelCode(), getCityName(), getFlight(), getTravelType(), minPeople + " orang", "N/A", getReserved() + " orang");
	}
	}
	
	

