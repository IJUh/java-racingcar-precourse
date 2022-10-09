package racingcar.Car;

public class CarName {
    private String carName;
    public CarName(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
        }
        this.carName = carName;
    }
}
