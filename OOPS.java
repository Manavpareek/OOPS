class Student {
    String name;
    int age;
   
    // public void getInfo() {
    //     System.out.println("The name of this Student is " + this.name);
    //     System.out.println("The age of this Student is " + this.age);
    // }
    public void getInfo( int age) {
        System.out.println(age);
        
    }
    public void getInfo( String name) {
        System.out.println(name);
        
    }
 }
  
 public class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "manav";
        s1.age = 23 ;
        s1.getInfo(s1.name);
  
        // Student s2 = new Student();
        // s2.name = "Shradha";
        // s2.age = 22;
        // s2.getInfo();
    }
 }
 


