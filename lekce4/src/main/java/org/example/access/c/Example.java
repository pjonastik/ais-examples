package org.example.access.c;

public class Example {
    /**
     * Show that class can invoke protected member of classes in same package
     */
    public static void accessModifiersInTheSamePackage() {
        PublicClassA a = new PublicClassA();
        a.publicMethod();
        double pubI = a.publicAttribute;

        PublicClassA a2 = new PublicClassA("protected");
        a2.protectedMethod();
        int i = a2.protectedAttribute; //(this is not usual) You usually have not public attributes associated with getter method

        PublicClassA a3 = new PublicClassA('c');
        a3.packagePrivateMethod();
        String s = a3.packagePrivateAttribute;

//        new A(2F);
//        a.privateMethod(); //COMPILATOR ERR: 'privateMethod()' has private access in 'org.example.access.a.A'
//        char c = a.privateAttribute; // COMPILATOR ERR: 'privateAttribute' has private access in 'org.example.access.a.A'
    }
}
