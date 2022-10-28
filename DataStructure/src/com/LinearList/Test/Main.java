package com.LinearList.Test;

public class Main {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){this.val = val;};
        ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        };
    }
    public ListNode reverseList(ListNode head){
        ListNode prev = null,node = head;
        while (node != null){
            ListNode tmp = node;
            node = node.next;
            tmp.next = prev;
            prev = tmp;
        }
        return  prev;
    }
}
