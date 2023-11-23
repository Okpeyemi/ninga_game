abstract class Comets {
    
    protected int dmg;
    protected boolean isDead;

    public int getDmg() {
        return dmg;
    }

    public Comets(int newDmg) {
        this.dmg = newDmg;
        this.isDead = false;
    }

    public void attack(Fighter player) {
        int hpPlayer = player.getHp();
        hpPlayer -= dmg;
        player.setHp(hpPlayer);
        if (player.getHp() <= 0) {
            player.setHp(0);
            isDead = true;
            System.out.println("LE JOUEUR EST MORT!!!");
        } else {
            System.out.println("Joueur: Il en faudra plus pour me tuer!");
        }
    }
}
