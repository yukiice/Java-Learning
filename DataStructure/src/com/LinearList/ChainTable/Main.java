package com.LinearList.ChainTable;

import com.LinearList.ChainTable.collection.Chain;

public class Main {
    public static void main(String[] args) {
        Chain<Integer> chain = new Chain<>();
        chain.add(10,0);
        chain.add(20,0);
        chain.add(30,1);
        System.out.println(chain.toString());
        chain.delete(2);
        System.out.println(chain.toString());

        System.out.println(chain.getIndex(1));
    }
}
