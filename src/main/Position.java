public class Position {
    final int x;
    final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + this.x +","+ this.y +")";
    }

    public boolean smaller (Position pos2){
        if ( this.x <= pos2.x && this.y <= pos2.y)
            return true;
        else
            return false;
    }

    public boolean larger (Position pos2){
        if (this.x >= pos2.x && this.y >= pos2.y)
            return true;
        else
            return false;
    }

    public Position add (Position pos2){
        Position pos3 = new Position(this.x + pos2.x, this.y + pos2.y);
        return pos3;
    }

    public boolean equals(Object other){
        if (this == other)
            return true;

        if(!(other instanceof Position))
            return false;

        Position that = (Position) other;
        if (this.x == that.x && this.y == that.y)
            return true;
        else
            return false;
    }

    public int hashCode(){
        int hash = 13;
        hash += this.x * 31;
        hash += this.y * 17;
        return hash;
    }


}

