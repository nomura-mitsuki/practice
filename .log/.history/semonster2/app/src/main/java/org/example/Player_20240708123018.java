import java.util.ArrayList;
import java.util.Random;

/**
 * プレイヤーはモンスターデッキを持つ
 *
 * Deck：MonsterのArrayList
 */
public class Player {
  ArrayList<Monster> deck = new ArrayList<>();

  public void drawMonsters() {
    for (int i = 0; i < 8; i++) {
      Random r = new random.() % 5;
      Random r2 = new andom() % 5;
      this.deck.add(new Monster(r, r2));
    }
  }

  public void showDeck() {
    for (Monster m : this.deck) {
      System.out.println(m);
    }
  }

}
