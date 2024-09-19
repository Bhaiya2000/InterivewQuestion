package com.Interview.codingpractice.designpattern.singleton;

/**
 * Implementing Singleton design pattern using double check locking system
 */

public class DoubleCheckSingletonDesign {


    private static DoubleCheckSingletonDesign doubleCheckSingletonDesign;

    private DoubleCheckSingletonDesign() {

    }

    public static DoubleCheckSingletonDesign getDoubleCheckSingletonDesign() {

            if (doubleCheckSingletonDesign == null) {
                synchronized (DoubleCheckSingletonDesign.class) {
                    if (doubleCheckSingletonDesign == null) {
                        doubleCheckSingletonDesign = new DoubleCheckSingletonDesign();
                    }
                }
            }
            return doubleCheckSingletonDesign;

    }
}
