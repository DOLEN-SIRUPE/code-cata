package common;

public enum ComparableValues {
    CAR_INPUT_MIN(0),
    CAR_INPUT_MAX(Integer.MAX_VALUE),
    MOVE_INPUT_MIN(0),
    MOVE_INPUT_MAX(Integer.MAX_VALUE),
    MAX_GO_ABLE_NUM(9),
    GO_ABLE_NUM(4);
    
    ComparableValues(int value) {
        this.value = value;
    }
    
    private int value;
    
    public int getValue() {
        return value;
    }
}
