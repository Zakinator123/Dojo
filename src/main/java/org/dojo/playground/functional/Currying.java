package org.dojo.playground.functional;

import java.util.function.*;

public class Currying {
    static IntBinaryOperator getSimpleAdder() {
        // Equivalent to (num1, num2) -> num1 + num2;
        return Integer::sum;
    }

    static IntFunction<IntUnaryOperator> getCurriedAdder() {
        return num1 -> num2 -> num1 + num2;
    }
}
