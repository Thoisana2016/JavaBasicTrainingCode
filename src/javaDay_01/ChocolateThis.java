package javaDay_01;

public class ChocolateThis {
    private int barCode;
    private String name;
    private int weight;
    private int cost;

    public ChocolateThis(int barCode, String name, int weight, int cost){
        this.barCode = barCode;
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public static void main(String[] args) {
        ChocolateThis t = new ChocolateThis(101, "Cadbury", 12, 30);
        System.out.println("First Chocolate : ");
        System.out.println("Barcode : "+t.getBarCode());
        System.out.println("Name : "+t.getName());
        System.out.println("Weight : "+t.getWeight());
        System.out.println("Cost : "+t.getCost());
        System.out.println();
        t.setBarCode(102);
        t.setName("Hershey's");
        t.setWeight(30);
        t.setCost(50);
        System.out.println("Second Chocolate : ");
        System.out.println("Barcode : "+t.getBarCode());
        System.out.println("Name : "+t.getName());
        System.out.println("Weight : "+t.getWeight());
        System.out.println("Cost : "+t.getCost());

    }
}
