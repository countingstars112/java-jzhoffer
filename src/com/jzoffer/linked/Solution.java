package com.jzoffer.linked;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * * From  xxwy
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {


    /**
     * 输入一个链表，从尾到头打印链表每个节点的值。
     * @param listNode
     * @return
     */
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode != null) {
            LinkedList<Integer> integers = new LinkedList<>();
            while (listNode != null) {
                integers.add(0, listNode.val);
                listNode = listNode.next;
            }
            ArrayList<Integer> integers1 = new ArrayList<>(integers);
            return integers1;
        }
        return new ArrayList<Integer>();
    }


}
