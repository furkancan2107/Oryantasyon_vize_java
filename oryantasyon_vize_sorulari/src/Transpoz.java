public class Transpoz {
    public static void main(String[] args) throws Exception {
        int[][] dizi = new int[3][2];
        int[][] transpoz = new int[2][3];
        int sayac = 0;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = sayac += 5;
                transpoz[j][i] = dizi[i][j];
            }
        }
        for (int[] a : transpoz) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
