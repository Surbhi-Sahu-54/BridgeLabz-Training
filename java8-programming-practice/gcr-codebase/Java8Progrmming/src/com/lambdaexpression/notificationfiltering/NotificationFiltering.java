package com.lambdaexpression.notificationfiltering;
import java.util.*;
import java.util.function.Predicate;

class Alert {
    String message;
    String type;   // CRITICAL, WARNING, INFO

    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }

    public String toString() {
        return type + " ALERT: " + message;
    }
}

public class  NotificationFiltering {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
            new Alert("Heart rate abnormal", "CRITICAL"),
            new Alert("Medicine reminder", "INFO"),
            new Alert("Low oxygen level", "CRITICAL"),
            new Alert("Appointment tomorrow", "INFO"),
            new Alert("Blood pressure rising", "WARNING")
        );

        // User preference: only CRITICAL alerts
        Predicate<Alert> criticalOnly =
            alert -> alert.type.equals("CRITICAL");

        System.out.println("Showing critical alerts:");
        filterAlerts(alerts, criticalOnly);

        // User preference: CRITICAL + WARNING
        Predicate<Alert> importantAlerts =
            alert -> alert.type.equals("CRITICAL")
                  || alert.type.equals("WARNING");

        System.out.println("\nShowing important alerts:");
        filterAlerts(alerts, importantAlerts);
    }

    static void filterAlerts(List<Alert> alerts,
                             Predicate<Alert> rule) {

        alerts.stream()
              .filter(rule)
              .forEach(System.out::println);
    }
}
