package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sum_roop(int x, int y) {
    int total;
    for (int i = x; i <= y; i++) {
      total = i + total;
    }
    return total;
  }
}
