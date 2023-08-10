
public class Main {
    public static void main(String[] args){
        Node node1 = new Node();
            node1.value = 5;
        Node node2 = new Node();
            node2.value = 3;
        Node node3 = new Node();
            node3.value = 4;
        Node node4 = new Node();
         node4.value = 1;

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        printNode(node1, 4);
        System.out.println();
        reversNode(node1, node2, 4);

    }


    static void printNode (Node node1, int index){
        
        Node curentNode = node1;
        for (int i = 0; i < index; i++) {
            System.out.print(curentNode.value + " ");
            curentNode = curentNode.next;
            
        }
    }
    static void reversNode (Node node1, Node node2, int index){
        
        for (int i = 0; i < index -1; i++) {
            
       
        Node curentNode1 = node1;
        Node curentNode2 = node2;
                 
            while (curentNode2.next != null) {            
                curentNode2 = curentNode2.next;
                curentNode1 = curentNode1.next;
            }
            System.out.print(curentNode2.value + " ");
            curentNode1.next = null;
            
            
        }
        Node curentNode1 = node1;
        System.out.print(curentNode1.value + " ");

    }

    

     static class Node {
		int value;
		Node next; 
		Node previous; 
	    }

   

}


    
