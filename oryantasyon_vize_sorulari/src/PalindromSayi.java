public class PalindromSayi {
    // kendisi ile tersi aynı olan sayi ise true döndüren program

    public static void main(String[] args) throws Exception {
        int sayi = 565;
        int ilkD = sayi;
        int toplam = 0;
        int rakam;
        while (sayi > 0) {
            rakam = sayi % 10;
            toplam = (toplam * 10) + rakam;
            sayi = sayi / 10;
        }
        if (toplam == ilkD) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
