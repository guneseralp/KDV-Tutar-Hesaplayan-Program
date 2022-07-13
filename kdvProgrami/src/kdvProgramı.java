import java.util.Scanner;

public class kdvProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double tutar, kdvOran = 0.18;
        System.out.print("Tutar giriniz : ");
        tutar = input.nextInt();

        double kdvTutar = tutar * kdvOran;
        double kdvliFiyat = kdvTutar  + tutar;
        System.out.println(kdvliFiyat);
    }
}
