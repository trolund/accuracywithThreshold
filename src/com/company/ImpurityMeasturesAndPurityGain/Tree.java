package com.company.ImpurityMeasturesAndPurityGain;

import java.util.ArrayList;

public class Tree<T> {
    private Node<T> root;

    public Tree(T rootData) {
        root = new Node<T>();
        root.data = new ArrayList<Double>();
        root.children = new ArrayList<Node<T>>();
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public static class Node<T> {
        private ArrayList<Double> data;
        private Node<T> parent;
        private ArrayList<Node<T>> children = new  ArrayList();

        public Node(ArrayList<Double> data, Node<T> parent, ArrayList<Node<T>> children) {
            this.data = data;
            this.parent = parent;
            this.children = children;
        }

        public Node() {
            this.data = data;
            this.parent = parent;
            this.children = children;
        }

        public ArrayList<Double> getData() {
            return data;
        }

        public void setData(ArrayList<Double> data) {
            this.data = data;
        }

        public Node<T> getParent() {
            return parent;
        }

        public void setParent(Node<T> parent) {
            this.parent = parent;
        }

        public ArrayList<Node<T>> getChildren() {
            return children;
        }

        public void setChildren(ArrayList<Node<T>> children) {
            this.children = children;
        }
    }
}

