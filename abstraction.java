

 abstract class Shape{
    abstract void walk();
}
class hourse{
    public void walk() {
        System.out.println("walk on 4 lages");
        
    }
}
class chicken{
    public void walk() {
        System.out.println("walk on 2 lages");
        
    }
}

public class abstraction {
    public static void main(String[]args) {
        hourse h1=new hourse();
        h1.walk();
        chicken c1= new chicken();
        c1.walk();
        
        
    }
    
}
