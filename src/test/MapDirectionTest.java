import org.junit.*;

public class MapDirectionTest {
    @Test
    public void testNext(){
        MapDirection n = MapDirection.North;
        MapDirection s = MapDirection.South;
        MapDirection e = MapDirection.East;
        MapDirection w = MapDirection.West;

        Assert.assertEquals(n.next(), MapDirection.East);
        Assert.assertEquals(s.next(), MapDirection.West);
        Assert.assertEquals(e.next(), MapDirection.South);
        Assert.assertEquals(w.next(), MapDirection.North);
    }

    @Test
    public void testPrevious(){
        MapDirection n = MapDirection.North;
        MapDirection s = MapDirection.South;
        MapDirection e = MapDirection.East;
        MapDirection w = MapDirection.West;

        Assert.assertEquals(n.previous(), MapDirection.West);
        Assert.assertEquals(s.previous(), MapDirection.East);
        Assert.assertEquals(e.previous(), MapDirection.North);
        Assert.assertEquals(w.previous(), MapDirection.South);
    }


}
