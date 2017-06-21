package linkedListProblems;


import com.matthewddiaz.datastructures.lists.LinkedList;

/**
 * Created by matthewdiaz on 6/4/17.
 */
public class MthElementToLast {

    /*
     *  returns the element contained in the node that is "m" nodes from the last node in the linked list
     *  That is K = 0 would return the last element
     *
     *  Ex: Given: [5] -> [15] -> [1] -> [8] -> null
     *
     *  m_th_To_Last(head, 2); //returns 15
     *
     *  m_th_to_last(head, 0); //returns 8
     *
     */
    public static Object mthElementToLast(LinkedList.Node head, int m){
        //case for when head is null
        if(head == null){
            return null;
        }

        LinkedList.Node currentPtr = head; //pointer used to point to current node
        LinkedList.Node forwardPtr = head; //pointer used to point to forward node by m element

        //advance forward pointer by m nodes
        while(m > 0){
            forwardPtr = forwardPtr.getNext();
            m--;
        }

        //while forward's next pointer is not equal to null advance both pointers by 1 node
        while(forwardPtr.getNext()!= null){
            currentPtr = currentPtr.getNext();
            forwardPtr = forwardPtr.getNext();
        }

        return currentPtr.getElement();
    }
}
