package org.example.factory.abstractfactory.domain.pizza;

public enum PizzaTypeEnum {

    CHEESE("cheese"),
    VEGGIE("veggie"),
    PEPPERONI("pepperoni"),
    CLAM("clam");

    private final String type;

    PizzaTypeEnum(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public static PizzaTypeEnum fromString(String type) {
        if (type != null) {
            for (PizzaTypeEnum nyType : PizzaTypeEnum.values()) {
                if (nyType.type.equalsIgnoreCase(type)) {
                    return nyType;
                }
            }
        }
        throw new IllegalArgumentException("Invalid Pizza Type: " + type);
    }

}
