package linkedListProblems;

import com.matthewddiaz.datastructures.lists.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 6/6/17.
 */
class RemoveDuplicatesTest {

    @Test
    void removeDuplicatesFromLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.appendElement(new Integer(3));
        linkedList.appendElement(new Integer(15));
        linkedList.appendElement(new Integer(3));
        linkedList.appendElement(new Integer(1));
        linkedList.appendElement(new Integer(4));
        linkedList.appendElement(new Integer(15));
        linkedList.appendElement(new Integer(3));

        LinkedList.Node head = linkedList.getHead();

        RemoveDuplicates.removeDuplicatesFromLinkedList(head);
        System.out.println(LinkedList.toString(head));
    }

}