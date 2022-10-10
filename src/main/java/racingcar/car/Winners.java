package racingcar.car;

import java.util.ArrayList;
import java.util.List;

public class Winners {

    private List<CarName> winnerList = new ArrayList<>();

    public void addWinner(String carName) {
        this.winnerList.add(new CarName(carName));
    }

    public List<CarName> winnersName() {
        return new ArrayList<>(winnerList);
    }

}
