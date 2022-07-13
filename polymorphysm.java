class Student {
    String name;
    int age;
   
    
    public void getInfo( int age) {
        System.out.println(age);
        
    }
    public void getInfo( String name) {
        System.out.println(name);
        
    }
    public void getInfo(  int age,String name) {
        System.out.println(age  +" " + name);
        
    }
    
 }
  
 public class polymorphysm {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "manav";
        s1.age = 23 ;
        // s1.getInfo(s1.name);
        s1.getInfo(s1.age);
  
        
    }
 }
 



