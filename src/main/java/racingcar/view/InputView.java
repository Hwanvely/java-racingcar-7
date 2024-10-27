package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    private static final String NAME_DELIMITER = ",";

    public List<String> readNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String input = Console.readLine();
        String[] names = input.split(NAME_DELIMITER);
        return getTrimmedNames(names);
    }

    private List<String> getTrimmedNames(String[] names) {
        return Arrays.stream(names)
                .map(String::trim)
                .collect(Collectors.toList());
    }

    public int readTrialCount() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return readPositive();
    }

    private int readPositive() {
        int input = Integer.parseInt(Console.readLine());
        if (input <= 0) {
            throw new IllegalArgumentException("양수를 입력해야 합니다");
        }
        return input;
    }
}
