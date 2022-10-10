package racingcar.car;

import lombok.Getter;

@Getter
public class CarName {
    private String carName;
    private static final String moreThanFiveLengthErrorMessage = "[ERROR] 자동차 이름은 5자 이하만 가능합니다.";

    public CarName(String carName) {
        if (carName.length() >= 6) {
            throw new IllegalArgumentException(moreThanFiveLengthErrorMessage);
        }
        this.carName = carName;
    }
}
