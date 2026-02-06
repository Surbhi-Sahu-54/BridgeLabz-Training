package com.smartcitytransport;
import java.util.*;
import java.util.stream.Collectors;

public class SmartCityApp {
	public static void main(String[] args) {

        List<TransportService> services = Arrays.asList(
                new BusService(),
                new MetroService(),
                new TaxiService(),
                new AmbulanceService()
        );

        services.stream()
                .sorted(Comparator.comparingInt(
                        TransportService::getDepartureTime))
                .forEach(TransportService::printServiceDetails);
    }

}
