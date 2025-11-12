

class Snowflake {
    private Sketch s;
    private float x;
    private float y;
    private float radius;
    private float ySpeed;
    private int color;

    public Snowflake(Sketch sketch) {
        s = sketch;
        x = s.random(s.width);
        y = s.random(-s.height, 0);
        radius = s.random(10, 25);
        ySpeed = s.random(1, 3); 
        color = s.color(0); 
    }

  

    public void draw() {
        s.line(x + radius, y, x - radius, y);
        s.line(x, y + radius, x, y - radius);
        s.line(x + radius * .707f, y + radius * .707f,x - radius * .707f, y - radius * .707f);
        s.line(x + radius * .707f, y - radius * .707f,x - radius * .707f, y + radius * .707f);
    }

    public void move() {
        y+= ySpeed;
        if (y > s.height + radius) {
            y = -radius;
            x = s.random(s.width);
        }   
    }
}
