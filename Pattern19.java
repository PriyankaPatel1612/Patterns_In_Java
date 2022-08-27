public class Pattern19 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >= i; j--) {
                System.out.print("_");
            }
            for (int k = 1; k <= 1; k++) {
                System.out.print("*");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("__");
            }
            for (int m = 1; m <= 1; m++) {
                System.out.print("*");
            }System.out.println();
        }

        for (int i = 1 ; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("_");
            }
            for (int k = 1; k<=1; k++) {
                System.out.print("*");
            }
            for (int l = 5; l >= i; l--) {
              System.out.print("__");  
            }
            for (int m = 1; m <= 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
