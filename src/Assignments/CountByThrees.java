package Assignments;

public class CountByThrees {
    public static void main(String[] args) {
        int count = 3;

        while (count <= 300) {
            System.out.println(count);
            count = count +3;
        }
        while(count >=3){
            System.out.println(count);
            count = count -3;
        }
    }
}