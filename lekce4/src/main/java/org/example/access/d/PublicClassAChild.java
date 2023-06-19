package org.example.access.d;

import org.example.access.c.PublicClassA;

public class PublicClassAChild extends PublicClassA {
    public void testAccessModifiers() {
        double publicAttribute = super.publicAttribute;
        int protectedAttribute = super.protectedAttribute;
//        String s = super.packagePrivateAttribute;
//        char c = super.privateAttribute;
    }
}
