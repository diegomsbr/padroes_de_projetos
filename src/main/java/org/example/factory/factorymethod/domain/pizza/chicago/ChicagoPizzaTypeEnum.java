package org.example.factory.factorymethod.domain.pizza.chicago;

public enum ChicagoPizzaTypeEnum {

    CHEESE("cheese"),
    VEGGIE("veggie"),
    PEPPERONI("pepperoni");

    private final String type;

    ChicagoPizzaTypeEnum(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public static ChicagoPizzaTypeEnum fromString(String type) {
        if (type != null) {
            for (ChicagoPizzaTypeEnum nyType : ChicagoPizzaTypeEnum.values()) {
                if (nyType.type.equalsIgnoreCase(type)) {
                    return nyType;
                }
            }
        }
        throw new IllegalArgumentException("Invalid Pizza Type: " + type);
    }

}
