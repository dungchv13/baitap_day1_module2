import java.util.Scanner;

public class Chuyen_doi_tien_te {
    public static void main(String[] args) {
        System.out.println("nhap so tien usd ban muon chuyen: ");
        Scanner scanner = new Scanner(System.in);
        float usd = scanner.nextFloat();
        float rate = 23000;
        float vnd = usd*rate;
        System.out.println(usd+" usd = "+vnd+" vnd");
    }
}
