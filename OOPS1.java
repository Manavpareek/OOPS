 class pen {
    String color;
    String type;// gell,ball

    public void writen() {
        System.out.println("write somthing");

    }
    public void printcolor() {
        System.out.println(this.color);
        
    }
    

}
public class OOPS1{
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color="blue";
        pen1.type="ball";
        pen1.writen();

        pen pen2=new pen();
        pen2.color="red";
        pen2.type="gell";

        pen1.printcolor();
        pen2.printcolor();
        
    }
}

