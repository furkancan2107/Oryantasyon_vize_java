import java.util.Random;

public class TasKagitMakas {

    public static void main(String[] a) {
        Random r = new Random();

        System.out.println("Taş kağıt makas oyununa hoşgeldiniz");
        System.out.println("----------OYUN----------");
        System.out.println("0-Taş");
        System.out.println("1-Kağıt");
        System.out.println("2-Makas");
        System.out.print("Seçimini yap: ");
        int secim = App.scan.nextInt();
        int bilgisayar = r.nextInt(3);
        String[] nesneler = { "Taş", "Kağıt", "Makas" };

        if ((secim < 0 || secim > 2) || (bilgisayar < 0 || bilgisayar > 2)) {
            System.out.println("Lütfen 1 ile 3 arasında bir sayi giriniz");

        }
        System.out.println("Siz: " + nesneler[secim]);
        System.out.println("Bilgisayar: " + nesneler[bilgisayar]);

        if ((secim == 0 && bilgisayar == 2) || (secim == 1 && bilgisayar == 0)
                || (secim == 2 && bilgisayar == 1)) {
            System.out.println("Tebrikler Kazandın");
        } else if ((secim == 2 && bilgisayar == 0) || (secim == 0 && bilgisayar == 1)
                || (secim == 1 && bilgisayar == 2)) {
            System.out.println("Kaybettiniz");
        } else {
            System.out.println("Kazanan Yok");
        }

    }

}
