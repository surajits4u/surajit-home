package com.businessrule.engine.item;

public enum Item {

	PRODUCT("Product"), BOOK("Book"), MEMBERSHIP("Memactive"), MEMBERSHIPUP("Memupgrade"), VIDEO("Video");

    private  String textValue;

    Item(String textValue) {
        this.textValue = textValue;
    }

    public static Item textValueOf(String textValue){

        for(Item value : values()) {
            if(value.textValue.equals(textValue)) {
                return value;
            }
        }

        throw new IllegalArgumentException("No Item for value: " + textValue);  
    }   
}
