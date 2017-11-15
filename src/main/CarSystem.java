import java.util.ArrayList;
import java.util.List;

public class CarSystem {
    public static void main (String[] args){
//  testy lab2
//        Position position1 = new Position(1,2);
//        System.out.println(position1);
//        Position position2 = new Position(-2,1);
//        System.out.println(position2);
//        System.out.println(position1.add(position2));
//        MapDirection direction = MapDirection.North;
//        System.out.println(direction.next().toString());
//        System.out.println(direction.previous().toString());


//  testy lab3
//        Car car = new Car();
//        System.out.println(car.toString());
//        car.move(MoveDirection.Right).move(MoveDirection.Forward).move(MoveDirection.Forward).move(MoveDirection.Forward);
//        System.out.println(car.toString());

//        MoveDirection[] moveDirections = new OptionsParser().parse(args);
//        for (MoveDirection argument : moveDirections){
//            System.out.println(argument.toString());
//            car.move(argument);
//        }
//        System.out.println(car.toString());
  /*      MoveDirection[] directions = new OptionsParser().parse(args);
        IWorldMap map = new RectangularMap(10,5);
        map.add(new Car(map));
        map.add(new Car(map,3,4));
        map.run(directions);
        System.out.println(map.toString());
*/

        List<HayStack> stacks = new ArrayList<>();
        stacks.add(new HayStack(new Position(-7,-4)));
        stacks.add(new HayStack(new Position(7,7)));
        stacks.add(new HayStack(new Position(3,6)));
        stacks.add(new HayStack(new Position(2,0)));

        MoveDirection[] directions = new OptionsParser().parse(args);
        IWorldMap map = new UnboundedMap(stacks);
        map.add(new Car(map));
        map.add(new Car(map,3,4));
        map.add(new Car(map));
        map.add(new Car(map,2,0));
        map.run(directions);
        System.out.println(map.toString());

        map.PrintCars();

    }
}
