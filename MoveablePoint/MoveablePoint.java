package MoveablePoint;

class MoveablePointn extends Point {
    private float xspeed = 0.0f;
    private float yspeed = 0.0f;

    public MoveablePointn(float x, float y) {
        super(x, y);
    }

    public MoveablePointn(float x, float y, float xspeed, float yspeed) {
        super(x, y);
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public float getXspeed() {
        return xspeed;
    }

    public void setXspeed(float xspeed) {
        this.xspeed = xspeed;
    }

    public float getYspeed() {
        return yspeed;
    }

    public void setYspeed(float yspeed) {
        this.yspeed = yspeed;
    }

    public void getSpeed() {
        float[] f = new float[2];
        f[0] = xspeed;
        f[1] = yspeed;
    }

    @Override
    public String toString() {
        return "MoveablePointn{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                '}';
    }
}
