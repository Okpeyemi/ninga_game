public class Main {
    
    public static void main(String[] args) {
        Fighter maqs = new Player();
        Ennemi vil = new Monster();
        Comets com = new Comet();

        System.out.println("HP de " + maqs.getName() + " " + maqs.getHp());
        System.out.println("HP du monstre: " + vil.getHp());

        System.out.println(maqs.getName() + " attaque le monstre!");
        maqs.attack(vil);
        System.out.println("HP du monstre: " + vil.getHp());

        System.out.println("Le monstre attaque " + maqs.getName() + "!");
        vil.moveTo(maqs);
        System.out.println("HP de " + maqs.getName() + " " + maqs.getHp());

        System.out.println("Une comete tombe sur " + maqs.getName());
        com.attack(maqs);
        System.out.println("HP de " + maqs.getName() + " " + maqs.getHp());
        System.out.println("Une comete tombe sur " + maqs.getName());
        com.attack(maqs);
        System.out.println("HP de " + maqs.getName() + " " + maqs.getHp());
        System.out.println("Une comete tombe sur " + maqs.getName());
        com.attack(maqs);
        System.out.println("HP de " + maqs.getName() + " " + maqs.getHp());
        System.out.println("Une comete tombe sur " + maqs.getName());
        com.attack(maqs);
        System.out.println("HP de " + maqs.getName() + " " + maqs.getHp());

        System.out.println(maqs.getName() + " attaque le monstre!");
        maqs.attack(vil);
        System.out.println("HP du monstre: " + vil.getHp());
        System.out.println(maqs.getName() + " attaque le monstre!");
        maqs.attack(vil);
        System.out.println("HP du monstre: " + vil.getHp());
        System.out.println(maqs.getName() + " attaque le monstre!");
        maqs.attack(vil);
        System.out.println("HP du monstre: " + vil.getHp());

        // System.out.println("Le monstre attaque " + maqs.getName() + "!");
        // vil.moveTo(maqs);
        System.out.println("HP de " + maqs.getName() + " " + maqs.getHp());
    }
}
