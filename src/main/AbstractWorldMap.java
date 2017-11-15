import java.util.ArrayList;
import java.util.List;

public class AbstractWorldMap {
    protected MapVisualizer visualising = new MapVisualizer();
    protected List<Car> cars = new ArrayList<>();

    public void PrintCars(){
        System.out.println(this.cars.toString());
    }

    public void run(MoveDirection[] directions) {
//        System.out.println(this.toString());
        if (cars != null) {
            for (int i = 0; i < directions.length; i++) {
                cars.get(i % cars.size()).move(directions[i]);
//                System.out.println(this.toString());
            }
        }

        /*
         int carnum = cars.size();
        for (int i = 0; i < directions.length; i++){
            Car a = cars.get(i % carnum);
            a.move(directions[i], this);
            System.out.println(this.toString());
         */
    }


}
