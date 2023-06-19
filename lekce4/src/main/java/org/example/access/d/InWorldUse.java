package org.example.access.d;

import org.example.access.c.PublicClassA;

public class InWorldUse {
    public static void protectedDemonstration() {
        PublicClassA a = new PublicClassA();

        a.publicMethod();
        double pubI = a.publicAttribute; //Encapsulation Note: (this is not usual) You usually have not public attributes associated with getter method

        //Compilation errors:
//        a.protectedMethod();
//        int i = a.protectedAttribute;
//
//        a.packagePrivateMethod();
//        String s = a.packagePrivateAttribute;

//        a.privateMethod();
//        char c = a.privateAttribute;
    }
}
