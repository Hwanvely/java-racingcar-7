package racingcar.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.Game;

public class GameTest {

    @Test
    void 입력받은만큼_자동차를_생성할_수_있다() {
        List<String> names = List.of("hwan", "pobi", "leo");
        Game game = new Game();

        List<Car> cars = game.createCars(names);

        assertEquals(cars.size(), 3);
    }
}
