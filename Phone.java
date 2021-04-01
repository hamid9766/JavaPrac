package com.section2;

public class Phone {
    String Brand;
    String Color;
    String Weight;
    String Height;
    String Price;

    void printPhone() {
        System.out.println("Phone Brand:" + Brand + "Color:" + Color + "Weight:" + Weight + "Height:" + Height + "Price:" + Price);
    }

    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.Brand = "Iphone";
        iphone.Color = "black";
        iphone.Weight = "130 gm";
        iphone.Height = "6.2 inches";
        iphone.Price = "1200$";
        iphone.printPhone();

Phone samsung = new Phone();
        samsung.Brand = "Samsung";
        samsung.Color = "white";
        samsung.Weight = "10 gm";
        samsung.Height = "6.3 inches";
        samsung.Price = "10$";
        samsung.printPhone();
    }


}
