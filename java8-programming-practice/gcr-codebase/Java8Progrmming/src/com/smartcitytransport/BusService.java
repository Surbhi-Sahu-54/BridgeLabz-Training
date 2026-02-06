package com.smartcitytransport;

	public class BusService implements TransportService {

	    public String getServiceName() { return "Bus"; }
	    public double getFare() { return 30; }
	    public String getRoute() { return "A-B"; }
	    public int getDepartureTime() { return 540; }
}
