package example.section02.enumtype;

public enum FoodsEnum {

    MEAL_AN_BUTTER_KIMCHI_STEW(0),
    MEAL_MINT_SEAWEED_SOUP(1),
    MEAL_BUNGEOPPANG_SUSHI(2),

    DRINK_RADISH_KIMCHI_LATTE(3),
    DRINK_WOOLUCK_SMOOTHIE(4),
    DRINK_RAW_CUTTLEFISH_SHAKE(5);

    private final int value;

    FoodsEnum(int value) {
        this.value = value;
    }

    public void printVar() {
        System.out.println("value: " + value);
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
