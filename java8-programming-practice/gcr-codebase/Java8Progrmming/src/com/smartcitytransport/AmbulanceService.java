package com.smartcitytransport;

public class AmbulanceService implements TransportService, EmergencyService {

	    public String getServiceName() { return "Ambulance"; }
	    public double getFare() { return 0; }
	    public String getRoute() { return "Emergency Route"; }
	    public int getDepartureTime() { return 0; }
}
