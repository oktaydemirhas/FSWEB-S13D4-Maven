package org.example;

public class Point {
    private int x;
    private int y;

    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX (){
        return x;
    }
    public int getY (){
        return y;
    }
    public void setX (int x){
        this.x = x;
    }
    public void setY (int y){
        this.y = y;
    }
    public double distance (Point other) {
        int dx = other.x - this.x;
        int dy = other.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public double distance () {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double distance(int a, int b) {
        int dx = a - this.x;
        int dy = b - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }


}
