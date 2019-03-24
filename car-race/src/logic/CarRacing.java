package logic;

import common.BePrintedStrings;
import common.ComparableValues;
import data.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CarRacing {
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);
    private List<Car> cars = new ArrayList<>();
    private int carCount;
    private int tryCount;
    
    public void inputInitData() {
        System.out.println(BePrintedStrings.QUESTION_CAR_COUNT.getMessage());
        this.carCount = getIntRange(ComparableValues.CAR_INPUT_MIN.getValue(), ComparableValues.CAR_INPUT_MAX.getValue());
        System.out.println(BePrintedStrings.QUESTION_MOVE_COUNT.getMessage());
        this.tryCount = getIntRange(ComparableValues.MOVE_INPUT_MIN.getValue(), ComparableValues.MOVE_INPUT_MAX.getValue());
    }
    
    private static int getIntRange(int minValue, int maxValue) {
        int value = scanner.nextInt();
        while (value < minValue || value > maxValue) {
            String minValStr = String.valueOf(minValue);
            String maxValStr = String.valueOf(maxValue);
            System.out.println(BePrintedStrings.FAIL_MESSAGE.getFormatedMessage(minValStr, maxValStr));
            value = scanner.nextInt();
        }
        return value;
    }
    
    public void makeCars() {
        IntStream.range(0, this.carCount).forEach(count -> this.cars.add(new Car()));
    }
    
    public void doRacing() {
        IntStream.range(0, this.tryCount).forEach(count -> {
            this.goRandomCars();
            System.out.println();
        });
    }
    
    public void goRandomCars() {
        int maxGoAbleNum = ComparableValues.MAX_GO_ABLE_NUM.getValue();
        int goAbleNum = ComparableValues.GO_ABLE_NUM.getValue();
        String carMoveChar = BePrintedStrings.CAR_MOVE_CHAR.getMessage(); 
        cars.stream().filter(car -> {
            IntStream.range(0, car.getGoCount()).forEach(goCount -> System.out.print(carMoveChar));
            System.out.println();
            return random.nextInt(maxGoAbleNum) > goAbleNum;
        }).forEach(car -> car.go());
    }
    
    public List<Car> getCars() {
        return cars;
    }
    
    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }
    
    public int getCarCount() {
        return carCount;
    }
    
    public void setTryCount(int tryCount) {
        this.tryCount = tryCount;
    }
}
