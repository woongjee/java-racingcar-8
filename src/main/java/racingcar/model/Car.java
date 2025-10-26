package racingcar.model;

public class Car {
    private static final int MOVE_THRESHOLD = 4;

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public void move(int randomValue) {
        if (canMove(randomValue)) {
            position++;
        }
    }

    private boolean canMove(int randomValue) {
        return randomValue >= MOVE_THRESHOLD;
    }

    public int getPosition() {
        return position;
    }


    public String getName() {
        return name;
    }
}
