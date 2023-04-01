package org.task17;

public class Task17 {
    public static void main(String[] args) {
        MeasurementConverter converter = new MeasurementConverter();
        float result = converter.convert(10, ConversionType.CENTIMETERS_TO_INCHES);
        System.out.println(result);
    }
}
