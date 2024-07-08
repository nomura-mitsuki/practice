package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  // xからyまでの合計
  public int sum_roop(int x, int y) {
    int sum = 0;
    int sum_odd = 0;
    int sum_even = 0;
    int mode = 0;
    for (int i = x; i <= y; i++) {
      sum = i + sum;
      if (i % 2 == 0) {
        sum_even = i + sum_even;
      } else if (i % 2 == 1) {
        sum_odd = i + sum_odd;
      }
    }

    if (mode == 1) {
      return su
    }
    return sum;
  }

  // xからyまでの平均
  public double average(int x, int y) {
    double sum = 0;
    sum = this.sum_roop(x, y);
    double ave = sum / (y - x + 1);
    return ave;
  }
}
