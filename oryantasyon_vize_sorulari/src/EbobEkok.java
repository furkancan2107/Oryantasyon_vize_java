public class EbobEkok {
    // Ebob Ekok örn 12,24 ebob =12,ekok =24

    public static void main(String[] a) {
        System.out.println("sayi 1 :");
        int sayi1 = App.scan.nextInt();
        System.out.println("sayi 2 :");
        int sayi2 = App.scan.nextInt();
        int i, j;
        int max = sayi1 * sayi2;
        int ebob = 0;
        int ekok = 0;
        int buyuk = 0;
        if (sayi1 < sayi2) {
            buyuk = sayi2;
        } else {
            buyuk = sayi1;
        }
        for (i = 1; i < buyuk; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }

        }
        for (j = max; j > 0; j--) {
            if (j % sayi1 == 0 && j % sayi2 == 0) {
                ekok = j;
            }
        }
        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);
    }

}
