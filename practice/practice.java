package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }
}

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  // mainの処理
  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
  }
}
