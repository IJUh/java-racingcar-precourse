package racingcar.car;

public class Speed {

    private int speed;

    public Speed(int speed) {
        this.speed = speed;
    }

    public Boolean isStop() {
        if (this.speed < 4) {
            return true;
        }
        return false;
    }

    public Boolean isaAvance() {
        if (this.speed >= 4) {
            return true;
        }
        return false;
    }


}
