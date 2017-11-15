
import org.junit.*;

public class PositionTest {

    @Test
    public void toStringTest(){
        Position pos1 = new Position(-3,1);
        Position pos2 = new Position(5,3);
        Position pos3 = new Position(1,2);
        Position pos4 = new Position(-3,-5);

        Assert.assertEquals(pos1.toString(), "(-3,1)");
        Assert.assertEquals(pos2.toString(), "(5,3)");
        Assert.assertEquals(pos3.toString(), "(1,2)");
        Assert.assertEquals(pos4.toString(), "(-3,-5)");
    }

    @Test
    public void smallerTest(){
        Position pos1 = new Position(-3,1);
        Position pos2 = new Position(5,3);
        Position pos3 = new Position(1,2);
        Position pos4 = new Position(-3,-5);

        Assert.assertTrue(pos1.smaller(pos2));
        Assert.assertTrue(pos1.smaller(pos3));
        Assert.assertTrue(pos1.smaller(pos3));
        Assert.assertFalse(pos2.smaller(pos3));
        Assert.assertFalse(pos2.smaller(pos4));
        Assert.assertFalse(pos3.smaller(pos4));

    }

    @Test
    public void largerTest(){
        Position pos1 = new Position(-3,1);
        Position pos2 = new Position(5,3);
        Position pos3 = new Position(1,2);
        Position pos4 = new Position(-3,-5);

        Assert.assertFalse(pos1.larger(pos2));
        Assert.assertFalse(pos1.larger(pos3));
        Assert.assertFalse(pos1.larger(pos3));
        Assert.assertTrue(pos2.larger(pos3));
        Assert.assertTrue(pos2.larger(pos4));
        Assert.assertTrue(pos3.larger(pos4));

    }

    @Test
    public void addTest(){
        Position pos1 = new Position(-3,1);
        Position pos2 = new Position(5,3);
        Position pos3 = new Position(2,4);
        Position pos4 = new Position(-1,5);

        Assert.assertEquals(pos1.add(pos2), pos3);
        Assert.assertEquals(pos1.add(pos3), pos4);
        Assert.assertNotEquals(pos2.add(pos3), pos1);
        Assert.assertNotEquals(pos1.add(pos3), pos2);
    }

}
