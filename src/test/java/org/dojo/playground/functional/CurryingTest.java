package org.dojo.playground.functional;

import org.junit.jupiter.api.Test;

import static org.dojo.playground.functional.Currying.*;
import static org.junit.jupiter.api.Assertions.*;

class CurryingTest {

    @Test
    void getSimpleAdderTest() {
        assertEquals(5, getSimpleAdder().applyAsInt(2,3));
    }

    @Test
    void getCurriedAdderTest() {
        var curriedAdder = getCurriedAdder().apply(4);
        assertEquals(10, curriedAdder.applyAsInt(6));
        assertEquals(13, curriedAdder.applyAsInt(9));
    }
}