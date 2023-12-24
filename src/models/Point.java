package models;
import java.lang.Math;

public class Point {
    private double x;
    private double y;
    public Point(double x, double y){
        setX(x);
        setY(y);
    }

    public void setX(double x){

        this.x=x;
    }
    public double getX(){

        return x;
    }
    public void setY(double y){
        this.y=y;
    }
    public double getY(){
        return y;
    }

    public double getDistance(Point dest){
         double distance = Math.sqrt(Math.pow(dest.x-x,2)+Math.pow(dest.y-y,2));
         return distance;
    }
    @Override
    public String toString(){
        return "x = " + x + "y = " + y;
    }
}


