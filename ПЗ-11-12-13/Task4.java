package com.company;
import java.lang.*;
public class Main {
public class Test {
  public Test() {
  }

  public static void main(String[] args) {
    Test t = new Test();
    String s1 = "Hello world !!!";
    String s2 = "Hello world !!!";
    System.out.println("String`s equally = " +
	                   (s1.equals(s2)));
    System.out.println(
        "Strings are the same = " + (s1==s2));
  }
}
}