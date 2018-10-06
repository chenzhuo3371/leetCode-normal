package com.chen.practice_02.model;


public class ListNode {

    public int value ;

    public ListNode next ;

    public ListNode() {}
    public ListNode(int value) {
        this.value = value;
    }

    public void printNormalListNode(){
        String value = "";
        if (this == null) {
            System.out.println(" 空节点 ");
        } else {
            ListNode temp = this ;
            while (temp != null){
                value += temp.value;
                temp = temp.next;
            }
            if (value == "" || value == null) {
                System.out.println("  异常节点 ");
            } else {
                System.out.println("  ##  node-normal-save-result : " + value.trim());
            }
        }
    }

    public void printRightListNode(){
        String value = "";
        if (this == null) {
            System.out.println(" 空节点 ");
        } else {
            ListNode temp = this ;
            while (temp != null){
                value += temp.value;
                temp = temp.next;
            }
            if (value == "" || value == null) {
                System.out.println("  异常节点 ");
            } else {
                System.out.println("  ##  node-right-result : " + new StringBuffer(value).reverse().toString());
            }
        }
    }

    public ListNode reverseNode() {


        return null ;
    }


}
