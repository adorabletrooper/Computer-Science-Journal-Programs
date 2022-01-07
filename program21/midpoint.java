package program21;

public class midpoint {
    class point(int x,int y); 
    point midpoint(point endpoint1,point endpoint2)
    {
        point mid;
        mid.x=(endpoint1.x+endpoint2.x)/2;
        mid.y=(endpoint1.y+endpoint2.y)/2;
        return mid;
    }
}
