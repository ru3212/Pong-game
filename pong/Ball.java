import processing.core.PApplet;

public class Ball
{
    PApplet applet;
    private float x;    
    private float y;
    private float xSpeed;
    private float ySpeed;
    private int size;
    public int count;

    public Ball(PApplet applet_)
    {
        // position
        applet = applet_;
        x = applet.width / 2;   // preface ever processing keyboard
        y = applet.height / 2;  // with "applet."

        // speed
        xSpeed = 7;
        ySpeed = 7;

        // size of ball
        size = 30;

        count = 0;
    }

    public void display()
    {
        applet.ellipse(x, y, size, size);
    }

    public void move()
    {
        x += xSpeed;
        y += ySpeed;

    }
    public void checkCollision(Paddle bar)
    {
        if (y > applet.height || y < 0)
        {
            ySpeed = ySpeed * (-1);
        }

        if (x < 0 || x >applet.width + 20)
        {
            xSpeed = xSpeed * (-1);
        }

        float paddleX = bar.getX();
        float paddleY = bar.getY();
        int paddleHeight = bar.getHeight();
        int paddleWidth = bar.getWidth();

        boolean hitPaddle = (x >= paddleX) && (x <= (paddleX + paddleWidth)) &&
                            (y >= (paddleY + size/2)) && (y <= paddleY + paddleHeight);

        if (hitPaddle == true)
        {
            xSpeed = xSpeed * (-1);
            count++;
        }
    }

    public void hitCount()
    {
        System.out.println(count);
        
        if (x > applet.width)
        {
            count = 0;
            applet.fill((float)Math.random() * 255, (float)Math.random() * 255, (float)Math.random() * 255);
        }
    }
}