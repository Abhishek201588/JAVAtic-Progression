class AreaC 
{ 
    int length, width;   
    AreaC(int length, int width) 
    {
        this.length = length;
        this.width = width;
    }
    int calArea() 
    {
        return length * width;
    }
}

class VolumeC extends AreaC 
{ 
    int height;
    VolumeC(int length, int width, int height) 
    {
        super(length, width);
        this.height = height;
    }
    int calVolume() 
    {
        return length * width * height;
    }
}

public class AreaRectangle
{
    public static void main(String[] args) 
    {
        AreaC s = new AreaC(10, 6);
        System.out.println("Area  = "+s.calArea());
        VolumeC v = new VolumeC(10, 5, 4);
        System.out.println("Area 2 = "+v.calArea());
        System.out.println("Volume of Rectangle = "+v.calVolume());
    }
}
