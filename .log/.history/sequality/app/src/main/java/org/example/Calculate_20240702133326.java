package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sum_roop(int x, int y) {
  int sum;
  for (int i = x; i <= y; i++) {
    sum = i + sum;

  }
  return sum;
  }
}
