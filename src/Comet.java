public class Comet extends Comets {
    
    private static int speed = 2;
    private static int x = 500;
    private static int y = 300;

    public Comet() {
        super(4);
    }

    public static int getSpeed() {
        return speed;
    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }
}
