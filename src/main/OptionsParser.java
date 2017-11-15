public class OptionsParser {
    public static MoveDirection[] parse(String[] args) throws IllegalArgumentException {
        MoveDirection[] moveDirections = new MoveDirection[args.length];
        int counter = 0;

        for (String argument : args){
            try {
                switch (argument) {
                    case "b":
                        moveDirections[counter] = MoveDirection.Backward;
                        counter++;
                        break;
                    case "backward":
                        moveDirections[counter] = MoveDirection.Backward;
                        counter++;
                        break;
                    case "f":
                        moveDirections[counter] = MoveDirection.Forward;
                        counter++;
                        break;
                    case "forward":
                        moveDirections[counter] = MoveDirection.Forward;
                        counter++;
                        break;
                    case "r":
                        moveDirections[counter] = MoveDirection.Right;
                        counter++;
                        break;
                    case "right":
                        moveDirections[counter] = MoveDirection.Right;
                        counter++;
                        break;
                    case "l":
                        moveDirections[counter] = MoveDirection.Left;
                        counter++;
                        break;
                    case "left":
                        moveDirections[counter] = MoveDirection.Left;
                        counter++;
                        break;
                    default:
                        throw new IllegalArgumentException(argument + " is not legal move specification");
                }
            } catch (IllegalArgumentException ex){
                System.out.print("IllegalArgumentException: ");
                System.out.println(ex.getMessage());
            }
        }

        MoveDirection[] result = new MoveDirection[counter];
        System.arraycopy(moveDirections, 0, result, 0, counter);

        return result;
    }

}
