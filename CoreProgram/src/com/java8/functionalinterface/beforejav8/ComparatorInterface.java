package com.java8.functionalinterface.beforejav8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {

    public static void main(String[] args) {
        List<Players> playersList = new ArrayList<>();
        playersList.add(new Players("sachin",400,12000,50));
        playersList.add(new Players("shehwag",287,8000,27));
        playersList.add(new Players("virat",342,11000,51));
        playersList.add(new Players("yuvraj",305,7500,28));
        playersList.add(new Players("rohit",286,8000,32));
        playersList.add(new Players("dhoni",250,6000,22));
        Collections.sort(playersList,new PlayerComparator());
        for (Players p :playersList){
            System.out.println(p);
        }

    }
}
