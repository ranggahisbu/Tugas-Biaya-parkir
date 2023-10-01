import java.util.Scanner;

public class luaslingkaran {
    public static void main(String[] args) {

    Double luas, Pi;
    Pi = 3.14;

     Scanner getinput = new Scanner(System.in); 
        System.out.print("Masukan Jari Jari Lingkaran = ");
        String myInput = getinput.nextLine();

        Integer result = Integer.valueOf(myInput);

        luas = Pi * result * result;
    
    
    System.out.println("Luas Lingkaran adalah = " + luas);

    }
    
}