package racingcar.car;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Car {

    private Speed speed;
    private CarName carName;

    public Car(CarName carName) {
        this.carName = carName;
    }

}
