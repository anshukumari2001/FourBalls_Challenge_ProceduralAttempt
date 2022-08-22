import processing.core.PApplet;

public class FourBalls extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    private int ball1Position, ball2Position, ball3Position, ball4Position =0;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        moveBall1();
        moveBall2();
        moveBall3();
        moveBall4();

    }

    private void moveBall1()
    {
        ellipse(ball1Position, HEIGHT/5, DIAMETER, DIAMETER);
        ball1Position+=1;
    }

    private void moveBall2()
    {
        ellipse(ball2Position, 2*HEIGHT/5, DIAMETER, DIAMETER);
        ball2Position+=2;
    }

    private void moveBall3()
    {
        ellipse(ball3Position, 3*HEIGHT/5, DIAMETER, DIAMETER);
        ball3Position+=3;
    }

    private void moveBall4()
    {
        ellipse(ball4Position, 4*HEIGHT/5, DIAMETER, DIAMETER);
        ball4Position+=4;
    }

    public static void main(String[] args)
    {
        PApplet.main("FourBalls", args);
    }
}
