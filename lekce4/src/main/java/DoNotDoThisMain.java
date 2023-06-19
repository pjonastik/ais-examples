public class DoNotDoThisMain {

    public static void main(String[] args) {
        ClassInUnamedPackage classInUnamedPackage = new ClassInUnamedPackage();
        //PLEASE DO NOT DO THIS!
        //Unnamed packages are provided by the Java SE platform principally for convenience
        // when developing small or temporary applications or when just beginning development.
    }
}
