package racingcar.Car;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @BeforeEach
    public void setUp() {

    }

    @DisplayName("자동차 멈춤 상태")
    @Test
    public void 자동차_멈춘다() {
        Car car = new Car(3);
        Boolean carStatus = car.isStop();
        assertThat(carStatus).isTrue();
    }

    @Test
    @DisplayName("자동차 전진 상태")
    public void 자동차_전진() {
        Car car = new Car(4);
        Boolean carStatus = car.isaAvance();
        assertThat(carStatus).isTrue();
    }

}
