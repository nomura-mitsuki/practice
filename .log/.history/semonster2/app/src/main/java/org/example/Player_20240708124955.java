package org.example;

import java.util.ArrayList;
import java.util.Random;

/**
 * プレイヤーはモンスターデッキを持つ
 *
 * Deck：MonsterのArrayList
 */
public class Player {
  String name;
<<<<<<< HEAD
=======
  int HP = 5;
>>>>>>> origin/main
  ArrayList<Monster> deck = new ArrayList<>();

  Player() {
    this.name = "user";
    drawMonsters();
  }

  Player(String name) {
    this.name = name;
    drawMonsters();
  }

  public void drawMonsters() {
    Random rand = new Random();
    for (int i = 0; i < 8; i++) {
      int r = rand.nextInt(5);
      int r2 = rand.nextInt(5);
      this.deck.add(new Monster(r, r2));
    }
  }

  public String toString() {
    String info = "";
    info += "Deck:" + this.name + "\n";
<<<<<<< HEAD
=======
    info += "HP:" + this.HP + "\n";
>>>>>>> origin/main
    for (int i = 0; i < 5; i++) {
      info += this.deck.get(i).toString();
    }
    return info;
  }

}
