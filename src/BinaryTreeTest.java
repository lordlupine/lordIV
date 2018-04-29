import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BinaryTreeTest {
    private BinaryTree bt;
    private BinaryTree bt2;
    private BinaryTree btMirror;

    @BeforeAll
    public void createTreeInsert() {
        bt = new BinaryTree();
        bt.insertBST(20);
        bt.insertBST(10);
        bt.insertBST(30);
        bt.insertBST(5);
        bt.insertBST(15);
        bt.insertBST(25);
        bt.insertBST(35);
        bt.insertBST(2);
    }

    @BeforeAll
    public void createTreeInsert2() {
        bt2 = new BinaryTree();
        bt2.insertBST(20);
        bt2.insertBST(10);
        bt2.insertBST(30);
        bt2.insertBST(5);
        bt2.insertBST(15);
        bt2.insertBST(25);
        bt2.insertBST(35);
        bt2.insertBST(2);
    }

    @Test
    public void size() {
        assertEquals(8, bt.size(bt.root));
    }

    @Test
    public void minValue() {
        assertEquals(2, bt.minValue(bt.root));
    }

    @Test
    void maxDepth() {
        assertEquals(4, bt.maxDepth(bt.root));
    }

    @Test
    void hasPathSum() {
        assertEquals(true, bt.hasPathSum(bt.root, 37));
        assertEquals(false, bt.hasPathSum(bt.root, 38));
        assertEquals(true, bt.hasPathSum(bt.root, 45));
        assertEquals(true, bt.hasPathSum(bt.root, 85));
    }

    @Test
    void printPaths() {
        bt.printPaths(bt.root, 45);
    }

    @Test
    void insert() {
    }

    @Test
    void sameTree() {
        assertEquals(true, bt.sameTree(bt.root, bt2.root));
    }

//    @Test
//    void mirrorTree() {
//        assertEquals(true, btMirror.mirrorTree(bt.root, bt2.root));
//    }
}