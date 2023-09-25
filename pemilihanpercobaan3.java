import java.util.Scanner;
public class pemilihanpercobaan3 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.println("masukan angka pertama: ");
        angka1 = input27.nextDouble();
        System.out.println("masukan angka kedua: ");
        angka2 = input27.nextDouble();
        System.out.println("masukan operator (+ - * /): ");
        operator = input27.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + "+" + angka2 + "=" + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + "-" + angka2 + "=" + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + "*" + angka2 + "=" + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + "/" + angka2 + "=" + hasil);
                break;
        }

    }
}
