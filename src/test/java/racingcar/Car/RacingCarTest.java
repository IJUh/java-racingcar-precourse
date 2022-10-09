package racingcar.Car;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.Racing.RacingCar;

public class RacingCarTest {

    @Test
    @DisplayName("")
    public void 단독_우승자_안내_문구_출력() {
        RacingCar racingCar = new RacingCar();
        String winnersName = racingCar.startRacing();
        assertThat(winnersName).isEqualTo("pobi");
    }

}
