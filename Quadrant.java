public class Quadrant {
    public static void main (String[] args) 
    {

        int x=-3, y=-33;

        //find true condition of first quadrant
        if(x>0 && y>0)
            System.out.println("Quadrant I");   

        //find second quadrant
        else if(x<0 && y>0)
            System.out.println("Quadrant II");

        //To find third quadrant
        else if(x<0 && y<0) System.out.println("Quadrant III"); 

        //To find Fourth quadrant 
        else if (x > 0 && y < 0)
            System.out.println("Quadrant IV");
            
        //To find dose not lie on origin
        else if (x == 0 && y == 0)
            System.out.println("Origin");
            
        //On x-axis
        else if (y==0 && x!=0)
            System.out.println("x-axis");
            
        //On y-axis
        else if (x==0 && y!=0)
            System.out.println("y-axis");

    }
}
