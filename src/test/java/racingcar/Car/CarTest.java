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
        Car car = new Car();
        int carStatus = car.isStop();
        assertThat(carStatus).isLessThan(4);
    }

    @Test
    @DisplayName("자동차 전진 상태")
    public void 자동차_전진() {
        Car car = new Car();
        int carStatus = car.isaAvance();
        assertThat(carStatus).isGreaterThan(3);
    }

}
