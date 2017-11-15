public class Car {

    private MapDirection direction = MapDirection.North;
    private Position position = new Position(2, 2);
    IWorldMap map;

    public Car (IWorldMap map, int x, int y){
        this.position = new Position(x,y);
        this.map = map;
        this.map.add(this);
    }

    public Car (IWorldMap map){
        this.map = map;
        this.map.add(this);
    }

    public Position getPosition(){
        return this.position;
    }

    public String toStringBis(){
        return "Position - " + position.toString() + ", Direction - " + direction.toString();
    }

    public String toString(){
        return direction.toString();
    }

    public Car move(MoveDirection moveDirection){
        Position vec_x = new Position(1,0);
        Position vec_y = new Position(0,1);
        Position min_vec_x = new Position(-1,0);
        Position min_vec_y = new Position(0,-1);

        Position temPosition = new Position(0,0);
        switch(moveDirection){
            case Right:
                this.direction = this.direction.next();
                break;
            case Left:
                this.direction = this.direction.previous();
                break;
            case Forward:
                switch (this.direction){
                    case North:
                        temPosition = this.position.add(vec_y);
                        break;
                    case South:
                        temPosition = this.position.add(min_vec_y);
                        break;
                    case East:
                        temPosition = this.position.add(vec_x);
                        break;
                    case West:
                        temPosition = this.position.add(min_vec_x);
                        break;
                }
                if(map.canMoveTo(temPosition))
                    this.position = temPosition;
                break;
            case Backward:
                switch (direction){
                    case North:
                        temPosition = this.position.add(min_vec_y);
                        break;
                    case South:
                        temPosition = this.position.add(vec_y);
                        break;
                    case East:
                        temPosition = this.position.add(min_vec_x);
                        break;
                    case West:
                        temPosition = this.position.add(vec_x);
                        break;
                }
                if(map.canMoveTo(temPosition))
                    this.position = temPosition;
                break;
        }
        return this;
    }

}
