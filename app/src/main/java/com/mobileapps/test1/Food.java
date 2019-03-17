package com.mobileapps.test1;

public class Food {

    String typeOf;
    String nameOf;
    int quantity;

    public Food(String typeOf, String nameOf, int quantity) {
        this.typeOf = typeOf;
        this.nameOf = nameOf;
        this.quantity = quantity;
    }

    public String getTypeOf() {
        return typeOf;
    }

    public void setTypeOf(String typeOf) {
        this.typeOf = typeOf;
    }

    public String getNameOf() {
        return nameOf;
    }

    public void setNameOf(String nameOf) {
        this.nameOf = nameOf;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
