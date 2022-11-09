package org.example;

import lombok.extern.java.Log;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

@Log
public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> {
            return "hi Rushi this is empty";
        };
        List<String> list = Arrays.asList("a", "b");
        List<String> list1 = Arrays.asList();
        log.info(list.stream().findAny().orElseGet(stringSupplier));
        log.info(list1.stream().findAny().orElseGet(stringSupplier));

    }

}
