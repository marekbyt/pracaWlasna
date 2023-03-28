package org.task8;

public class Main {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(31, 35, 40, 10, false);
        Validator validator = new ParcelValidator();
        System.out.println(validator.validator(parcel));
    }
}
