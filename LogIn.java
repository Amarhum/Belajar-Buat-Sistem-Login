
import java.util.Scanner;
public class LogIn{

    private static Scanner sc;

    public static void main(String[] args) {
        
        String id;
        String pw;

        sc = new Scanner(System.in);

            //MEMBUAT Id
        System.out.println("----- BUAT AKUN----");
        System.out.println("Buat Id : ");
        id = sc.nextLine();
        // Membuat Password
        System.out.println("Buat Password : ");
        pw = sc.nextLine();
        // OutPut Yang Disimpan
        System.out.println("----- SUKSES MEMBUAT AKUN ------");
        System.out.println("Kode Pengguna :" + id.hashCode());
        System.out.println("Id anda : " + id);
        System.out.println("password anda : " + pw);

            
        String id2=id;
        String pw2 = pw; 
            //LOGIN 
        System.out.println("-----LOGIN------");
        System.out.println("Masukan Id : "); 
        id2 = sc.nextLine();

        System.out.println("Masukan Password : "); 
        pw2 = sc.nextLine();



        if(id2.equals(id) && pw2.equals(pw)){
            System.out.println("Login Sukses");
        }
        else if(id2 != id && pw2.equals(pw)){
            System.out.println("ID yang Anda Masukan Salah ");
        }
        else if(pw2 != pw && id2.equals(id)){
            System.out.println("Password yang Anda Masukan Salah ");
        }
        else {
            System.out.println(" ID dan password Yang Anda Masukan Salah");
        }
    }
}
        // if(id2.equals(id) && pw2.equals(pw)){
        //     System.out.println("Login Sukses");
        // }
        // else {
        //     if(id2 != id && pw2.equals(pw)){
        //         System.out.println("ID yang Anda Masukan Salah ");
        //     }
        //     if(pw2 != pw && id2.equals(id)){
        //         System.out.println("Password yang Anda Masukan Salah ");
        //     }
        //     else {
        //             System.out.println(" ID dan password Yang Anda Masukan Salah");
        //         }
        // }
  
