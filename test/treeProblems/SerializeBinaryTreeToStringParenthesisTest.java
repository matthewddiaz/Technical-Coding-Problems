package treeProblems;

import com.matthewddiaz.datastructures.trees.BSTCreator;
import com.matthewddiaz.datastructures.trees.BinarySearchTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Created by matthewdiaz on 6/29/17.
 */
class SerializeBinaryTreeToStringParenthesisTest {
    private BinarySearchTree simpleBST;
    private BinarySearchTree complexBST;

    @BeforeEach
    public void setUp() throws Exception {
        this.simpleBST = BSTCreator.createSimpleBinarySearchTree();
        this.complexBST = BSTCreator.createComplexBinarySearchTree();
    }

    @Test
    void generatePreOrderStringParenthesizationForSimpleBST() {
        String expectedSimpleResult = "(10(5(1()())())(12(11()())(15()())))";
        String simpleBSTStringRep = SerializeBinaryTreeToStringParenthesis.generatePreOrderStringParenthesization(this.simpleBST.getRoot());
        assertEquals(expectedSimpleResult, simpleBSTStringRep);
    }

    @Test
    void generatePreOrderStringParenthesizationForComplexBST() {
        String expectedComplexResult = "(9(5(1()())(8()()))(15(11(10()())())(20(16()(18()()))(50()(60(55()())(100(90(80()())())()))))))";
        String complexBSTStrRep = SerializeBinaryTreeToStringParenthesis.generatePreOrderStringParenthesization(this.complexBST.getRoot());
        assertEquals(expectedComplexResult, complexBSTStrRep);
    }
}