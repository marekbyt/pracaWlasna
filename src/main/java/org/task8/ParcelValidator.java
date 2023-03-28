package org.task8;

public class ParcelValidator implements Validator {
    private static final int TOTAL_MAX_LENGHT = 300;
    private static final int SINGLE_MIN_LENGHT = 30;
    private static final int MAX_WEIGHT_FOR_EXPRESS = 15;
    private static final int MAX_WEIGHT_FOR_NO_EXPRESS = 30;

    @Override
    public boolean validator(Parcel input) {
        return isxyxLessThan300(input)
        && isAllDimensionsMoreThan30(input)
                && isWeightisCorect(input);
    }
    private static boolean isxyxLessThan300 (Parcel input) {
        return  (input.getxLength() + input.getyLength() + input.getzLength()) <= 300;

    }
    private static boolean isAllDimensionsMoreThan30(Parcel input) {
        return input.getxLength() > 30 && input.getyLength() <30 && input.getzLength() <30;
    }

    private static boolean isWeightisCorect (Parcel input) {
        return ((input.isExpres() && input.getWeight() > 15 ) || (!input.isExpres() && input.getWeight() > 30));
    }



}
