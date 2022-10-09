package racingcar.Car;

public class Car {

    private int randomNumber;

    public Car(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public Boolean isStop() {
        if (this.randomNumber < 4) {
            return true;
        }
        return false;
    }

    public Boolean isaAvance() {
        if (this.randomNumber >= 4) {
            return true;
        }
        return false;
    }
}
