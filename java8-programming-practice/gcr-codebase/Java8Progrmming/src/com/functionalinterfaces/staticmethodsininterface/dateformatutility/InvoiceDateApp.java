package com.functionalinterfaces.staticmethodsininterface.dateformatutility;
import java.time.LocalDate;

public class InvoiceDateApp {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        String format1 = DateFormatUtil.format(today, "dd-MM-yyyy");
        String format2 = DateFormatUtil.format(today, "MMMM dd, yyyy");
        String format3 = DateFormatUtil.format(today, "yyyy/MM/dd");

        System.out.println("Format 1: " + format1);
        System.out.println("Format 2: " + format2);
        System.out.println("Format 3: " + format3);
    }
}
