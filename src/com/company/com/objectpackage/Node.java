package com.company.com.objectpackage;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.MAX_VALUE;

public class Node {
    private String nodeName;
    private List<Integer> distancesBetweenChildNodes=new ArrayList<Integer>();
    private List<Node> childNodes=new ArrayList<Node>();
    private Node previousNode;

    public Node(String nodeName){
        this.nodeName=nodeName;
    }
    public Node(String nodeName, List<Integer> distancesBetweenChildNodes, List<Node> childNodes) {
        this.nodeName = nodeName;
        this.distancesBetweenChildNodes = distancesBetweenChildNodes;
        this.childNodes = childNodes;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public List<Integer> getDistancesBetweenChildNodes() {
        return distancesBetweenChildNodes;
    }

    public void setDistancesBetweenChildNodes(List<Integer> distancesBetweenChildNodes) {
        this.distancesBetweenChildNodes = distancesBetweenChildNodes;
    }

    public List<Node> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(List<Node> childNodes) {
        this.childNodes = childNodes;
    }
}
