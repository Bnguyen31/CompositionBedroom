public class Wall {

    private String direction;

    public Wall(String direction){
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return direction;
    }
}

