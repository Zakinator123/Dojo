package org.dojo.playground.functional;

import java.util.List;
import java.util.function.Predicate;

public class PredicateChainer<T> {
    Predicate<T> getANDedPredicates(List<Predicate<T>> predicates) {
        return predicates.stream().reduce(Predicate::and).orElse((T item) -> true);
    }

     Predicate<T> getORedPredicates(List<Predicate<T>> predicates) {
        return predicates.stream().reduce(Predicate::or).orElse((T item) -> true);
    }
}
