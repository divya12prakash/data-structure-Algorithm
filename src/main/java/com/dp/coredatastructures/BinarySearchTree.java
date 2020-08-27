package com.dp.coredatastructures;

public class BinarySearchTree<T extends Comparable> {
    
    private int size;
    
    private Node root;
    
    private class Node{
        T element;
        Node left,right;
        
        public Node(Node left,T element,Node right){
            this.element = element;
            this.left = left;
            this.right = right;
        }
    }
    
    public boolean add(T elem){
        
        if(root == null){
            root = new Node(null, elem,null);
            size++;
        }
        
        if(contains(elem)) return false;
        
        root = add(root,elem);
        size++;
        return true;
    }
    
    public Node add(Node node, T element){
        if (node == null) {
            node = new Node(null, element,null );
        }else{
        if(element.compareTo(node.element) < 0){
            node.left = add(node.left,element);
        }else{
            node.right = add(node.right,element);
        }
        }
        return node;
    }

    public boolean remove(T element){
        if(contains(element)){
            root = remove(root,element);
            size--;
            return true;
        }
        return false;
    }
    
    public Node remove(Node node, T element){
        
        int compr = element.compareTo(node.element);
        
        if(compr<0){
            node.left = remove(node.left,element);
        }
        else if(compr>0){
            node.right = remove(node.right,element);
        }else{
            // This is the case with only a right subtree or
            // no subtree at all. In this situation just
            // swap the node we wish to remove with its right child.
            if (node.left == null) {
                return node.right;

                // This is the case with only a left subtree or
                // no subtree at all. In this situation just
                // swap the node we wish to remove with its left child.
            } else if (node.right == null) {

                return node.left;

                // When removing a node from a binary tree with two links the
                // successor of the node being removed can either be the largest
                // value in the left subtree or the smallest value in the right
                // subtree. In this implementation I have decided to find the
                // smallest value in the right subtree which can be found by
                // traversing as far left as possible in the right subtree.
            } else {

                // Find the leftmost node in the right subtree
                Node tmp = findMin(node.right);

                // Swap the data
                node.element = tmp.element;

                // Go into the right subtree and remove the leftmost node we
                // found and swapped data with. This prevents us from having
                // two nodes in our tree with the same value.
                node.right = remove(node.right, tmp.element);

                // If instead we wanted to find the largest node in the left
                // subtree as opposed to smallest node in the right subtree
                // here is what we would do:
                // Node tmp = findMax(node.left);
                // node.data = tmp.data;
                // node.left = remove(node.left, tmp.data);

            }
        }

        return node;
            
        }
        
        public boolean contains(T elem){
            return contains(root,elem);
        }
    
    /**
     * Compare the element with each element in the node, if there is
     * a match then return true else return false.
     * @param elem
     * @return
     */
    public boolean contains(Node node, T elem){

        if (node == null) return false;
        
        if(elem.compareTo(node.element) == 0){
            return true;
        }
        
        if(elem.compareTo(node.element)<0){
            return contains(node.left, elem);
        }else{
            return contains(node.right,elem);
        }
        
    }
    
    public Node findMin(Node node){
        while(node.left!=null) node = node.left;
        return node;
    }
    
    public Node findMax(Node node){
        while(node.right!=null) node = node.right;
        return node;
    }

    // This method returns an iterator for a given TreeTraversalOrder.
    // The ways in which you can traverse the tree are in four different ways:
    // preorder, inorder, postorder and levelorder.
    public java.util.Iterator<T> traverse(String order) {
        switch (order) {
            case "PRE_ORDER":
                return preOrderTraversal();
            case "IN_ORDER":
                return inOrderTraversal();
            case "POST_ORDER":
                return postOrderTraversal();
            case "LEVEL_ORDER":
                return levelOrderTraversal();
            default:
                return null;
        }
    }

    // Returns as iterator to traverse the tree in pre order
    private java.util.Iterator<T> preOrderTraversal() {

        final int expectedsize = size;
        final java.util.Stack<Node> stack = new java.util.Stack<>();
        stack.push(root);

        return new java.util.Iterator<T>() {
            @Override
            public boolean hasNext() {
                if (expectedsize != size) throw new java.util.ConcurrentModificationException();
                return root != null && !stack.isEmpty();
            }

            @Override
            public T next() {
                if (expectedsize != size) throw new java.util.ConcurrentModificationException();
                Node node = stack.pop();
                if (node.right != null) stack.push(node.right);
                if (node.left != null) stack.push(node.left);
                return node.element;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    // Returns as iterator to traverse the tree in order
    private java.util.Iterator<T> inOrderTraversal() {

        final int expectedsize = size;
        final java.util.Stack<Node> stack = new java.util.Stack<>();
        stack.push(root);

        return new java.util.Iterator<T>() {
            Node trav = root;

            @Override
            public boolean hasNext() {
                if (expectedsize != size) throw new java.util.ConcurrentModificationException();
                return root != null && !stack.isEmpty();
            }

            @Override
            public T next() {

                if (expectedsize != size) throw new java.util.ConcurrentModificationException();

                // Dig left
                while (trav != null && trav.left != null) {
                    stack.push(trav.left);
                    trav = trav.left;
                }

                Node node = stack.pop();

                // Try moving down right once
                if (node.right != null) {
                    stack.push(node.right);
                    trav = node.right;
                }

                return node.element;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    // Returns as iterator to traverse the tree in post order
    private java.util.Iterator<T> postOrderTraversal() {
        final int expectedsize = size;
        final java.util.Stack<Node> stack1 = new java.util.Stack<>();
        final java.util.Stack<Node> stack2 = new java.util.Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            Node node = stack1.pop();
            if (node != null) {
                stack2.push(node);
                if (node.left != null) stack1.push(node.left);
                if (node.right != null) stack1.push(node.right);
            }
        }
        return new java.util.Iterator<T>() {
            @Override
            public boolean hasNext() {
                if (expectedsize != size) throw new java.util.ConcurrentModificationException();
                return root != null && !stack2.isEmpty();
            }

            @Override
            public T next() {
                if (expectedsize != size) throw new java.util.ConcurrentModificationException();
                return stack2.pop().element;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    // Returns as iterator to traverse the tree in level order
    private java.util.Iterator<T> levelOrderTraversal() {

        final int expectedsize = size;
        final java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.offer(root);

        return new java.util.Iterator<T>() {
            @Override
            public boolean hasNext() {
                if (expectedsize != size) throw new java.util.ConcurrentModificationException();
                return root != null && !queue.isEmpty();
            }

            @Override
            public T next() {
                if (expectedsize != size) throw new java.util.ConcurrentModificationException();
              Node node = queue.poll();
              if(node.left!=null) queue.offer(node.left);
              if(node.right!=null) queue.offer(node.right);
              return node.element;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    
}
