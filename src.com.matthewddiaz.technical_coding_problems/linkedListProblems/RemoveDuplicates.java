package linkedListProblems;


import com.matthewddiaz.datastructures.lists.LinkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by matthewdiaz on 6/6/17.
 */
public class RemoveDuplicates {
    /**
     * Removes duplicates from a linked list
     * Using a temporary buffer
     *
     * Ex:
     *
     * Input: [3] -> [15] -> [3] -> [1] ->[4] -> [15] -> [3] -> NULL
     *
     * Output: [3] -> [15] -> [1] -> [4] -> NUll
     *
     *
     * @param head
     */
    public static void removeDuplicatesFromLinkedList(LinkedList.Node head){
        //if head of Linked List is null return
        if(head == null){
            return;
        }

        //Set will contain track of unique elements
        Set<Object> set = new HashSet<>();

        //Pointer to current node
        LinkedList.Node current = head;
        //Pointer to previous node to current node
        LinkedList.Node previous = null;

        while(current != null){
            Object currentElement = current.getElement();
            //if set does not contain the current element add it and set previous equal to current
            if(!set.contains(currentElement)){
                set.add(currentElement);
                previous = current;
            } else{
              //this the current element is a duplicate and needs to be deleted
              previous.setNext(current.getNext());
            }
            //advance current to next element
            current = current.getNext();
        }
    }
}
