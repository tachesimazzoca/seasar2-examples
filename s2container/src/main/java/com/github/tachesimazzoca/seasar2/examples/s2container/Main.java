package com.github.tachesimazzoca.seasar2.examples.s2container;

import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

import com.github.tachesimazzoca.seasar2.examples.s2container.util.Clock;

public class Main {
    public static void main(String[] args) {
        SingletonS2ContainerFactory.init();
        S2Container container = SingletonS2ContainerFactory.getContainer();
        Clock clock = (Clock) container.getComponent(Clock.class);
        System.out.println("currentTimeMills: " + clock.currentTimeMillis());
    }
}