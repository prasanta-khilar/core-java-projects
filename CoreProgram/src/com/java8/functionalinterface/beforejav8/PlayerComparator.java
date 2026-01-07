package com.java8.functionalinterface.beforejav8;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Players> {
    @Override
    public int compare(Players p1, Players p2) {

        if(p1.getRunScored()<p2.getRunScored()) {
            return 1;
        } else if (p1.getRunScored()> p2.getRunScored()) {
            return -1;
        }else {
            return 0;
        }
    }
}
