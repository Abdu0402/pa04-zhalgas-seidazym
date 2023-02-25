public class Main {
    public static void main(String[] args) {
        MovableCircle movableCircle = new MovableCircle(0, 0, 5, 5, 5);
        for(int i = 0; i < 5; i++){
            movableCircle.moveDown();
            movableCircle.moveRight();
            System.out.println(movableCircle);
        }
        for(int i = 0; i < 5; i++){
            movableCircle.moveUp();
            movableCircle.moveLeft();
            System.out.println(movableCircle);
        }
        MovablePoint movablePoint = new MovablePoint(0, 0, 5, 5);
        for(int i = 0; i < 5; i++){
            movablePoint.moveDown();
            movablePoint.moveRight();
            System.out.println(movablePoint);
        }
        for(int i = 0; i < 5; i++){
            movablePoint.moveUp();
            movablePoint.moveLeft();
            System.out.println(movablePoint);
        }
    }
}
