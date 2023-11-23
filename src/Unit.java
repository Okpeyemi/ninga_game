abstract class Unit implements Fighter {
    
    protected String name;
    protected int hp;
    protected int ap;
    protected boolean isDead;
    protected Fighter target;

    public Unit(String newName, int newHp, int newAp) {
        this.name = newName;
        this.hp = newHp;
        this.ap = newAp;
        this.isDead = false;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAp() {
        return ap;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    @Override
    public void attack(Ennemi ennemi) {
        int hpEnnemi = ennemi.getHp();
        hpEnnemi -= ap;
        ennemi.setHp(hpEnnemi);

        if (hpEnnemi <= 0) {
            ennemi.setHp(0);
            isDead = true;
            System.out.println("LE MONSTRE EST MORT!!!");
            System.out.println("Joueur: J'ai gagné!");
            if (hp > 0) {
                hp += 5;
            }
        } else {
            System.out.println("Monstre: Tu ne pourras pas me tuer avec ça!");
        }
    }
}