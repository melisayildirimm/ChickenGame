
package chickengame;

public class Egg extends GameObject {

    private final int BOARD_WIDTH = 1000;
    private int egg_speed = 2;


    public Egg(int x, int y, boolean direction) {
        super(x, y);
        initMissile();
        this.x -= width / 2;
        this.egg_speed = direction ? 5 : -5;
    }

    private void initMissile() {

        loadImage("egg.png");
        getImageDimensions();
    }

    public void move() {

        x += egg_speed;

        if (x > BOARD_WIDTH || x < 0)
            visible = false;
    }
}