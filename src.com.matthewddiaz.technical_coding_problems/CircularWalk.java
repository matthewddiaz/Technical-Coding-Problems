import java.util.Objects;

/**
 * Created by matthewdiaz on 11/6/16.
 */
public class CircularWalk {
    class Coordinate{
        int x;
        int y;
        Coordinate(int y, int x){
            this.y = y;
            this.x = x;
        }

        @Override
        public boolean equals(Object o) {
            // self check
            if (this == o)
                return true;
            // null check
            if (o == null)
                return false;
            // type check and cast
            if (getClass() != o.getClass())
                return false;
            Coordinate otherCoordinate = (Coordinate) o;
            // field comparison
            return Objects.equals(y, otherCoordinate.y)
                    && Objects.equals(x, otherCoordinate.x);
        }
    }

    interface Direction{
        Coordinate moveForward(Coordinate c);
        Direction turnLeft();
        Direction turnRight();
    }

    class North implements Direction{
        @Override
        public Coordinate moveForward(Coordinate c) {
            return new Coordinate(c.y + 1, c.x);
        }

        @Override
        public Direction turnLeft() {
            return new West();
        }

        @Override
        public Direction turnRight() {
            return new East();
        }
    }

    class East implements Direction{
        @Override
        public Coordinate moveForward(Coordinate c) {
            return new Coordinate(c.y, c.x + 1);
        }

        @Override
        public Direction turnLeft() {
            return new North();
        }

        @Override
        public Direction turnRight() {
            return new South();
        }
    }

    class South implements Direction{
        @Override
        public Coordinate moveForward(Coordinate c) {
            return new Coordinate(c.y - 1, c.x);
        }

        @Override
        public Direction turnLeft() {
            return new East();
        }

        @Override
        public Direction turnRight() {
            return new West();
        }
    }

    class West implements Direction{
        @Override
        public Coordinate moveForward(Coordinate c) {
            return new Coordinate(c.y, c.x - 1);
        }

        @Override
        public Direction turnLeft() {
            return new South();
        }

        @Override
        public Direction turnRight() {
            return new North();
        }
    }


    boolean doesCircleExist(String commands) {
        Direction facingDirection = new North();
        Coordinate startingPosition = new Coordinate(0,0);
        Coordinate currentPosition = startingPosition;

        char[] commandArr = commands.toCharArray();
        for(int index = 0; index < commandArr.length; index++){
            char command = commandArr[index];
            if(command == 'G'){
                currentPosition = facingDirection.moveForward(currentPosition);
            }else if (command == 'R'){
                facingDirection = facingDirection.turnRight();
            }else{
                facingDirection = facingDirection.turnRight();
            }
        }
        return startingPosition.equals(currentPosition);
    }

}
