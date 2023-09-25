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

        String message = total < 65 ? "Remidi" : "Tidak Remidi";

        System.out.println("Nilai akhir = " + total + "sehingga" + message);
    }
}
