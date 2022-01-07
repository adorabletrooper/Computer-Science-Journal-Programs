package program20;


public class vol{
    double width, height, depth;
    vol(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    vol()
    {
        width = height = depth = 0;
    }
    vol(double len)
    {
        width = height = depth = len;
    }
  
    
    double volume()
    {
        return width * height * depth;
    }
}


    public static void main(String args[])
    {
        // create voles using the various
        // constructors
        vol myvol1 = new vol(10, 20, 15);
        vol myvol2 = new vol();
        vol mycube = new vol(7);
  
        double vol;
  
        // get volume of first vol
        vol = myvol1.volume();
        System.out.println(" Volume of myvol1 is " + vol);
  
        // get volume of second vol
        vol = myvol2.volume();
        System.out.println(" Volume of myvol2 is " + vol);
  
        // get volume of cube
        vol = mycube.volume();
        System.out.println(" Volume of mycube is " + vol);
    }
