import java.util.Scanner;
public class pemilihanpercobaan1 {

    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);

        System.out.println("Masukan angka: ");
        int angka = input27.nextInt();

        if(angka %2 == 0)
            System.out.println("Angka "+ angka +" bilangan genap");
        else 
            System.out.println("Angka "+ angka +" bilangan ganjil");
        
    }
}