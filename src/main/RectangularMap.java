import java.util.ArrayList;
import java.util.List;

public class RectangularMap extends AbstractWorldMap implements IWorldMap {

    private Position downLeftCorner;
    private Position upRightCorner;

    public RectangularMap(int width, int height) {
        this.downLeftCorner = new Position(0, 0);
        this.upRightCorner = new Position(width, height);
    }

    public String toString() {
        return visualising.dump(this, downLeftCorner, upRightCorner);
    }

    @Override
    public boolean canMoveTo(Position position) {
        if (!isOccupied(position) && position.smaller(upRightCorner) && position.larger(downLeftCorner))
            return true;
        else
            return false;
    }


    @Override
    public boolean add(Car car) {
        Position carPosition = car.getPosition();
        for (Car argument : cars) {
            Position argumentPosition = argument.getPosition();
            if (carPosition.equals(argumentPosition))
                return false;
        }
        cars.add(car);
        return true;
    }


    @Override
    public boolean isOccupied(Position position) {
        for (Car argument : cars) {
            Position argumentPosition = argument.getPosition();
            if (position.equals(argumentPosition))
                return true;
        }
        return false;
    }

    @Override
    public Object objectAt(Position position) {
        for (Car argument : cars) {
            Position argumentPosition = argument.getPosition();
            if (position.equals(argumentPosition))
                return argument;
        }
        return null;
    }
}