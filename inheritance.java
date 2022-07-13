

class Shape{
    public void area() {
        System.out.println("display area");
    }
}
class triangle extends Shape{ //single level inheritanca
    int l=5,h=6;

    public void area(int l,int h) {
        System.out.println(0.5*l*h);
    }
}
class equilateraltraiangle extends triangle{ 
    public void area(int l,int h) {
        System.out.println(0.5*l*h);
    }

}
class circle extends Shape{ /// highirarical inheritance
    public void area(int r) {
        System.out.println(3.14*r*r);
        
    }

}

public class inheritance {
    public static void main(String[]aregs) {
        triangle t1=new triangle();
        t1.area(t1.l,t1.h);
        // bank.Account account1=new bank.Account();
        //  account1.name="manav";
        
   
    }
}
