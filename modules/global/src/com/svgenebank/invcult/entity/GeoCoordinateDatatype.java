package com.svgenebank.invcult.entity;

import com.haulmont.chile.core.annotations.JavaClass;
import com.haulmont.chile.core.datatypes.impl.DoubleDatatype;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Element;

import javax.annotation.Nullable;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


@JavaClass(Double.class)
public class GeoCoordinateDatatype extends DoubleDatatype {
    public static final String NAME = "geocoordinate";
    private static final String PATTERN = "#0.000000";

    public GeoCoordinateDatatype(Element element) {
        super(element);
    }

    @Override
    public String format(Object value, Locale locale) {
        return format(value);
    }

    @Override
    public String format(Object value) {
        if (value == null) {
            return "";
        }
        NumberFormat format = new DecimalFormat(PATTERN);
        return format.format(value);
    }

    @Nullable
    @Override
    public Double parse(String value, Locale locale) throws ParseException {
        return parse(value);
    }

    @Nullable
    @Override
    public Double parse(String value) throws ParseException {
        if (StringUtils.isBlank(value)) {
            return null;
        }
        NumberFormat format = new DecimalFormat(PATTERN);
        return format.parse(value).doubleValue();
    }
}
