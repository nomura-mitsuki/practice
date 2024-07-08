/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class MonsterTest {
  @Test
  public void testSummonMonster() {
    Monster monster = new Monster(0, 1);
    assertEquals("スライム", monster.summonMonster(0));
    assertEquals("サハギン", monster.summonMonster(1));
    assertEquals("ドラゴン", monster.summonMonster(2));
    assertEquals("デュラハン", monster.summonMonster(3));
    assertEquals("シーサーペント", monster.summonMonster(4));
  }

  @Test
  public void testToString() {
    Monster monster1 = new Monster(2, 5);
    assertEquals("ドラゴン:レア度[5]\n", monster1.toString());
    Monster monster2 = new Monster(4, 3);
    assertEquals("シーサーペント:レア度[3]\n", monster2.toString());
  }

  @Test
  public void testMonsterConstructor() {
    Monster monster = new Monster(1, 10);
    assertEquals("スーパーサハギン", monster.summonMonster(1));
  }
}
