import java.util.List;

public class CornerFinder {
    private Position leftDownCorner;
    private Position rightUpCorner;

    public Position findMax (List<HayStack> stacks, List<Car> cars){
        this.rightUpCorner = stacks.get(0).getPosition();

        for (HayStack stack : stacks){
            if (stack.getPosition().larger(rightUpCorner))
                rightUpCorner = stack.getPosition();
        }

        for(Car car : cars){
            if(car.getPosition().larger(rightUpCorner))
                rightUpCorner = car.getPosition();
        }

        return rightUpCorner;
    }

    public Position findMin (List<HayStack> stacks, List<Car> cars){
        this.leftDownCorner = stacks.get(0).getPosition();

        for (HayStack stack : stacks){
            if (stack.getPosition().smaller(leftDownCorner))
                leftDownCorner = stack.getPosition();
        }

        for (Car car : cars){
            if(car.getPosition().smaller(leftDownCorner))
                leftDownCorner = car.getPosition();
        }

        return leftDownCorner;
    }

}
