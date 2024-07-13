public class MethodRefDemo{
     // using lambda
     public static void main(String[] args) {

         // using lambda expression
//         FunctionalInterfaceDemo f=()-> System.out.println("implementation of abstract method ");
//         f.singleAbsMeth();

         // using method reference
         FunctionalInterfaceDemo functionalInterfaceDemo=Test::testImpl;
         functionalInterfaceDemo.singleAbsMeth();
     }
}
class Test{
    public static void testImpl(){
        System.out.println(" this is test implementation of abstract method");
    }
}