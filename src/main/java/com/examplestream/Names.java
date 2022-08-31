package com.examplestream;

import java.util.Arrays;
import java.util.List;

public class Names {

    
    // public static void main(String[] args) {
    //     List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
    //     names.forEach(s -> System.out.print("Hello" + " " + s + " " + "\n"));
    // }

        // using stream 
        public static void main(String[] args) {
            List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
            names.stream()
                .forEach(x -> System.out.println("Hello " + x));
        }

}