package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  // xからyまでの合計
  public int sum_roop(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum = i + sum;
    }
    return sum;
  }

  // xからyまでの平均
  public double average(int x, int y) {
    int sum = sum(x, y);
    System.out.print(sum);
    double ave = sum / 10;
    return ave;
  }
}
