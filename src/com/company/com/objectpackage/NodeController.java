package com.company.com.objectpackage;

import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class NodeController {
    private List<Node> nodeList=new ArrayList<Node>();
    private List<Node> shortNodeList=new ArrayList<Node>();
    public  void setAndAddNode(String nodeName, List<Integer> distancesBetweenNodes, List<Node> childNodes){
        nodeList.add(new Node(nodeName, distancesBetweenNodes, childNodes));
    }
    public void createShortNode(String nodeName){
        shortNodeList.add(new Node(toUpperCase(nodeName)));
    }
    public List<Node> returnShortNodeList(){
        return shortNodeList;
    }
    public List<Node> returnNodeList(){
        return nodeList;
    }
}
