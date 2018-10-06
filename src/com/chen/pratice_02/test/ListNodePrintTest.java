package com.chen.pratice_02.test;

import com.chen.pratice_02.model.ListNode;

public class ListNodePrintTest {

    public static void main(String[] args){
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        node3.next = node2 ;
        node2.next = node1 ;
        node3.printNormalListNode();
        node3.printRightListNode();
    }


}
