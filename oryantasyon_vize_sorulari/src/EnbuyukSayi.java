public class EnbuyukSayi {
    // girilen 5 sayidan en büyüğünü yazdiran program
    public static void main(String[] args) throws Exception {
        int max = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Sayi gir: ");
            int sayi = App.scan.nextInt();
            if (sayi > max) {
                max = sayi;
            }
        }
        System.out.println(max);
    }
}
