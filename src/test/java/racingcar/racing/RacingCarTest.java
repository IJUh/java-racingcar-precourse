package racingcar.racing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingCarTest {

    private RacingCar racingCar;

    @BeforeEach
    public void setUp() {
        racingCar = new RacingCar();
    }

    @Test
    @DisplayName("경주할 자동차 이름 출력 테스트")
    public void 경주할_자동차_이름_출력() {
        String racingCars = racingCar.startRacing();
        assertThat(racingCars).isEqualTo("pobi,crong,honux");
    }


}
