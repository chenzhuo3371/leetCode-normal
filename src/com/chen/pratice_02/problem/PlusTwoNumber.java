package com.chen.pratice_02.problem;

import com.chen.pratice_02.model.ListNode;

public class PlusTwoNumber {

    public static void main(String[] args){
        ListNode target1 = new ListNode();
        ListNode target2 = new ListNode();

        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        node3.next = node2 ;
        node2.next = node1 ;
        System.out.println("%%%%%%%%%");
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(9);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(4);
        node7.next = node6 ;
        node6.next = node5 ;
        node5.next = node4 ;

        target1 = node3;
        target1.printRightListNode();
        target2 = node7;
        target2.printRightListNode();
        System.out.println("&&& addTwoNumbers  @@@@");
//
        ListNode resultNode = plusTwoNumber(target1, target2);
        resultNode.printRightListNode();
    }

    /**特别注意：加和最后形成的结果就是最终结果，不需要再次颠倒顺序 **/


    public static ListNode plusTwoNumber(ListNode nodeA , ListNode nodeB){
        ListNode result = new ListNode(0); // 设置哑点
        ListNode current = result;
        int weight = 0 ;
        while (nodeA != null || nodeB != null) {
            int x = (nodeA != null) ? nodeA.value : 0;
            int y = (nodeB != null) ? nodeB.value : 0;
            int sum = weight + x + y ;
            current.next = new ListNode(sum % 10);
            current = current.next ;
            if (nodeA != null) nodeA = nodeA.next ;
            if (nodeB != null) nodeB = nodeB.next;
            weight = sum / 10 ;
        }
        if (weight > 0) { // 进位处理
            current.next = new ListNode(weight);
        }
        return result.next ;
    }


}
