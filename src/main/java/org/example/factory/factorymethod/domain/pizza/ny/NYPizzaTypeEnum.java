package org.example.factory.factorymethod.domain.pizza.ny;

public enum NYPizzaTypeEnum {

    CHEESE("cheese"),
    VEGGIE("veggie"),
    PEPPERONI("pepperoni");

    private final String type;

    NYPizzaTypeEnum(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public static NYPizzaTypeEnum fromString(String type) {
        if (type != null) {
            for (NYPizzaTypeEnum nyType : NYPizzaTypeEnum.values()) {
                if (nyType.type.equalsIgnoreCase(type)) {
                    return nyType;
                }
            }
        }
        throw new IllegalArgumentException("Invalid Pizza Type: " + type);
    }

}
