package com.matloyd.structurals.proxy;

import com.matloyd.structurals.proxy.originalClasses.ConcreteSubject;
import com.matloyd.structurals.proxy.originalClasses.Subject;

public class Proxy extends Subject {
    ConcreteSubject cs;

    @Override
    public void doSomeWork() {
        System.out.println("Proxy call happening now");
//Lazy initialization
        if (cs == null) {
            cs = new ConcreteSubject();
        }
        cs.doSomeWork();
    }
}
