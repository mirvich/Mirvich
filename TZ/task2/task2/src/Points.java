public class Points {
    float x;
    float y;

    Points(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float getDistanceToCentre(Points center) {
        float distance = (float)Math.sqrt(Math.pow((double)(this.x - center.getX()), 2.0) + Math.pow((double)(this.y - center.getY()), 2.0));
        return distance;
    }
}
