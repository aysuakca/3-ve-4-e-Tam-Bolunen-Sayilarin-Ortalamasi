import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int k;
        int i, result;
        int total = 0, circle = 0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lutfen Bir Sayi Giriniz :");
        k = inp.nextInt();

        for (i = 1; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                circle++;
                total += i;
                System.out.println(i);

            }
        }
        result= total/circle;
        System.out.println(result);

    }
}



