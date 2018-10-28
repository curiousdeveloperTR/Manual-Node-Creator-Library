package com.company;

import com.company.com.objectpackage.Node;
import com.company.com.objectpackage.NodeController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
This structure aims to create Node objects which will be using in trees easiest way.
                        Subelements:
 */
public class Main {
    public static NodeController nodeController =new NodeController(); // NodeController to control lists
    public static boolean isContinue=true;
    public static List<Node> nodeList=new ArrayList<Node>();
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        setRoadNodes(); // Firstly set nodes as shortly detailed
        setNodeDetails();  // Secondly set properties of nodes
    }
    public static void setRoadNodes(){ // set your nodes shortly
        while(isContinue){
            String nodeName;
            System.out.println("\nOlusturulacak dugum ismini giriniz: ");
            nodeName=scanner.next();
            nodeController.createShortNode(nodeName); // create a simple node with your library
            System.out.println("\nDevam etmek ister misiniz: "); // ask user to continue
            int i;
            i=scanner.nextInt();
            if(i==0)
                isContinue=false;
        }
        isContinue=true; /* use one variable on all over the program for higher performance
         Note: it may not matter for simple programs but when you are working as professional, you need to be careful for higher perfromance
         */

    }
    public static void setNodeDetails(){
        List<Node> list= nodeController.returnShortNodeList();
        List<Integer> distancesBetweenChildNodes=new ArrayList<Integer>();
        for(Node item:list){
            while(isContinue){
                List<Node> childList=new ArrayList<Node>();
                System.out.println("\nEklenecek elemanin indexini giriniz: "); // get index number to get child node
                int index=scanner.nextInt(); // index= ?
                if(index>=0 && index<=list.size()){ // check if exists
                    childList.add(list.get(index)); // add which item of list comes from list
                    System.out.println("\nAradaki uzakligi giriniz: "); // get distance
                    int distance=scanner.nextInt();  // distance = ?
                    distancesBetweenChildNodes.add(distance); // add that to your list
                }
                System.out.println("\nDevam etmek ister misiniz: "); // check if user wants to continue add child node
                int secim=scanner.nextInt();
                if(secim==0){
                    isContinue=false;
                    item.setChildNodes(childList);
                    item.setDistancesBetweenChildNodes(distancesBetweenChildNodes);
                }

            }
            System.out.println("\nDevam etmek ister misiniz: "); // check if user wants to set details of the Node
            int secim=scanner.nextInt();
            if(secim==0)
                break;
            isContinue=true;
        }
    }
}
