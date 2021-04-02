package com.company;
import java.util.*;
public class Main {


        public static void main(String[] args) {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR,2002);
            cal.set(Calendar.MONTH,Calendar.AUGUST);
            cal.set(Calendar.DAY_OF_MONTH,31);
            cal.set(Calendar.HOUR_OF_DAY,19);
            cal.set(Calendar.MINUTE,30);
            cal.set(Calendar.SECOND,00);
            System.out.println("Current date: " + (cal.getTime()));
            cal.roll(Calendar.SECOND,75);
            System.out.println("Rule 1: " + (cal.getTime()));
            cal.roll(Calendar.MONTH,1);
            System.out.println("Rule 2: " + (cal.getTime()));
    }
}