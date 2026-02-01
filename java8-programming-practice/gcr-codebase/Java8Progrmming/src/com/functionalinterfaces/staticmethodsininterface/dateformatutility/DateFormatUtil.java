package com.functionalinterfaces.staticmethodsininterface.dateformatutility;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateFormatUtil {

    static String format(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}
