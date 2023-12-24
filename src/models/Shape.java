package models;
import java.util.ArrayList;
public class Shape {
    private ArrayList<Point> points;

    public Shape(){
        points=new ArrayList<>();
    }
    public void addPoint(Point point){
        points.add(point);
    }

    private double[] getSides(){
        int size=points.size();
        double[] sidesOfShape= new double [size];
        for(int i =0;i<size;i++){
            if(i==size-1){
                sidesOfShape[i]=points.get(i).getDistance(points.get(0));
                break;
            }
            sidesOfShape[i]=points.get(i).getDistance(points.get(i+1));
        }
        return sidesOfShape;
    }

    public double calculatePerimeter(){
        int sides=getSides().length;
        double Perimeter=0;
        for(int i=0;i<sides;i++) {
            Perimeter+=getSides()[i];
        }
        return Perimeter;
    }
    public double getLongestSide(){
        int sides =getSides().length;
        double samybolchoiside=getSides()[0];
        for(int i =0;i<sides;i++){
            if( samybolchoiside<getSides()[i]){
                samybolchoiside=getSides()[i];
            }
        }
        return samybolchoiside;
    }
    public double getAverageSide(){
        int sides=getSides().length;
        return calculatePerimeter()/sides;
    }
}
