package org.example;

import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log
public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("rushi");
        list.add("ajit");
        list.add("amol");
        list.add("nitin");
        list.stream().forEach(t -> log.info(t));
        list.stream().filter(t -> t.startsWith("s")).forEach(t -> log.info(t));


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "ram");
        map.put(2, "rushikesh");
        map.put(3, "amol");
        map.put(4, "nitin");
//       map.forEach((key,value)->{
//          System.out.println(key+" : "+value);
//       });
        map.entrySet().stream().forEach(t -> log.info(" map  using stream " + t));
        map.entrySet().stream().filter(t -> t.getKey() % 2 == 0).forEach(t -> log.info("even key" + t));
        map.entrySet().stream().filter(t -> t.getKey() % 2 != 0).forEach(t -> log.info("odd key" + t));
        map.entrySet().stream().filter(t -> t.getValue().startsWith("r")).forEach(t -> log.info("value start with s " + t));

    }
}
