package linkedListProblems;

import com.matthewddiaz.datastructures.linkedList.LinkedList;

/**
 * Created by matthewdiaz on 6/4/17.
 */
public class ReverseLinkedList {

    //Given the head pointer of a linked list.
    //Returns the head pointer of the same linked list now in reverse order.
    //NOTE: This implementation creates now new Nodes or linked lists
    public static LinkedList.Node reverseLinkedList(LinkedList.Node head){
        LinkedList.Node currentPtr = head;
        LinkedList.Node previousPtr = null; //pointer points to previous node of linked list (One node behind current)
        LinkedList.Node nextPtr = currentPtr.getNext(); //pointer points to next node of linked list. (One node ahead of current)
        currentPtr.setNext(previousPtr);

        while(nextPtr != null){
            //previous pointer advances by one. Set to head
            previousPtr = currentPtr;

            //(head) current pointer advances by one. Set to nextPtr
            currentPtr = nextPtr;

            //next pointer advances by one.
            nextPtr = nextPtr.getNext();

            //current Node's next will now point to previous
            currentPtr.setNext(previousPtr);
        }

        //returns head of reversedLinkedList
        return currentPtr;
    }
}
