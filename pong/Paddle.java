import processing.core.PApplet;

public class Paddle
{
    PApplet applet;
    private float x;
    private float y;
    private int wide;
    private int height;
    int value;

    public Paddle(PApplet applet_)
    {
        applet = applet_;
        y = applet.width / 2;
        x = applet.width - 10;

        height = 70;
        wide = 10;
        
        value = 0;
    }

    public void display()
    {
        applet.rect(x, applet.mouseY, wide, height);
        applet.fill((float)Math.random() * 255, 0, 0);
    }

    public void move()
    {

        y = applet.mouseY;
        
        value = value + 5;
        if (value > 255) 
        {
            value = 0;
        }
    }
    

    

    public float getX()
    {
        return x;
    }

    public float getY()
    {
        return y;
    }

    public int getWidth()
    {
        return wide;
    }

    public int getHeight()
    {
        return height;
    }
}