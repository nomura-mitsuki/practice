/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    System.out.println(
        "Sum of 2 and 3 is " + new Calculate().sum_roop(2, 3, 0) + "." + "Average is "
            + new Calculate().average(1, 10) + ".");
    System.out.println(new Calculate().sum_roop(1, 10, 1));
    System.out.println(new Calculate().sum_roop(1, 10, 2));
    System.out.println(new Calculate().average(1, 10));
  }
}
