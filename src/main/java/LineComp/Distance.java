package LineComp;

public class Distance
{
    public double totalDistance(int x1,int x2,int y1,int y2)
    {
        double result=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        return Math.sqrt(result);
    }
}
