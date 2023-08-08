package Exception;

class Parant { //Base class
    public static void getNames() {
        System.out.println("Have own 2BHK House");
    }
}
    class Child extends Parant //Derived class
    {
        public static void getNames(){
            System.out.println("Have own Audi Car");

        }
    }

// static is a class level keyword
    //First o
    
public class Single_Inheritance {
    public static void main(String args[]){
        Parant f=new Parant();
        f.getNames();
     
        Child s=new Child();
        s.getNames();
       
        Parant f1=new Child();
        f1.getNames();
      
    }
}

