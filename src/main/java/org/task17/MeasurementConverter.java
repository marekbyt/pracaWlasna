package org.task17;

public class MeasurementConverter {
    public float convert(float value, ConversionType conversionType){
        // value = 10
        // type = cm na cale
        // 10mcm ile to cali
        //10 cm * przelicznk (o.39)
        return value * conversionType.getValue();
    }
    public float convert(float value, ConversionTypeWithFuncion conversionType){
return value;
    }
}
