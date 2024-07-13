@FunctionalInterface
public interface FunctionalInterfaceDemo {
    void singleAbsMeth();

    // compile error
//    default int hashCode(){
//        return 7;
//    }
}
