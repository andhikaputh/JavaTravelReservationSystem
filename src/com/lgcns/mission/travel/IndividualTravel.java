package com.lgcns.mission.travel;

public class IndividualTravel extends Travel {
	private int maxPeople;
	
	public IndividualTravel(String travelCode, String cityName, String flight, int maxPeople) {
		
		super(travelCode, cityName, flight, "Individual Travel");
		this.maxPeople=maxPeople;
	}
	
	@Override
	public void setReserved(int reserved) {
		if (reserved <= 0) {
			System.out.println("[Error] Harap pesan setidaknya 1 orang");
		} else if (reserved > maxPeople) {
			System.out.println("[Error] Jumlah reservasi melebihi kapasitas maksimal (" + maxPeople + " orang)");
		} else {
			super.setReserved(reserved);
		}
	}
	
	@Override
	public String toString() {
		return String.format("%-12s %-15s %-20s %-20s %-43s %-36s %-25s", 
				getTravelCode(), getCityName(), getFlight(), getTravelType(), "N/A", maxPeople + " orang", getReserved() + " orang");
}
}
	

	
	
	

