package com.my.sq.practice.circular.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CircularDependencyB {
 
    private CircularDependencyA circA;
 
    /*
    This will call cir
    @Autowired
    public CircularDependencyB(CircularDependencyA circA) {
        this.circA = circA;
    }*/
    // REF : https://www.baeldung.com/circular-dependencies-in-spring
    @Autowired
    public void setCircA(@Lazy CircularDependencyA circA) {
        this.circA = circA;
    }



}