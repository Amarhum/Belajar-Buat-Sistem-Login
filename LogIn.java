import java.util.Scanner;
public class LogIn{

    private static Scanner sc;

    public static void main(String[] args) {
        
        String id;
        String pw;

        sc = new Scanner(System.in);

            //MEMBUAT Id
        System.out.println("----- MEMBUAT AKUN----");
        System.out.println("Buat Id : ");
        id = sc.nextLine();
        // Membuat Password
        System.out.println("Buat Password : ");
        pw = sc.nextLine();
        // OutPut Yang Disimpan
        System.out.println("-----------------------");
        System.out.println("Kode Pengguna :" + id.hashCode());
        System.out.println("Id anda : " + id);
        System.out.println("password anda : " + pw);


            //LOGIN 
        String id2=id;
        String pw2 = pw; 
        System.out.println("-----LOGIN------");
        System.out.println("Masukan Id : "); 
        id2 = sc.nextLine();

        System.out.println("Masukan Password : "); 
        pw2 = sc.nextLine();

        if(id2.equals(id)){
            System.out.println("Id yang anda Masukan Benar");
        }
        else{
            System.out.println("Id Yang Anda Masukan Salah");
        }
        
        
        if(pw2.equals(pw)){
            System.out.println("password yang anda Masukan Benar");
        }
        else{
            System.out.println("password Yang Anda Masukan Salah");
        }



    }
}