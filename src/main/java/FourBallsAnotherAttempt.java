import processing.core.PApplet;

public class FourBallsAnotherAttempt extends PApplet {
    public static  final int HEIGHT = 680;
    public static  final int  WIDTH = 840;
    public static  final int DIAMETER = 10;
    public static  int position = 0;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for(int speed=1;speed<=4;speed++)
        {
            locateAndMoveBall(speed*position, HEIGHT*speed/5);
        }
        position+=1;
    }

    private void locateAndMoveBall (int positionX, int height)
    {
        ellipse(positionX, height, DIAMETER, DIAMETER);
    }

    public static  void main(String[] args)
    {
        PApplet.main("FourBallsAnotherAttempt", args);

    }
}

