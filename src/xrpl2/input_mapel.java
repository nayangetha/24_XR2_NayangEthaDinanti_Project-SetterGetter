/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xrpl2;

import java.util.Scanner;

/**
 *
 * @author MOKLET1
 */
public class input_mapel {
    
    public static void mapel(String[] args) {
        
        //pengisian dan pemaggilan mapel hari senin
        settergetter_mapel senin = new settergetter_mapel();
        senin.setJam1("Sistem Komputer");
        senin.setJam2("Sistem Komputer");
        senin.setJam3("Sistem Komputer");
        senin.setJam4("Komputer dan Jaringan Dasar");
        senin.setJam5("Kimia");
        senin.setJam6("Komputer dan Jaringan Dasar");
        senin.setJam7("Pendidikan Pancasila dan Kewarganegaraan");
        senin.setJam8("Pendidikan Pancasila dan Kewarganegaraan");
        senin.setJam9("Komputer dan Jaringan Dasar");
        senin.setJam10("Kimia");
        
        String senin1  = senin.getJam1();
        String senin2  = senin.getJam2();
        String senin3  = senin.getJam3();
        String senin4  = senin.getJam4();
        String senin5  = senin.getJam5();
        String senin6  = senin.getJam6();
        String senin7  = senin.getJam7();
        String senin8  = senin.getJam8();
        String senin9  = senin.getJam9();
        String senin10 = senin.getJam10();
        
        //pengisian dan pemaggilan mapel hari selasa
        settergetter_mapel selasa = new settergetter_mapel();
        selasa.setJam1("Pendidikan Agama Islam dan Budi Pekerti");
        selasa.setJam2("Pendidikan Agama Islam dan Budi Pekerti");
        selasa.setJam3("Komputer dan Jaringan Dasar");
        selasa.setJam4("Komputer dan Jaringan Dasar");
        selasa.setJam5("Komputer dan Jaringan Dasar");
        selasa.setJam6("Dasar Desain Grafis");
        selasa.setJam7("Dasar Desain Grafis");
        selasa.setJam8("Dasar Desain Grafis");
        selasa.setJam9("Pendidikan Agama Islam dan Budi Pekerti");
        selasa.setJam10("-");
        
        String selasa1  = selasa.getJam1();
        String selasa2  = selasa.getJam2();
        String selasa3  = selasa.getJam3();
        String selasa4  = selasa.getJam4();
        String selasa5  = selasa.getJam5();
        String selasa6  = selasa.getJam6();
        String selasa7  = selasa.getJam7();
        String selasa8  = selasa.getJam8();
        String selasa9  = selasa.getJam9();
        String selasa10 = selasa.getJam10();
        
        //pengisian dan pemaggilan mapel hari rabu
        settergetter_mapel rabu = new settergetter_mapel();
        rabu.setJam1("Bahasa Indonesia");
        rabu.setJam2("Bahasa Indonesia");
        rabu.setJam3("Bahasa Indonesia");
        rabu.setJam4("Bahasa Indonesia");
        rabu.setJam5("Tahfidz");
        rabu.setJam6("Tahfidz");
        rabu.setJam7("Tahfidz");
        rabu.setJam8("Simulasi dan Komunikasi Digital");
        rabu.setJam9("Simulasi dan Komunikasi Digital");
        rabu.setJam10("Simulasi dan Komunikasi Digital");
        
        String rabu1  = rabu.getJam1();
        String rabu2  = rabu.getJam2();
        String rabu3  = rabu.getJam3();
        String rabu4  = rabu.getJam4();
        String rabu5  = rabu.getJam5();
        String rabu6  = rabu.getJam6();
        String rabu7  = rabu.getJam7();
        String rabu8  = rabu.getJam8();
        String rabu9  = rabu.getJam9();
        String rabu10 = rabu.getJam10();
        
        //pengisian dan pemaggilan mapel hari kamis
        settergetter_mapel kamis = new settergetter_mapel();
        kamis.setJam1("Fisika");
        kamis.setJam2("Fisika");
        kamis.setJam3("Seni Budaya");
        kamis.setJam4("Seni Budaya");
        kamis.setJam5("Seni Budaya");
        kamis.setJam6("Bahasa Inggris");
        kamis.setJam7("Bahasa Inggris");
        kamis.setJam8("Bahasa Inggris");
        kamis.setJam9("Matematika (Umum)");
        kamis.setJam10("Matematika (Umum)");
        
        String kamis1  = kamis.getJam1();
        String kamis2  = kamis.getJam2();
        String kamis3  = kamis.getJam3();
        String kamis4  = kamis.getJam4();
        String kamis5  = kamis.getJam5();
        String kamis6  = kamis.getJam6();
        String kamis7  = kamis.getJam7();
        String kamis8  = kamis.getJam8();
        String kamis9  = kamis.getJam9();
        String kamis10 = kamis.getJam10();
        
        //pengisian dan pemaggilan mapel hari jumat
        settergetter_mapel jumat = new settergetter_mapel();
        jumat.setJam1("Matematika (Umum)");
        jumat.setJam2("Matematika (Umum)");
        jumat.setJam3("Pendidikan Jasmani, Olahraga, dan Kesehatan");
        jumat.setJam4("Pendidikan Jasmani, Olahraga, dan Kesehatan");
        jumat.setJam5("Sejarah Indonesia");
        jumat.setJam6("Sejarah Indonesia");
        jumat.setJam7("Sejarah Indonesia");
        jumat.setJam8("Pemrograman Dasar");
        jumat.setJam9("Pemrograman Dasar");
        jumat.setJam10("Bimbingan dan Konseling / Konselor (BP / BK)");
        
        String jumat1  = jumat.getJam1();
        String jumat2  = jumat.getJam2();
        String jumat3  = jumat.getJam3();
        String jumat4  = jumat.getJam4();
        String jumat5  = jumat.getJam5();
        String jumat6  = jumat.getJam6();
        String jumat7  = jumat.getJam7();
        String jumat8  = jumat.getJam8();
        String jumat9  = jumat.getJam9();
        String jumat10 = jumat.getJam10();
        
        //Scanner input
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan hari : ");
        String hari = input.nextLine();  //input hari
        
        //percabangan switch case untuk menampilkan hari
        switch(hari){
            case "SENIN":
                System.out.println("\nJam ke-1  : "+senin.getJam1());
                System.out.println("Jam ke-2  : "+senin.getJam2());
                System.out.println("Jam ke-3  : "+senin.getJam3());
                System.out.println("Jam ke-4  : "+senin.getJam4());
                System.out.println("Jam ke-5  : "+senin.getJam5());
                System.out.println("Jam ke-6  : "+senin.getJam6());
                System.out.println("Jam ke-7  : "+senin.getJam7());
                System.out.println("Jam ke-8  : "+senin.getJam8());
                System.out.println("Jam ke-9  : "+senin.getJam9());
                System.out.println("Jam ke-10 : "+senin.getJam10());
                break;
            case "senin" :
                System.out.println("\nTuliskan hari menggunakan huruf kapital!");
                break;
                
            case "SELASA":
                System.out.println("\nJam ke-1  : "+selasa.getJam1());
                System.out.println("Jam ke-2  : "+selasa.getJam2());
                System.out.println("Jam ke-3  : "+selasa.getJam3());
                System.out.println("Jam ke-4  : "+selasa.getJam4());
                System.out.println("Jam ke-5  : "+selasa.getJam5());
                System.out.println("Jam ke-6  : "+selasa.getJam6());
                System.out.println("Jam ke-7  : "+selasa.getJam7());
                System.out.println("Jam ke-8  : "+selasa.getJam8());
                System.out.println("Jam ke-9  : "+selasa.getJam9());
                System.out.println("Jam ke-10 : "+selasa.getJam10());
                break;
            case "selasa" :
                System.out.println("\nTuliskan hari menggunakan huruf kapital!");
                break;
                
            case "RABU":
                System.out.println("\nJam ke-1  : "+rabu.getJam1());
                System.out.println("Jam ke-2  : "+rabu.getJam2());
                System.out.println("Jam ke-3  : "+rabu.getJam3());
                System.out.println("Jam ke-4  : "+rabu.getJam4());
                System.out.println("Jam ke-5  : "+rabu.getJam5());
                System.out.println("Jam ke-6  : "+rabu.getJam6());
                System.out.println("Jam ke-7  : "+rabu.getJam7());
                System.out.println("Jam ke-8  : "+rabu.getJam8());
                System.out.println("Jam ke-9  : "+rabu.getJam9());
                System.out.println("Jam ke-10 : "+rabu.getJam10());
                break;
            case "rabu" :
                System.out.println("\nTuliskan hari menggunakan huruf kapital!");
                break;
                
            case "KAMIS":
                System.out.println("\nJam ke-1  : "+kamis.getJam1());
                System.out.println("Jam ke-2  : "+kamis.getJam2());
                System.out.println("Jam ke-3  : "+kamis.getJam3());
                System.out.println("Jam ke-4  : "+kamis.getJam4());
                System.out.println("Jam ke-5  : "+kamis.getJam5());
                System.out.println("Jam ke-6  : "+kamis.getJam6());
                System.out.println("Jam ke-7  : "+kamis.getJam7());
                System.out.println("Jam ke-8  : "+kamis.getJam8());
                System.out.println("Jam ke-9  : "+kamis.getJam9());
                System.out.println("Jam ke-10 : "+kamis.getJam10());
                break;    
            case "kamis" :
                System.out.println("\nTuliskan hari menggunakan huruf kapital!");
                break;
                
            case "JUMAT":
                System.out.println("\nJam ke-1  : "+jumat.getJam1());
                System.out.println("Jam ke-2  : "+jumat.getJam2());
                System.out.println("Jam ke-3  : "+jumat.getJam3());
                System.out.println("Jam ke-4  : "+jumat.getJam4());
                System.out.println("Jam ke-5  : "+jumat.getJam5());
                System.out.println("Jam ke-6  : "+jumat.getJam6());
                System.out.println("Jam ke-7  : "+jumat.getJam7());
                System.out.println("Jam ke-8  : "+jumat.getJam8());
                System.out.println("Jam ke-9  : "+jumat.getJam9());
                System.out.println("Jam ke-10 : "+jumat.getJam10());
                break; 
            case "jumat" :
                System.out.println("\nTuliskan hari menggunakan huruf kapital!");
                break;
                
            default :
                System.out.println("\nPEMBELAJARAN BERLANGSUNG SELAMA HARI SENIN s/d JUM'AT");
                break;
        }
      
    }
    
}
