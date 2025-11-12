class Bubble {

    private Sketch s;
    private float radius;
    private float x;
    private float y;
    private float xSpeed;
    private float ySpeed;
    private int borderColor;

    public Bubble(Sketch sketch) {
        s = sketch;
        radius = 20;
        x = 100;
        y = 100;
        xSpeed = 0;
        ySpeed = -1;
        borderColor = s.color(0, 0, 0);
    }

    public Bubble(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
        this.s = sketch;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;
        borderColor = s.color(0, 0, 0);
    }

    public float getRadius() {
        return radius;
    }

    public float getDiameter() {
        return radius * 2;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setColors(int border) {
        borderColor = border;
    }

    public void draw() {
        s.stroke(borderColor);
        s.noFill(); 
        s.circle(x, y, radius * 2);
        
    }

    public void move() {
        x += xSpeed;
        y += ySpeed; 

       
        if (y < -radius) {
            y = s.height + radius;
        }
    }
}
