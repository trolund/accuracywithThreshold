package com.company;

import java.util.List;

public class impurityGain {


    public static void main(String[] args) {

        // build tree
        Tree.Node<Object> rootNode = new Tree.Node<>();

        Tree.Node<Object> nodeclass1 = new Tree.Node<>();
        Tree.Node<Object> nodeclass2 = new Tree.Node<>();

        // connect tree
        rootNode.getChildren().add(nodeclass1);
        rootNode.getChildren().add(nodeclass2);

        Tree tree = new Tree(rootNode);




    }

}
