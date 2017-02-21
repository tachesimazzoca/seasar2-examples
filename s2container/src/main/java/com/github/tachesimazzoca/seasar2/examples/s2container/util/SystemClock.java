package com.github.tachesimazzoca.seasar2.examples.s2container.util;

public class SystemClock implements Clock {
    @Override
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}