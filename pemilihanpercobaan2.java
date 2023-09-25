import java.util.Scanner;
public class pemilihanpercobaan2 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);

        System.out.println("Nilai UAS: ");
        float UAS = input27.nextFloat();
        System.out.println("Nilai UTS: ");
        float UTS = input27.nextFloat();
        System.out.println("Nilai Kuis: ");
        float Kuis = input27.nextFloat();
        System.out.println("Nilai Tugas: ");
        float Tugas = input27.nextFloat();

        float total = (UAS * 0.4F)+(UTS * 0.35F)+(Kuis * 0.1F)+(Tugas * 0.2F);

        String message = total <65 ?"remidi" : "tidak remidi";

        if(total >80 && total <=100)
            System.out.println("Nilai Huruf A, Nilai Setara 4, Kualifikasi Sangat Baik");
        else if(total >73 && total <=80)
            System.out.println("Nilai Huruf B+, Nilai Setara 3,5, Kulifikasi Lebih Dari Baik");
        else if(total >65 && total <=73)
            System.out.println("Nilai Huruf B, Nilai Setara 3, Kualifikasi Baik");
        else if(total >60 && total <=65)
            System.out.println("Nilai Huruf C+, Nilai Setara 2,5, Kualifikasi Lebih Dari Cukup");
        else if(total >50 && total <=60)
            System.out.println("Nilai Huruf C, Nilai Setara 2, Kualifikasi Cukup");
        else if(total >39 && total <=50)
            System.out.println("Nilai Huruf D, Nilai Setara 1, Kualifikasi Kurang");
        else if(total <=39)
            System.out.println("Nilai Huruf E, Nilai Setara 0, Kualifikasi Gagal");
        
        System.out.println("Nilai Akhir Anda " + total + " sehingga " + message);
    }
}
