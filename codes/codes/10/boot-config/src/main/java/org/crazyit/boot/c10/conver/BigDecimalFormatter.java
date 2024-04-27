package org.crazyit.boot.c10.conver;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

/**
 * 自定义格式化器，将BigDecimal进行转换
 * @author 杨恩雄`
 */
public class BigDecimalFormatter implements Formatter<BigDecimal> {

    public String print(BigDecimal object, Locale locale) {
        return "$" + object.toString() + "$";
    }

    public BigDecimal parse(String text, Locale locale) throws ParseException {
        return null;
    }
}
