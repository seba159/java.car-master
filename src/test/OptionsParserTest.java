
import org.junit.*;

public class OptionsParserTest {
    @Test
    public void parserTest(){
        String[] args = {"backward", "sadas", "f", "asadawq", "left", "sadas", "right"};
        MoveDirection[] moveDirections = {MoveDirection.Backward,
                MoveDirection.Forward, MoveDirection.Left, MoveDirection.Right};

        Assert.assertNotEquals(OptionsParser.parse(args), " " );
        Assert.assertArrayEquals(OptionsParser.parse(args), moveDirections);
    }


}
