package org.example;

import lombok.extern.java.Log;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@Log
public class PredictDemo {
    public static void main(String[] args) {


        Predicate<Integer> predicate = (t) -> {
            if (t % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };
        log.info("" + predicate.test(8));
        List<Integer> list = Arrays.asList(1, 2, 3, 3, 5, 6, 7, 8);
        list.stream().filter(predicate).forEach(t -> log.info("" + t));
        list.stream().filter(t -> t % 2 == 0).forEach(t -> log.info("even number " +t));
        list.stream().filter(t -> t % 2 != 0).forEach(t -> log.info("odd number " +t));
    }
}
