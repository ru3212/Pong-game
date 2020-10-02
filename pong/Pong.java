import processing.core.PApplet;

public class Pong extends PApplet
{
    Ball ball;
    Paddle paddle;
    
    public static void main(String[] args)
    {
        PApplet.main("Pong");
    }

    public void settings()
    {
        size(500, 500);
    }

    public void setup()
    {
        ball = new Ball(this);
        paddle = new Paddle(this);
    }

    public void draw()
    {
        background(50);
        ball.move();
        ball.display();
        paddle.display();
        paddle.move();
        ball.checkCollision(paddle);
        ball.hitCount();
        
    }

}
