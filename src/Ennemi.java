abstract class Ennemi {
    
    protected int hp;
    protected int ap;
    protected boolean isDead;

    public Ennemi(int newHp, int newAp) {
        this.hp = newHp;
        this.ap = newAp;
        this.isDead = false;
    }

    public int getHp() {
        return hp;
    }

    public int getAp() {
        return ap;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public void moveTo(Fighter player) {
        int hpPlayer = player.getHp();
        hpPlayer -= ap;
        player.setHp(hpPlayer);
        if (player.getHp() <= 0) {
            player.setHp(0);
            isDead = true;
            System.out.println("LE JOUEUR EST MORT!!!");
        } else {
            System.out.println("Joueur: Il en faudra plus pour me tuer!");
        }
        // player.setHp(hpPlayer);
    }
}
