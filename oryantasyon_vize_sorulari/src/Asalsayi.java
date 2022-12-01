
public class Asalsayi {
    // ASAL SAYİ BÖLENLERİNİ YAZDİRAN PROGRAM ÖRN 21=3,7
    public static void main(String[] args) throws Exception {
        System.out.print("Sayi gir: ");
        int sayi = App.scan.nextInt();
        int bolen = 2;
        int bolunen = sayi;
        while (bolunen >= bolen) {
            if (bolunen % bolen == 0) {
                bolunen = bolunen / bolen;
                System.out.println(bolen);
            } else {
                bolen++;
            }
        }
    }
}
