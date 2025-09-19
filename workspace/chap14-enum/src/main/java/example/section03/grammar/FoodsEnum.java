package example.section03.grammar;

public enum FoodsEnum {

    MEAL_AN_BUTTER_KIMCHI_STEW("앙버터김치찜"),
    MEAL_MINT_SEAWEED_SOUP("민트미역국"),
    MEAL_BUNGEOPPANG_SUSHI("붕어빵초밥"),

    DRINK_RADISH_KIMCHI_LATTE("열무김치라떼"),
    DRINK_WOOLUCK_SMOOTHIE("우럭스무디"),
    DRINK_RAW_CUTTLEFISH_SHAKE("생갈치쉐이크");

    private final String name;


    FoodsEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
