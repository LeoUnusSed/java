package org.crazyit.boot.c7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

public class DateFormatter implements Formatter<Date> {

    @Override
    public String print(Date object, Locale locale) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH时mm分ss秒");
            return sdf.format(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object.toString();
    }
    
    @Override
    public Date parse(String text, Locale locale) throws ParseException {
        return null;
    }
}
