package com.pipi.data;

public class BinaryTree {

    private static class TreeNode {

        private int val;

        private TreeNode left;

        private TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode left11 = new TreeNode(11, null, null);
        TreeNode left12 = new TreeNode(12, null, null);
        TreeNode left1 = new TreeNode(1, left11, left12);

        TreeNode right11 = new TreeNode(21, null, null);
        TreeNode right12 = new TreeNode(22, null, null);
        TreeNode right1 = new TreeNode(2, right11, right12);

        TreeNode root = new TreeNode(0, left1, right1);

        System.out.println("=== pre order ===");
        preOrder(root);

        System.out.println("=== in order ===");
        inOrder(root);

        System.out.println("=== post order ===");
        postOrder(root);

    }

    public static void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        System.out.println(node.val);
        preOrder(node.right);
    }

    public static void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.val);
    }


}
