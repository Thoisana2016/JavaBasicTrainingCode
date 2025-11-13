package javaDay_01;

public class ArrayPractice {
    private int[] marks = new int[5];

    public void setMarks(){
        marks[0] = 78;
        marks[1] = 45;
        marks[2] = 67;
        marks[3] = 77;
        marks[4] = 83;
    }

    public void getMarks(){
        System.out.println("Marks Score : ");
        for(int n : marks){
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        ArrayPractice a = new ArrayPractice();
        a.setMarks();
        a.getMarks();
    }

}
