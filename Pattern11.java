public class Pattern11 {
    public static void main(String[] args) {
        
        int l = 0;
        
        for (int i = 1; i <= 5; i++) {
            
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                l = l + 1 ;
                System.out.print(l+ " " );
            } 
            
            System.out.println();
        }
    }
}
