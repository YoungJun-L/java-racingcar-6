package racingcar.domain;

class Printer {
    private static final String START_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

    void printStartMessage() {
        System.out.println(START_MESSAGE);
    }
}