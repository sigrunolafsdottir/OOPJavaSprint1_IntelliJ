package ooj.sprint1.demos;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {


    public static void main(String[] args){

        //2,3,4
        //6,7,8

        List <List<Integer>> l = List.of(List.of(2,3,4), List.of(6,7,8));

        System.out.println(l.get(0).get(2));  //första listans tredje värde


    }
}
