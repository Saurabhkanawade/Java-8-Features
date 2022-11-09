package org.example;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
@Log
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumer = t -> System.out.println(t);
       // consumer.accept(9);
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 6);
       list1.stream().forEach(consumer);
       //list1.stream().forEach(t -> log.info("" +t));

    }
}
