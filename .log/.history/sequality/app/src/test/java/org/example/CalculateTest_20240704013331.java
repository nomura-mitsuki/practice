package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  void testSumRoop() {
    Calculate calc = new Calculate();
    assertEquals(5, calc.sum_roop(2, 3, 0)); // 2 + 3
    assertEquals(55, calc.sum_roop(1, 10, 0)); // 1 + 2 + ... + 10
    assertEquals(25, calc.sum_roop(1, 10, 1)); // 1 + 3 + 5 + 7 + 9 (odd)
    assertEquals(30, calc.sum_roop(1, 10, 2)); // 2 + 4 + 6 + 8 + 10 (even)
  }
}
