/**
 * Fighter
 */
public interface Fighter {

    // boolean equip(Comet weapon);
    // boolean attack(Fighter target);
    void receiveDamage(Ennemi ennemi);
    // boolean moveCloseTo(Fighter target);
    // void recoverAP();
    void attack(Ennemi ennemi);

    String getName();
    int getAp();
    int getHp();

    void setHp(int hpPlayer);
}