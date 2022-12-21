package homework1;

public class Figure2 {
    public static void main(String[] args) {
        int n = 5;
        int i, j;

        for (i = n; i >= 1; i--) {
            // напечатать '*' i раз
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}
