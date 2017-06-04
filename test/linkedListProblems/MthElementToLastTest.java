package linkedListProblems;

import com.matthewddiaz.datastructures.linkedList.LinkedList;
import com.matthewddiaz.datastructures.linkedList.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 6/4/17.
 */
class MthElementToLastTest {

    @Test
    void mthElementToLast() {
        LinkedList.Node head = Utils.getHeadOfComplexLinkedList();

        String character = (String)MthElementToLast.mthElementToLast(head, 3);
        String character1 = (String)MthElementToLast.mthElementToLast(head, 0);
        System.out.println(character);
        System.out.println(character1);
        System.out.println(LinkedList.toString(head));
    }

}