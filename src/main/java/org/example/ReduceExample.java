package org.example;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log
public class ReduceExample {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(9);
        Optional<Integer> sumUsingreduce = integerList.stream().reduce(Integer::sum);
        log.info("sum value" + sumUsingreduce);
        Optional<Integer> maxUsingreduce = integerList.stream().reduce(Integer::max);
        log.info("max value" + maxUsingreduce);
        Optional<Integer> minUsingreduce = integerList.stream().reduce(Integer::min);
        log.info("min value" + minUsingreduce);

    }

}
