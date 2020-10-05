import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so :");
        int number = scanner.nextInt();

        //doc so co 1 chu so
        if(number / 10 == 0){
            String output = "";
            switch (number){
                case 1:
                    output = "one";
                    break;
                case 2:
                    output = "two";
                    break;
                case 3:
                    output = "three";
                    break;
                case 4:
                    output = "four";
                    break;
                case 5:
                    output = "five";
                    break;
                case 6:
                    output = "six";
                    break;
                case 7:
                    output = "seven";
                    break;
                case 8:
                    output = "eight";
                    break;
                case 9:
                    output = "nine";
                    break;
                case 0:
                    output = "zero";
                    break;
            }
            System.out.println("String: "+output);
        }else{
            System.out.println("out of ability");
        }

    }
}
