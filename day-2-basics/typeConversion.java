import java.util.Scanner;

public class typeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // it will give error 
        int number = sc.nextFloat();
        System.out.println(number);

        // java converts smaller datatypes to larger
        // but vice versa we need to convert
    }
}
