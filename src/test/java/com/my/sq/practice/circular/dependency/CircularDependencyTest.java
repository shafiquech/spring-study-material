package com.my.sq.practice.circular.dependency;

import com.my.sq.practice.config.TestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { TestConfig.class })
public class CircularDependencyTest {
 
    @Test
    public void givenCircularDependency_whenConstructorInjection_thenItFails() {
        // Empty test; we just want the context to load
        // will throw UnsatisfiedDependencyException
    }


}