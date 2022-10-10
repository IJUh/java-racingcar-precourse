package racingcar.car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import racingcar.score.Score;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Car implements Comparable<Car> {

    @Setter
    private Speed speed;
    private CarName carName;
    private Score score;

    public Car(CarName carName, Score score) {
        this.carName = carName;
        this.score = score;
    }

    @Override
    public int compareTo(Car car1) {
        if (car1.getScore().getScore() > this.getScore().getScore()) {
            return 1;
        }
        if (car1.getScore().getScore() < this.getScore().getScore()) {
            return -1;
        }
        return 0;
    }
}
