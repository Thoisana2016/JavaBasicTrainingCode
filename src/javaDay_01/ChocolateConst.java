package javaDay_01;

import java.sql.SQLOutput;

public class ChocolateConst {
    private int barCode;
    private String name;
    private int weight;
    private int cost;
    public ChocolateConst(){
        barCode = 101;
        name = "Cadbury";
        weight = 12;
        cost = 20;
    }

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int Code) {
        barCode = Code;
    }

    public String getName() {
        return name;
    }

    public void setName(String brand) {
        name = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int quantity) {
        weight = quantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int price) {
        cost = price;
    }

    public static void main(String[] args) {
        ChocolateConst c = new ChocolateConst();
        System.out.println("First Chocolate : ");
        System.out.println("Barcode : "+c.getBarCode());
        System.out.println("Name : "+c.getName());
        System.out.println("Weight : "+c.getWeight());
        System.out.println("Cost : "+c.getCost());
        System.out.println();
        c.setBarCode(102);
        c.setName("Hershey's");
        c.setWeight(30);
        c.setCost(50);
        System.out.println("Second Chocolate : ");
        System.out.println("Barcode : "+c.getBarCode());
        System.out.println("Name : "+c.getName());
        System.out.println("Weight : "+c.getWeight());
        System.out.println("Cost : "+c.getCost());

    }
}
