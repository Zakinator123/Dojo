package org.dojo.playground.functional;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PredicateChainerTest {
    private final List<String> unFilteredList = List.of("test2", "x3", "x2");
    private final PredicateChainer<String> predicateChainer = new PredicateChainer<>();
    private final List<Predicate<String>> predicates = List.of(
            str -> str.startsWith("test"),
            str -> str.contains("2"));

    @Test
    void getANDedPredicates() {
        var chainedPredicates = predicateChainer.getANDedPredicates(predicates);
        var filteredList = unFilteredList.stream().filter(chainedPredicates).toList();
        assertEquals(List.of("test2"), filteredList);
    }

    @Test
    void getORedPredicates() {
        var chainedPredicates = predicateChainer.getORedPredicates(predicates);
        var filteredList = unFilteredList.stream().filter(chainedPredicates).toList();
        assertEquals(List.of("test2", "x2"), filteredList);
    }
}