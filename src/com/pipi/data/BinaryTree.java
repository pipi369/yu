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

    public TreeNode root;

    public void insert(int val) {
        TreeNode newNode = new TreeNode(val, null, null);
        if (null == root) {
            root = newNode;
            return;
        }

        TreeNode node = root;

        while (true) {
            if (val < node.val) {
                // left
                if (node.left == null) {
                    node.left = newNode;
                    return;
                }
                node = node.left;
            } else {
                // right
                if (node.right == null) {
                    node.right = newNode;
                    return;
                }
                node = node.right;
            }
        }

    }

    // 1、如果当前节点没有子节点，父节点直接将当前节点设置为null
    // 2、如果当前节点只有一个子节点（左子节点或右子节点），将父节点将指向删除节点的引用指向删除节点的子节点
    // 3、如果当前节点包含两个子节点，找到右子树最小节点，把这个节点替换到删除节点的位置
    public void delete(int val) {
        // TODO
    }

    public TreeNode search(int val) {
        if (root == null) {
            return null;
        }

        TreeNode node = root;

        while (node != null) {

            if (node.val == val) {
                return node;
            }

            node = val < node.val ? node.left : node.right;
        }

        return null;
    }

    public void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        System.out.println(node.val);
        preOrder(node.right);
    }

    public void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.val);
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(4);
        tree.insert(6);
        tree.insert(12);
        tree.insert(11);
        tree.insert(13);
        tree.insert(15);
        tree.insert(14);
        tree.insert(16);

        tree.delete(10);

        System.out.println("=== pre order (node, left, right) ===");
        tree.preOrder(tree.root);

        System.out.println("=== in order (left, node, right) ===");
        tree.inOrder(tree.root);

        System.out.println("=== post order (left, right, node) ===");
        tree.postOrder(tree.root);

        System.out.println("=== value 2 on which floor？ ===");
        System.out.println(tree.search(2));


    }


}
