import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        boolean akibet = false;
        String mekan;
        String din = null;

        System.out.println("Lütfen Dininizi Giriniz : "); din = scanner.nextLine();

        if(din.equals("islamiyet")) {
            akibet = true;
        }

        if(akibet) { //gördüğün gibi burada == false veya true yazmama gerek kalmadı.
            mekan = "cennet";
        } else {
            mekan = "cehennem";
        }

        System.out.println("Mekanınız : " +mekan + " Allah rahmet eylesin.");

    }
}
