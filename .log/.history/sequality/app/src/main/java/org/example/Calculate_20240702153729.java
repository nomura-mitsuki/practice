package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  // xからyまでの合計
  public int sum_roop(int x, int y) {
    int sum = 0;
    int cnt = 0;
    for (int i = x; i <= y; i++) {
      sum = i + sum;
      cnt +
    }
    return sum;
  }
}
