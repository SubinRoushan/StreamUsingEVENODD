package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        List<Integer> l1=List.of(1,2,3,4,5,6,7,8);
        System.out.println(l1);


        //Without Stream(Copy one list to another list)
        List<Integer> list1=new ArrayList<>();
        for(Integer i:l1){
            list1.add(i);

        }
        System.out.println(list1);




       //Using Stream
         Stream<Integer> stream=l1.stream();
        List<Integer> newlist= stream.filter(j ->j%2==0).collect(Collectors.toList());
        System.out.println(newlist);

        //Using Stream
        List<Integer> newl=l1.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println(newl);
    }
}