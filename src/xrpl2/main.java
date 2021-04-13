package xrpl2;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET1
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Scanner input
        Scanner input = new Scanner(System.in);
        
        //judul
        System.out.println("DATA KELAS X - RPL 2");
        
        //menu
        System.out.println("\nMENU");
        String[]menu ={"Data Siswa","Mata Pelajaran"};
        //perulangan untuk menampilkan menu
        for(int i = 0; i < menu.length; i++){       
        System.out.println((i+1)+". " + menu[i]+"");} 
        
        System.out.println("");
        System.out.print("Masukkan pilihan : "); //input pilihan menu
        String pilihan = input.nextLine();
        
        //percabangan switch untuk meanampilkan pilihan
        switch(pilihan){
            
            case "1" :
                //memanggil method void siswa pada class input_siswa
                input_siswa.siswa(args); 
                break;
                
            case "2" :
                //memanggil method void mapel pada class input_mapel 
                input_mapel.mapel(args);
                break;
                
            default :
                System.out.println("\nPILIHAN TIDAK TERSEDIA DALAM MENU");
                break;
            
        }
        
        
    }
    
}
