package org.crazyit.boot.c7;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

public class BigDecimalFormatter implements Formatter<BigDecimal> {

    @Override
    public String print(BigDecimal object, Locale locale) {
        return "$" + object.toString() + "$";
    }

    @Override
    public BigDecimal parse(String text, Locale locale) throws ParseException {
        return null;
    }
}
