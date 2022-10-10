package racingcar.user;

import static camp.nextstep.edu.missionutils.Console.readLine;

import java.util.ArrayList;
import java.util.List;
import racingcar.car.Car;
import racingcar.car.CarName;
import racingcar.car.Cars;
import racingcar.score.Score;

public class User {

    private CarName carName;
    private Cars cars;

    private String inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return readLine();
    }

    public Cars racingCarNameList() {
        String inputCarName = inputCarNames();
        String[] eachCarName = inputCarName.split(",");
        List<Car> carNameList = new ArrayList<>();
        for (int racingCarIdx = 0; racingCarIdx < eachCarName.length; racingCarIdx++) {
            carNameList.add(new Car(new CarName(eachCarName[racingCarIdx]), new Score()));
        }
        return new Cars(carNameList);
    }

    private String inputGameIterations() {
        System.out.println("시도할 회수는 몇회인가요?");
        return readLine();
    }

    public int racingIterations() {
        return Integer.valueOf(inputGameIterations());
    }

}
