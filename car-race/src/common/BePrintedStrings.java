package common;

public enum BePrintedStrings {
    MIN_FORMAT_TARGET("@"),
    MAX_FORMAT_TARGET("#"),
    QUESTION_CAR_COUNT("자동차 대수는 몇 대 인가요?"),
    QUESTION_MOVE_COUNT("시도할 회수는 몇 회 인가요?"),
    FAIL_MESSAGE("다시 입력해주세요. 입력 가능한 값 (" + MIN_FORMAT_TARGET + " ~ " + MAX_FORMAT_TARGET + ")"),
    CAR_MOVE_CHAR("-"),
    SEPARATE_LINE("* * *");
    
    BePrintedStrings(String message) {
        this.message = message;    
    }
    
    private String message;
    
    public String getMessage() {
        return message;
    }
    
    public String getFormatedMessage(String minVal, String maxVal) {
        return FAIL_MESSAGE.message.replace(MIN_FORMAT_TARGET.message, minVal).replace(MAX_FORMAT_TARGET.message, maxVal);
    }
}
