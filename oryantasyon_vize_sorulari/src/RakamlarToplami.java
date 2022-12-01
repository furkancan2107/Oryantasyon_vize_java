public class RakamlarToplami {
    // klavyeden girilen sayinin rakamlari toplami
    public static void main(String[] args) throws Exception {
        System.out.print("Sayi gir: ");
        int sayi = App.scan.nextInt();
        int rakam;
        int toplam = 0;
        while (sayi > 0) {
            rakam = sayi % 10;
            toplam += rakam;
            sayi = sayi / 10;
        }
        System.out.println("toplam: " + toplam);
    }

}
