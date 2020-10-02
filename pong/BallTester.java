import processing.core.PApplet;

public class BallTester extends PApplet
{
    Ball b;
    
    public static void main(String[] args)
    {
        PApplet.main("BallTester");
    }
    
    public void settings()
    {
        size(500, 500);
    }
    
    public void setup()
    {
        b = new Ball(this);     // "this" is whatever object is calling
                                // this method.  In this case, "this is
                                // the PApplet.
    }
    
    public void draw()
    {
        background(0);
        b.move();
        b.display();
    }
}