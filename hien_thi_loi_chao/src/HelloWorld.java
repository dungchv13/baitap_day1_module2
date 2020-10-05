import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hay nhap ten cua ban");
        String name = scanner.nextLine();

        System.out.println("Xin chao "+ name);

    }
}
