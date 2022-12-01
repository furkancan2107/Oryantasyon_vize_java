
public class Yildiz {
    /*
       *
      ***
     *****
    */
    public static void main(String[] args) throws Exception {
        System.out.print("Satir gir: ");
        int satir = App.scan.nextInt();
        int bosluk = satir - 1;
        int yildiz = 1;
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < yildiz; j++) {
                System.out.print("*");
            }
            System.out.println();
            yildiz += 2;
            bosluk--;

        }
    }
}
