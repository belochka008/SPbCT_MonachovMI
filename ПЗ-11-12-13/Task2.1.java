package com.company;
import java.util.*;
public class Main {


        public static void main(String[] args) {

            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR,2002);
            cal.set(Calendar.MONTH,Calendar.AUGUST);
            cal.set(Calendar.DAY_OF_MONTH,31);
            System.out.println(" Initialy set date: " + (cal.getTime()));
            cal.set(Calendar.MONTH,Calendar.SEPTEMBER);
            System.out.println(" Date with month changed : " + (cal.getTime()));
            cal.set(Calendar.DAY_OF_MONTH,30);
            System.out.println(" Date with day changed : " + (cal.getTime()));

    }

}