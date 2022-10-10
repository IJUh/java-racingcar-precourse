package racingcar.racing;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import racingcar.car.Car;
import racingcar.car.Cars;
import racingcar.car.Speed;
import racingcar.car.Winners;
import racingcar.user.User;

public class RacingCar {
    private User user;
    private Winners winners;

    public void startRacing() {
        user = new User();
        winners = new Winners();
        Cars cars = user.racingCarNameList();
        List<Car> racingCarList = cars.carsList();
        int gamesIterations = user.racingIterations();
        System.out.println("실행 결과");
        for (int i = 0; i < gamesIterations; i++) {
            racingBillboard(racingCarList);
            System.out.println();
        }

        List<Car> carScore = new ArrayList<>();
        for (int carIdx = 0; carIdx < racingCarList.size(); carIdx++) {
            carScore.add(racingCarList.get(carIdx));
        }
        Collections.sort(carScore);

        String winnersName = winners.getWinnersName(carScore);

        System.out.println("최종 우승자 : " + winnersName);
    }

    private void racingBillboard(List<Car> racingCarList) {
        for (int carIdx = 0; carIdx < racingCarList.size(); carIdx++) {
            System.out.print(racingCarList.get(carIdx).getCarName().getCarName() + " : ");
            int speed = Randoms.pickNumberInRange(0, 9);
            for (int dottedLine = 0; dottedLine < speed; dottedLine++) {
                System.out.print("-");
            }
            System.out.println();
            racingCarList.get(carIdx).setSpeed(new Speed(speed));
            calculateScore(racingCarList.get(carIdx), racingCarList.get(carIdx).getSpeed().isAdvance());
        }

        for (int carIdx = 0; carIdx < racingCarList.size(); carIdx++) {
            System.out.println(
                    racingCarList.get(carIdx).getCarName().getCarName() + "의 점수는 : " + racingCarList.get(carIdx)
                            .getScore().getScore());
        }

    }

    private void calculateScore(Car car, boolean isAdvance) {
        if (isAdvance) {
            car.getScore().upScore();
        }
    }

}
