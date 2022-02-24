package Robot;
enum Direction{
    UP,
    DOWN,
    LEFT,
    RIGHT;
}
public class Robot{
    int x;
    int y;
    Direction direction;
    public Robot(int x, int y, Direction direction){
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
    public Direction getDirection() { return this.direction; }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void turnLeft(){
        switch (getDirection()){
            default:
            case UP:
                this.direction = Direction.LEFT;
                break;
            case DOWN:
                this.direction = Direction.RIGHT;
                break;
            case LEFT:
                this.direction = Direction.DOWN;
                break;
            case RIGHT:
                this.direction = Direction.UP;
                break;
        }
    }
    public void turnRight(){
        switch (getDirection()){
            default:
            case UP:
                this.direction = Direction.RIGHT;
                break;
            case DOWN:
                this.direction = Direction.LEFT;
                break;
            case LEFT:
                this.direction = Direction.UP;
                break;
            case RIGHT:
                this.direction = Direction.DOWN;
                break;
        }
    }
    public void stepForward(){
        switch (getDirection()){
            default:
            case LEFT: this.x--;
                break;
            case DOWN: this.y--;
                break;
            case UP: this.y++;
                break;
            case RIGHT: this.x++;
                break;
        }
    }
}
