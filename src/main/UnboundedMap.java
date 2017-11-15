import java.util.ArrayList;
import java.util.List;

public class UnboundedMap extends AbstractWorldMap implements IWorldMap {
    private List<HayStack> stacks = new ArrayList<>();

    public UnboundedMap (List<HayStack> stacks){
        this.stacks = (List<HayStack>) stacks;
    }


    @Override
    public boolean canMoveTo(Position position) {
        return !isOccupied(position);
    }

    @Override
    public boolean add(Car car) throws IllegalArgumentException {
       boolean result = false;
        try{
           if (!this.isOccupied(car.getPosition())){
               cars.add(car);
               result = true;
           }else{
               result = false;

          throw new IllegalArgumentException(car.getPosition().toString() + " is occupied by car.");}
       } catch (IllegalArgumentException ex){
            System.out.print("IllegalArgumentException: ");
            System.out.println(ex.getMessage());
        }
           return result;
    }


    @Override
    public boolean isOccupied(Position position) {
        return objectAt(position) != null;
    }

    @Override
    public Object objectAt(Position position) {
        for (HayStack stack : stacks){
            if (position.equals(stack.getPosition()))
                return  stack;
        }

        for (Car car : cars){
            if (position.equals(car.getPosition()))
            return car;
        }

        return null;
    }

    @Override
    public String toString() {
        CornerFinder cf = new CornerFinder();
        return visualising.dump(this, cf.findMin(stacks, cars), cf.findMax(stacks, cars));
    }

}
