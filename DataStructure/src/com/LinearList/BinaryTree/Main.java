package com.LinearList.BinaryTree;

import com.LinearList.BinaryTree.test.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode<Character> a = new TreeNode<>('A');
        TreeNode<Character> b = new TreeNode<>('B');
        TreeNode<Character> c = new TreeNode<>('C');
        TreeNode<Character> d = new TreeNode<>('D');
        TreeNode<Character> e = new TreeNode<>('E');
        TreeNode<Character> f = new TreeNode<>('F');
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        preOrder(a);
        System.out.println("----");
        middleOrder(a);
        System.out.println("----");
        downOrder(a);
        System.out.println("----");
        layerOrder(a);
    }

    //        前序遍历
    public static void preOrder(TreeNode<Character> root){
        if (root == null) return;
        System.out.println(root.element);
        preOrder(root.left);
        preOrder(root.right);
    }

//    中序遍历
    public static  void  middleOrder(TreeNode<Character> root){
        if (root == null) return;
        System.out.println(root.element);
        middleOrder(root.left);
        System.out.println(root.element);
        middleOrder(root.right);
        System.out.println(root.element);
    }

//    后序遍历
    public static void downOrder(TreeNode<Character> root){
        if (root == null) return;
        downOrder(root.left);
        downOrder(root.right);
        System.out.println(root.element);
    }

//    层序遍历
    public static void layerOrder(TreeNode<Character> root){
        if (root == null) return;
        System.out.println(root.element);
        layerOrder(root.left);
        layerOrder(root.right);
    }
}
