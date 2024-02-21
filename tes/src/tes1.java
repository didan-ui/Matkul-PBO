//memanggil library
import java.util.Scanner;

public class tes1
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nama jurusan di UMM: ");
        String jurusan = sc.next();
        System.out.println("Nama Jurusan: "+jurusan);

        //deklarasi variable
        int population = 100000;
        String nama ="Informatika";
        char kar = 'a';

        //output
        System.out.println("populasinya: "+population);
        System.out.println("jurusan: "+nama+" karakter: "+kar);

    }
}
