package linkedListProblems;


import com.matthewddiaz.datastructures.lists.LinkedList;
import com.matthewddiaz.datastructures.lists.linkedList.LinkedListFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 6/4/17.
 */
class MthElementToLastTest {

    @Test
    void mthElementToLast() {
        LinkedList.Node head = LinkedListFactory.getHeadOfComplexLinkedList();
        String expectedCharacter1 = "Trunks";
        String expectedCharacter2 = "Krillin";

        String actualCharacter1 = (String)MthElementToLast.mthElementToLast(head, 3);
        String actualCharacter2 = (String)MthElementToLast.mthElementToLast(head, 0);

        assertEquals(expectedCharacter1, actualCharacter1);
        assertEquals(expectedCharacter2, actualCharacter2);
    }
}