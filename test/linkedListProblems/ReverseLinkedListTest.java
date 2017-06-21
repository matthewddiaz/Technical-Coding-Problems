package linkedListProblems;


import com.matthewddiaz.datastructures.lists.LinkedList;
import com.matthewddiaz.datastructures.lists.linkedList.LinkedListFactory;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by matthewdiaz on 6/4/17.
 */
public class ReverseLinkedListTest {

    @Test
    public void reverseLinkedList() throws Exception {
        LinkedList complexLinkedList = LinkedListFactory.createComplexLinkedList();

        //reversing list
        LinkedList.Node reverseLinkedList = ReverseLinkedList.reverseLinkedList(complexLinkedList.getHead());

        System.out.println(complexLinkedList);
        System.out.println(LinkedList.toString(reverseLinkedList));
    }

    //private void iterate
}