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
public class input_siswa {
    
    public static void siswa(String[] args) {
        // TODO code application logic here
        
        //pengisian dan pemanggilan siswa 1
        settergetter_siswa ainu = new settergetter_siswa();
        ainu.setNISN("0029007435");
        ainu.setNama("AINU AZZARIA");
        ainu.setAlamat("Danau Sentani Tengah VI H2H-10, Kec. Kedungkandang");
        ainu.setTTL("Malang,2005-06-03");
        ainu.setTelp("+6281231635072");
        
        String nisn1   = ainu.getNISN();
        String nama1   = ainu.getNama();
        String alamat1 = ainu.getAlamat();
        String ttl1    = ainu.getTTL();
        String telp1   = ainu.getTelp();
        
        //pengisian dan pemanggilan siswa 2
        settergetter_siswa balada = new settergetter_siswa();
        balada.setNISN("0054494796");
        balada.setNama("BALADA RAJA BASKARA");
        balada.setAlamat("Kebonsari Puncanganom RT 09 RW 01, Kec. Kebonsari");
        balada.setTTL("Madiun, 2005-01-28");
        balada.setTelp("+6282142058450");
        
        String nisn2   = balada.getNISN();
        String nama2   = balada.getNama();
        String alamat2 = balada.getAlamat();
        String ttl2    = balada.getTTL();
        String telp2   = balada.getTelp();
        
        //pengisian dan pemanggilan siswa 3
        settergetter_siswa cheva = new settergetter_siswa();
        cheva.setNISN("0055708897");
        cheva.setNama("CHEVA SATRIO UTOMO");
        cheva.setAlamat("JL. Jendral Sudirman 7, Kec. Sumberpucung");
        cheva.setTTL("Malang, 2005-05-15");
        cheva.setTelp("+6281259331185");
        
        String nisn3   = cheva.getNISN();
        String nama3   = cheva.getNama();
        String alamat3 = cheva.getAlamat();
        String ttl3    = cheva.getTTL();
        String telp3   = cheva.getTelp();
        
        //pengisian dan pemanggilan siswa 4
        settergetter_siswa davina = new settergetter_siswa();
        davina.setNISN("0055107104");
        davina.setNama("DAVINA ARAFA AURELIA");
        davina.setAlamat("Jl. Serka Larahima, Kec. Pakis Saptorenggo");
        davina.setTTL("Malang, 2005-01-19");
        davina.setTelp("+6285235186348");
        
        String nisn4   = davina.getNISN();
        String nama4   = davina.getNama();
        String alamat4 = davina.getAlamat();
        String ttl4    = davina.getTTL();
        String telp4   = davina.getTelp();
        
        //pengisian dan pemanggilan siswa 5
        settergetter_siswa deazard = new settergetter_siswa();
        deazard.setNISN("0051756380");
        deazard.setNama("DEAZARD MUHAMMAD ARRAYYAN");
        deazard.setAlamat("Simpang Ijeln A/13, Kec. Klojen Oro-oro Dowo");
        deazard.setTTL("Jayapura, 2005-09-29");
        deazard.setTelp("+6282140303778");
        
        String nisn5   = deazard.getNISN();
        String nama5   = deazard.getNama();
        String alamat5 = deazard.getAlamat();
        String ttl5    = deazard.getTTL();
        String telp5   = deazard.getTelp();
        
        //pengisian dan pemanggilan siswa 6
        settergetter_siswa desi = new settergetter_siswa();
        desi.setNISN("0044942696");
        desi.setNama("DESI YULIANTI");
        desi.setAlamat("Golangu, Kec. Sawahan Bareng, RT 03 RW 05");
        desi.setTTL("Nganjuk, 2004-06-27");
        desi.setTelp("+6281328164757");
        
        String nisn6   = desi.getNISN();
        String nama6   = desi.getNama();
        String alamat6 = desi.getAlamat();
        String ttl6    = desi.getTTL();
        String telp6   = desi.getTelp();
        
        //pengisian dan pemanggilan siswa 7
        settergetter_siswa devira = new settergetter_siswa();
        devira.setNISN("0047267358");
        devira.setNama("DEVIRA FANNY RYENA");
        devira.setAlamat("Gilang, Kec. Ngunut Gilang, RT 01 RW 04");
        devira.setTTL("Tulungagung, 2004-12-05");
        devira.setTelp("+6281231673191");
        
        String nisn7   = devira.getNISN();
        String nama7   = devira.getNama();
        String alamat7 = devira.getAlamat();
        String ttl7    = devira.getTTL();
        String telp7   = devira.getTelp();
        
        //pengisian dan pemanggilan siswa 8
        settergetter_siswa fahreza = new settergetter_siswa();
        fahreza.setNISN("0049678759");
        fahreza.setNama("FAHREZA DITYA ALFANDRY");
        fahreza.setAlamat("Setonorejo, Kec. Kras Setonorejo");
        fahreza.setTTL("Kediri, 2004-12-31");
        fahreza.setTelp("+6282330527088");
        
        String nisn8   = fahreza.getNISN();
        String nama8   = fahreza.getNama();
        String alamat8 = fahreza.getAlamat();
        String ttl8    = fahreza.getTTL();
        String telp8   = fahreza.getTelp();
        
        //pengisian dan pemanggilan siswa 9
        settergetter_siswa fiskah = new settergetter_siswa();
        fiskah.setNISN("0047111403");
        fiskah.setNama("FISKAH SYELA AISY AULIA");
        fiskah.setAlamat("Jl. Sepawon Dermo Pranggang Plosoklaten, Kediri");
        fiskah.setTTL("Kediri, 2004-07-16");
        fiskah.setTelp("+6281232155266");
        
        String nisn9   = fiskah.getNISN();
        String nama9   = fiskah.getNama();
        String alamat9 = fiskah.getAlamat();
        String ttl9    = fiskah.getTTL();
        String telp9   = fiskah.getTelp();
        
        //pengisian dan pemanggilan siswa 10
        settergetter_siswa haziel = new settergetter_siswa();
        haziel.setNISN("0052710626");
        haziel.setNama("HAZIEL JUSTICE CHRISTIANPUTRA");
        haziel.setAlamat("Jl. S Supriadi III / 39, Kec. Sukun Sukun");
        haziel.setTTL("Malang, 2005-05-05");
        haziel.setTelp("+6282228623787");
        
        String nisn10   = haziel.getNISN();
        String nama10   = haziel.getNama();
        String alamat10 = haziel.getAlamat();
        String ttl10    = haziel.getTTL();
        String telp10   = haziel.getTelp();
        
        //pengisian dan pemanggilan siswa 11
        settergetter_siswa intan = new settergetter_siswa();
        intan.setNISN("0052710416");
        intan.setNama("INTAN PUTRI SETYOWATI");
        intan.setAlamat("Jl. Lembayung GG. 7, Kec. Kedungkandang Bumiayu");
        intan.setTTL("Malang, 2005-03-22");
        intan.setTelp("+6281329707103");
        
        String nisn11   = intan.getNISN();
        String nama11   = intan.getNama();
        String alamat11 = intan.getAlamat();
        String ttl11    = intan.getTTL();
        String telp11   = intan.getTelp();
        
        //pengisian dan pemanggilan siswa 12
        settergetter_siswa kevin = new settergetter_siswa();
        kevin.setNISN("0050855775");
        kevin.setNama("KEVIN BRAMASTA ARVYTO WARDHANA");
        kevin.setAlamat("Jl. Simpang Kepuh A-10, Kec. Sukun Bandungrejosari");
        kevin.setTTL("Malang, 2005-04-27");
        kevin.setTelp("+628113682704");
        
        String nisn12   = kevin.getNISN();
        String nama12   = kevin.getNama();
        String alamat12 = kevin.getAlamat();
        String ttl12    = kevin.getTTL();
        String telp12   = kevin.getTelp();
        
        //pengisian dan pemanggilan siswa 13
        settergetter_siswa ifa = new settergetter_siswa();
        ifa.setNISN("0050715740");
        ifa.setNama("LATHIFA PUTERI ASYARI");
        ifa.setAlamat("Perum Tambakyudan Makmur Blok I 53/54, Kec. Purworejo");
        ifa.setTTL("Sidoarjo, 2005-06-20");
        ifa.setTelp("+6281217563394");
        
        String nisn13   = ifa.getNISN();
        String nama13   = ifa.getNama();
        String alamat13 = ifa.getAlamat();
        String ttl13    = ifa.getTTL();
        String telp13   = ifa.getTelp();
        
        //pengisian dan pemanggilan siswa 14
        settergetter_siswa lysander = new settergetter_siswa();
        lysander.setNISN("0047110494");
        lysander.setNama("LYSANDER ARSHAQ YAFIQ");
        lysander.setAlamat("Jl. Tanjung 115B, Kec. Sukorejo Pakunden");
        lysander.setTTL("Blitar, 2004-01-11");
        lysander.setTelp("+6281217122196");
        
        String nisn14   = lysander.getNISN();
        String nama14   = lysander.getNama();
        String alamat14 = lysander.getAlamat();
        String ttl14    = lysander.getTTL();
        String telp14   = lysander.getTelp();
        
        //pengisian dan pemanggilan siswa 15
        settergetter_siswa bagus = new settergetter_siswa();
        bagus.setNISN("3052310249");
        bagus.setNama("M. BAGUS ANDIN PRAKOSO");
        bagus.setAlamat("Jl. Danau Matana A-8, Kec. Kedungkandang Sawojajar");
        bagus.setTTL("Malang, 2005-02-03");
        bagus.setTelp("+6281330327870");
        
        String nisn15   = bagus.getNISN();
        String nama15   = bagus.getNama();
        String alamat15 = bagus.getAlamat();
        String ttl15    = bagus.getTTL();
        String telp15   = bagus.getTelp();
        
        //pengisian dan pemanggilan siswa 16
        settergetter_siswa riswan = new settergetter_siswa();
        riswan.setNISN("0049541950");
        riswan.setNama("MOCH RISWAN FAUZI");
        riswan.setAlamat("Setonokalong, Kec. Sumbergempol Bendiati Wetan");
        riswan.setTTL("Tulungagung, 2004-01-17");
        riswan.setTelp("+6282228103123");
        
        String nisn16   = riswan.getNISN();
        String nama16   = riswan.getNama();
        String alamat16 = riswan.getAlamat();
        String ttl16    = riswan.getTTL();
        String telp16   = riswan.getTelp();
        
        //pengisian dan pemanggilan siswa 17
        settergetter_siswa aira = new settergetter_siswa();
        aira.setNISN("0059739534");
        aira.setNama("MOCHAMMAD AIRA BINTANG ANDRIAN");
        aira.setAlamat("Jl. Wiriaga A 53, Kec. Blimbing Bunulrejo");
        aira.setTTL("Malang, 2005-03-10");
        aira.setTelp("+6282132516571");
        
        String nisn17   = aira.getNISN();
        String nama17   = aira.getNama();
        String alamat17 = aira.getAlamat();
        String ttl17    = aira.getTTL();
        String telp17   = aira.getTelp();
        
        //pengisian dan pemanggilan siswa 18
        settergetter_siswa ardiansyah = new settergetter_siswa();
        ardiansyah.setNISN("00492822296");
        ardiansyah.setNama("MOCHAMMAD ARDIANSYAH");
        ardiansyah.setAlamat("Jl. Kertosari, Kec. Turen Sanakerto");
        ardiansyah.setTTL("Malang, 2004-12-03");
        ardiansyah.setTelp("+6281227403575");
        
        String nisn18   = ardiansyah.getNISN();
        String nama18   = ardiansyah.getNama();
        String alamat18 = ardiansyah.getAlamat();
        String ttl18    = ardiansyah.getTTL();
        String telp18   = ardiansyah.getTelp();
        
        //pengisian dan pemanggilan siswa 19
        settergetter_siswa arya = new settergetter_siswa();
        arya.setNISN("0043993561");
        arya.setNama("MUHAMMAD ARYA FIRMANSYAH");
        arya.setAlamat("Jl. H. Ismail, Kec. Jombang Plandi");
        arya.setTTL("Jombang, 2004-04-20");
        arya.setTelp("+6282132092648");
        
        String nisn19   = arya.getNISN();
        String nama19   = arya.getNama();
        String alamat19 = arya.getAlamat();
        String ttl19    = arya.getTTL();
        String telp19   = arya.getTelp();
        
        //pengisian dan pemanggilan siswa 20
        settergetter_siswa azriel = new settergetter_siswa();
        azriel.setNISN("0051298872");
        azriel.setNama("MUHAMMAD AZRIEL NOVANSYAH");
        azriel.setAlamat("Bumi Mondoroko Raya, Kec. Singosari Watu Gede");
        azriel.setTTL("Malang, 2005-01-13");
        azriel.setTelp("+6282223829626");
        
        String nisn20   = azriel.getNISN();
        String nama20   = azriel.getNama();
        String alamat20 = azriel.getAlamat();
        String ttl20    = azriel.getTTL();
        String telp20   = azriel.getTelp();
        
        //pengisian dan pemanggilan siswa 21
        settergetter_siswa rafa = new settergetter_siswa();
        rafa.setNISN("0061739256");
        rafa.setNama("MUHAMMAD RAFA ATHALLAH");
        rafa.setAlamat("Perumdim Jubung GG 2/28, Kec. Sukorambo Jubung");
        rafa.setTTL("Jember, 2005-11-15");
        rafa.setTelp("+6282228555657");
        
        String nisn21   = rafa.getNISN();
        String nama21   = rafa.getNama();
        String alamat21 = rafa.getAlamat();
        String ttl21    = rafa.getTTL();
        String telp21   = rafa.getTelp();
        
        //pengisian dan pemanggilan siswa 22
        settergetter_siswa narindra = new settergetter_siswa();
        narindra.setNISN("0055057947");
        narindra.setNama("NARINDRA RAFALLAH AVALLE");
        narindra.setAlamat("Danau Singkarak, Kec. Kedungkandang Madyopuro");
        narindra.setTTL("Malang, 2005-08-30");
        narindra.setTelp("+628224509680");
        
        String nisn22   = narindra.getNISN();
        String nama22   = narindra.getNama();
        String alamat22 = narindra.getAlamat();
        String ttl22    = narindra.getTTL();
        String telp22   = narindra.getTelp();
        
        //pengisian dan pemanggilan siswa 23
        settergetter_siswa nawla = new settergetter_siswa();
        nawla.setNISN("0052492020");
        nawla.setNama("NAWLA UWAIS PARSA BALQIS");
        nawla.setAlamat("Jl. Hayam Wuruk, Kec. Semanding Gedong Ombo");
        nawla.setTTL("Jember, 2005-05-02");
        nawla.setTelp("+6281335335600");
        
        String nisn23   = nawla.getNISN();
        String nama23   = nawla.getNama();
        String alamat23 = nawla.getAlamat();
        String ttl23    = nawla.getTTL();
        String telp23   = nawla.getTelp();
        
        //pengisian dan pemanggilan siswa 24
        settergetter_siswa nayang = new settergetter_siswa();
        nayang.setNISN("0053370777");
        nayang.setNama("NAYANG ETHA DINANTI");
        nayang.setAlamat("Jl. GUB. Suryo No. 13B , Kec. Jombang Jombatan");
        nayang.setTTL("Kediri, 2005-03-06");
        nayang.setTelp("+6285816588450");
        
        String nisn24   = nayang.getNISN();
        String nama24   = nayang.getNama();
        String alamat24 = nayang.getAlamat();
        String ttl24    = nayang.getTTL();
        String telp24   = nayang.getTelp();
        
        //pengisian dan pemanggilan siswa 25
        settergetter_siswa rafli = new settergetter_siswa();
        rafli.setNISN("0052239180");
        rafli.setNama("RAFLI FERIAN TSANY");
        rafli.setAlamat("Jl. Serayu 15, Kec. Blimbing Bunul Rejo");
        rafli.setTTL("Malang, 2005-0-27");
        rafli.setTelp("+62336269632");
        
        String nisn25   = rafli.getNISN();
        String nama25   = rafli.getNama();
        String alamat25 = rafli.getAlamat();
        String ttl25    = rafli.getTTL();
        String telp25   = rafli.getTelp();
        
        //pengisian dan pemanggilan siswa 26
        settergetter_siswa raihan = new settergetter_siswa();
        raihan.setNISN("00542066510");
        raihan.setNama("RAIHAN FAROOS SEMESTA EFFENDI");
        raihan.setAlamat("Jl. Argopuro Perum Kopian Indah, Kec. Kademangan");
        raihan.setTTL("Probolinggo, 2005-03-28");
        raihan.setTelp("+6285235464704");
        
        String nisn26   = raihan.getNISN();
        String nama26   = raihan.getNama();
        String alamat26 = raihan.getAlamat();
        String ttl26    = raihan.getTTL();
        String telp26   = raihan.getTelp();
        
        //pengisian dan pemanggilan siswa 27
        settergetter_siswa rizki = new settergetter_siswa();
        rizki.setNISN("0044065490");
        rizki.setNama("RAIHAN RIZKI ALFAREZA");
        rizki.setAlamat("Gedongan VII/12, Kec. Magersari Gedongan");
        rizki.setTTL("Mojokerto, 2004-09-18");
        rizki.setTelp("+6282140424376");
        
        String nisn27   = rizki.getNISN();
        String nama27   = rizki.getNama();
        String alamat27 = rizki.getAlamat();
        String ttl27    = rizki.getTTL();
        String telp27   = rizki.getTelp();
        
        //pengisian dan pemanggilan siswa 28
        settergetter_siswa raka = new settergetter_siswa();
        raka.setNISN("0054269986");
        raka.setNama("RAKA VALRIZQY AKHDANSYAH");
        raka.setAlamat("Jl. Dr. Wahidin 107, Kec. Kalisat Krajan");
        raka.setTTL("Jember, 2005-02-10");
        raka.setTelp("+6281333670716");
        
        String nisn28   = raka.getNISN();
        String nama28   = raka.getNama();
        String alamat28 = raka.getAlamat();
        String ttl28    = raka.getTTL();
        String telp28   = raka.getTelp();
        
        //pengisian dan pemanggilan siswa 29
        settergetter_siswa satria = new settergetter_siswa();
        satria.setNISN("0045552146");
        satria.setNama("SATRIA YUDHA ANWADANI HIDAYAT");
        satria.setAlamat("Dsn. Tamiajeng, Kec. Tumpang Pandanajeng");
        satria.setTTL("Malang, 2004-08-31");
        satria.setTelp("+6281231222436");
        
        String nisn29   = satria.getNISN();
        String nama29   = satria.getNama();
        String alamat29 = satria.getAlamat();
        String ttl29    = satria.getTTL();
        String telp29   = satria.getTelp();
        
        //pengisian dan pemanggilan siswa 30
        settergetter_siswa darrel = new settergetter_siswa();
        darrel.setNISN("0055922225");
        darrel.setNama("SATRIALDY DARREL FARIZI");
        darrel.setAlamat("Hamid Rusdi VI B/2043, Kec. Blimbing Bunulrejo");
        darrel.setTTL("Malang, 2005-01-06");
        darrel.setTelp("+628123286732");
        
        String nisn30   = darrel.getNISN();
        String nama30   = darrel.getNama();
        String alamat30 = darrel.getAlamat();
        String ttl30    = darrel.getTTL();
        String telp30   = darrel.getTelp();
        
        //pengisian dan pemanggilan siswa 31
        settergetter_siswa septa = new settergetter_siswa();
        septa.setNISN("0045765330");
        septa.setNama("SEPTA DWI PRASETYA");
        septa.setAlamat("Kec. Bendo Belotan, RT 34 RW 12");
        septa.setTTL("Magetan, 2004-09-05");
        septa.setTelp("+6282313947637");
        
        String nisn31   = septa.getNISN();
        String nama31   = septa.getNama();
        String alamat31 = septa.getAlamat();
        String ttl31    = septa.getTTL();
        String telp31   = septa.getTelp();
        
        //pengisian dan pemanggilan siswa 32
        settergetter_siswa steffano = new settergetter_siswa();
        steffano.setNISN("0044912437");
        steffano.setNama("STEFFANO ASIAN BUDI SETYO");
        steffano.setAlamat("Jl. Pesanggrahaan II/27A, Kec. Taman Taman");
        steffano.setTTL("Madiun, 2004-09-72");
        steffano.setTelp("+62812231606014");
        
        String nisn32   = steffano.getNISN();
        String nama32   = steffano.getNama();
        String alamat32 = steffano.getAlamat();
        String ttl32    = steffano.getTTL();
        String telp32   = steffano.getTelp();
        
        //pengisian dan pemanggilan siswa 33
        settergetter_siswa syahren = new settergetter_siswa();
        syahren.setNISN("3057328254");
        syahren.setNama("SYAHREN MAULANA ADIL HAKIM");
        syahren.setAlamat("Dusun Bagol RT 01 RW 01, Kec. Banyakan Nglabrak");
        syahren.setTTL("Kediri, 2005-02-04");
        syahren.setTelp("+6281335420048");
        
        String nisn33   = syahren.getNISN();
        String nama33   = syahren.getNama();
        String alamat33 = syahren.getAlamat();
        String ttl33    = syahren.getTTL();
        String telp33   = syahren.getTelp();
        
        //pengisian dan pemanggilan siswa 34
        settergetter_siswa tasya = new settergetter_siswa();
        tasya.setNISN("0045672898");
        tasya.setNama("TASYA SYAFIRA SINRANI");
        tasya.setAlamat("Dsn. Mulyosari, Kec. Kedungwaru Bulusari");
        tasya.setTTL("Tulungagung, 2004-03-22");
        tasya.setTelp("+6282339543169");
        
        String nisn34   = tasya.getNISN();
        String nama34   = tasya.getNama();
        String alamat34 = tasya.getAlamat();
        String ttl34    = tasya.getTTL();
        String telp34   = tasya.getTelp();
        
        //pengisian dan pemanggilan siswa 35
        settergetter_siswa yuliana = new settergetter_siswa();
        yuliana.setNISN("0053645811");
        yuliana.setNama("YULIANA NUR HANIFAH");
        yuliana.setAlamat("Karangsari, Kec Rejotangan Karangsari");
        yuliana.setTTL("Tulungagung, 2005-07-07");
        yuliana.setTelp("+6282331485451");
        
        String nisn35   = yuliana.getNISN();
        String nama35   = yuliana.getNama();
        String alamat35 = yuliana.getAlamat();
        String ttl35    = yuliana.getTTL();
        String telp35   = yuliana.getTelp();
        
        //pengisian dan pemanggilan siswa 36
        settergetter_siswa zidan = new settergetter_siswa();
        zidan.setNISN("0057316963");
        zidan.setNama("ZIDAN PUTRA RAHMAN");
        zidan.setAlamat("Kec. Srono, 68471");
        zidan.setTTL("Sleman, 2005-03-15");
        zidan.setTelp("+6281359137982");
        
        String nisn36   = zidan.getNISN();
        String nama36   = zidan.getNama();
        String alamat36 = zidan.getAlamat();
        String ttl36    = zidan.getTTL();
        String telp36   = zidan.getTelp();
        
        //pengisian dan pemanggilan siswa 37
        settergetter_siswa ziya = new settergetter_siswa();
        ziya.setNISN("3054436060");
        ziya.setNama("ZIYA INDI NURIL HABIBAH");
        ziya.setAlamat("Tegaron, Kec. Prambon Tegaron");
        ziya.setTTL("Nganjuk, 2005-09-09");
        ziya.setTelp("+6282140105175");
        
        String nisn37   = ziya.getNISN();
        String nama37   = ziya.getNama();
        String alamat37 = ziya.getAlamat();
        String ttl37    = ziya.getTTL();
        String telp37   = ziya.getTelp();
        
        //pengisian dan pemanggilan siswa 38
        settergetter_siswa zulfa = new settergetter_siswa();
        zulfa.setNISN("0045818243");
        zulfa.setNama("ZULFA RIZKA MELATI");
        zulfa.setAlamat("Ds. Ngujang, Kec. Kedungwaru Ngujang");
        zulfa.setTTL("Tulungagung, 2004-06-11");
        zulfa.setTelp("+6281217232100");
        
        String nisn38   = zulfa.getNISN();
        String nama38   = zulfa.getNama();
        String alamat38 = zulfa.getAlamat();
        String ttl38    = zulfa.getTTL();
        String telp38   = zulfa.getTelp();
        
        //Scanner input
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nomor absen : ");
        String absen = input.nextLine();  //input nomor absen
        
        //percabangan switch case untuk menampilkan pilihan absen
        switch(absen){
            case "1" :
                System.out.println("\nNISN   = "+nisn1);
                System.out.println("Nama   = "+nama1);
                System.out.println("Alamat = "+alamat1);
                System.out.println("TTL    = "+ttl1);
                System.out.println("Telp   = "+telp1);
                break;
            case "2" :
                System.out.println("\nNISN   = "+nisn2);
                System.out.println("Nama   = "+nama2);
                System.out.println("Alamat = "+alamat2);
                System.out.println("TTL    = "+ttl2);
                System.out.println("Telp   = "+telp2);
                break;
            case "3" :
                System.out.println("\nNISN   = "+nisn3);
                System.out.println("Nama   = "+nama3);
                System.out.println("Alamat = "+alamat3);
                System.out.println("TTL    = "+ttl3);
                System.out.println("Telp   = "+telp3);
                break;
            case "4" :
                System.out.println("\nNISN   = "+nisn4);
                System.out.println("Nama   = "+nama4);
                System.out.println("Alamat = "+alamat4);
                System.out.println("TTL    = "+ttl4);
                System.out.println("Telp   = "+telp4);
                break;
            case "5" :
                System.out.println("\nNISN   = "+nisn5);
                System.out.println("Nama   = "+nama5);
                System.out.println("Alamat = "+alamat5);
                System.out.println("TTL    = "+ttl5);
                System.out.println("Telp   = "+telp5);
                break;
            case "6" :
                System.out.println("\nNISN   = "+nisn6);
                System.out.println("Nama   = "+nama6);
                System.out.println("Alamat = "+alamat6);
                System.out.println("TTL    = "+ttl6);
                System.out.println("Telp   = "+telp6);
                break;
            case "7" :
                System.out.println("\nNISN   = "+nisn7);
                System.out.println("Nama   = "+nama7);
                System.out.println("Alamat = "+alamat7);
                System.out.println("TTL    = "+ttl7);
                System.out.println("Telp   = "+telp7);
                break;
            case "8" :
                System.out.println("\nNISN   = "+nisn8);
                System.out.println("Nama   = "+nama8);
                System.out.println("Alamat = "+alamat8);
                System.out.println("TTL    = "+ttl8);
                System.out.println("Telp   = "+telp8);
                break;
            case "9" :
                System.out.println("\nNISN   = "+nisn9);
                System.out.println("Nama   = "+nama9);
                System.out.println("Alamat = "+alamat9);
                System.out.println("TTL    = "+ttl9);
                System.out.println("Telp   = "+telp9);
                break;   
            case "10" :
                System.out.println("\nNISN   = "+nisn10);
                System.out.println("Nama   = "+nama10);
                System.out.println("Alamat = "+alamat10);
                System.out.println("TTL    = "+ttl10);
                System.out.println("Telp   = "+telp10);
                break;
            case "11" :
                System.out.println("\nNISN   = "+nisn11);
                System.out.println("Nama   = "+nama11);
                System.out.println("Alamat = "+alamat11);
                System.out.println("TTL    = "+ttl11);
                System.out.println("Telp   = "+telp11);
                break;
            case "12" :
                System.out.println("\nNISN   = "+nisn12);
                System.out.println("Nama   = "+nama12);
                System.out.println("Alamat = "+alamat12);
                System.out.println("TTL    = "+ttl12);
                System.out.println("Telp   = "+telp12);
                break;
            case "13" :
                System.out.println("\nNISN   = "+nisn13);
                System.out.println("Nama   = "+nama13);
                System.out.println("Alamat = "+alamat13);
                System.out.println("TTL    = "+ttl13);
                System.out.println("Telp   = "+telp13);
                break;
            case "14" :
                System.out.println("\nNISN   = "+nisn14);
                System.out.println("Nama   = "+nama14);
                System.out.println("Alamat = "+alamat14);
                System.out.println("TTL    = "+ttl14);
                System.out.println("Telp   = "+telp14);
                break;
            case "15" :
                System.out.println("\nNISN   = "+nisn15);
                System.out.println("Nama   = "+nama15);
                System.out.println("Alamat = "+alamat15);
                System.out.println("TTL    = "+ttl15);
                System.out.println("Telp   = "+telp15);
                break;
            case "16" :
                System.out.println("\nNISN   = "+nisn16);
                System.out.println("Nama   = "+nama16);
                System.out.println("Alamat = "+alamat16);
                System.out.println("TTL    = "+ttl16);
                System.out.println("Telp   = "+telp16);
                break;
            case "17" :
                System.out.println("\nNISN   = "+nisn17);
                System.out.println("Nama   = "+nama17);
                System.out.println("Alamat = "+alamat17);
                System.out.println("TTL    = "+ttl17);
                System.out.println("Telp   = "+telp17);
                break;
            case "18" :
                System.out.println("\nNISN   = "+nisn18);
                System.out.println("Nama   = "+nama18);
                System.out.println("Alamat = "+alamat18);
                System.out.println("TTL    = "+ttl18);
                System.out.println("Telp   = "+telp18);
                break;
            case "19" :
                System.out.println("\nNISN   = "+nisn19);
                System.out.println("Nama   = "+nama19);
                System.out.println("Alamat = "+alamat19);
                System.out.println("TTL    = "+ttl19);
                System.out.println("Telp   = "+telp19);
                break;   
            case "20" :
                System.out.println("\nNISN   = "+nisn20);
                System.out.println("Nama   = "+nama20);
                System.out.println("Alamat = "+alamat20);
                System.out.println("TTL    = "+ttl20);
                System.out.println("Telp   = "+telp20);
                break;
            case "21" :
                System.out.println("\nNISN   = "+nisn21);
                System.out.println("Nama   = "+nama21);
                System.out.println("Alamat = "+alamat21);
                System.out.println("TTL    = "+ttl21);
                System.out.println("Telp   = "+telp21);
                break;
            case "22" :
                System.out.println("\nNISN   = "+nisn22);
                System.out.println("Nama   = "+nama22);
                System.out.println("Alamat = "+alamat22);
                System.out.println("TTL    = "+ttl22);
                System.out.println("Telp   = "+telp22);
                break;
            case "23" :
                System.out.println("\nNISN   = "+nisn23);
                System.out.println("Nama   = "+nama23);
                System.out.println("Alamat = "+alamat23);
                System.out.println("TTL    = "+ttl23);
                System.out.println("Telp   = "+telp23);
                break;
            case "24" :
                System.out.println("\nNISN   = "+nisn24);
                System.out.println("Nama   = "+nama24);
                System.out.println("Alamat = "+alamat24);
                System.out.println("TTL    = "+ttl24);
                System.out.println("Telp   = "+telp24);
                break;
            case "25" :
                System.out.println("\nNISN   = "+nisn25);
                System.out.println("Nama   = "+nama25);
                System.out.println("Alamat = "+alamat25);
                System.out.println("TTL    = "+ttl25);
                System.out.println("Telp   = "+telp25);
                break;
            case "26" :
                System.out.println("\nNISN   = "+nisn26);
                System.out.println("Nama   = "+nama26);
                System.out.println("Alamat = "+alamat26);
                System.out.println("TTL    = "+ttl26);
                System.out.println("Telp   = "+telp26);
                break;
            case "27" :
                System.out.println("\nNISN   = "+nisn27);
                System.out.println("Nama   = "+nama27);
                System.out.println("Alamat = "+alamat27);
                System.out.println("TTL    = "+ttl27);
                System.out.println("Telp   = "+telp27);
                break;
            case "28" :
                System.out.println("\nNISN   = "+nisn28);
                System.out.println("Nama   = "+nama28);
                System.out.println("Alamat = "+alamat28);
                System.out.println("TTL    = "+ttl28);
                System.out.println("Telp   = "+telp28);
                break;
            case "29" :
                System.out.println("\nNISN   = "+nisn29);
                System.out.println("Nama   = "+nama29);
                System.out.println("Alamat = "+alamat29);
                System.out.println("TTL    = "+ttl29);
                System.out.println("Telp   = "+telp29);
                break;   
            case "30" :
                System.out.println("\nNISN   = "+nisn30);
                System.out.println("Nama   = "+nama30);
                System.out.println("Alamat = "+alamat30);
                System.out.println("TTL    = "+ttl30);
                System.out.println("Telp   = "+telp30);
                break;   
            case "31" :
                System.out.println("\nNISN   = "+nisn31);
                System.out.println("Nama   = "+nama31);
                System.out.println("Alamat = "+alamat31);
                System.out.println("TTL    = "+ttl31);
                System.out.println("Telp   = "+telp31);
                break;
            case "32" :
                System.out.println("\nNISN   = "+nisn32);
                System.out.println("Nama   = "+nama32);
                System.out.println("Alamat = "+alamat32);
                System.out.println("TTL    = "+ttl32);
                System.out.println("Telp   = "+telp32);
                break;
            case "33" :
                System.out.println("\nNISN   = "+nisn33);
                System.out.println("Nama   = "+nama33);
                System.out.println("Alamat = "+alamat33);
                System.out.println("TTL    = "+ttl33);
                System.out.println("Telp   = "+telp33);
                break;
            case "34" :
                System.out.println("\nNISN   = "+nisn34);
                System.out.println("Nama   = "+nama34);
                System.out.println("Alamat = "+alamat34);
                System.out.println("TTL    = "+ttl34);
                System.out.println("Telp   = "+telp34);
                break;
            case "35" :
                System.out.println("\nNISN   = "+nisn35);
                System.out.println("Nama   = "+nama35);
                System.out.println("Alamat = "+alamat35);
                System.out.println("TTL    = "+ttl35);
                System.out.println("Telp   = "+telp35);
                break;
            case "36" :
                System.out.println("\nNISN   = "+nisn36);
                System.out.println("Nama   = "+nama36);
                System.out.println("Alamat = "+alamat36);
                System.out.println("TTL    = "+ttl36);
                System.out.println("Telp   = "+telp36);
                break;
            case "37" :
                System.out.println("\nNISN   = "+nisn37);
                System.out.println("Nama   = "+nama37);
                System.out.println("Alamat = "+alamat37);
                System.out.println("TTL    = "+ttl37);
                System.out.println("Telp   = "+telp37);
                break;
            case "38" :
                System.out.println("\nNISN   = "+nisn38);
                System.out.println("Nama   = "+nama38);
                System.out.println("Alamat = "+alamat38);
                System.out.println("TTL    = "+ttl38);
                System.out.println("Telp   = "+telp38);
                break;    
            default :
                System.out.println("\nHANYA TERDAPAT 38 SISWA DI KELAS X RPL 2");
                break;
        }
    }
}
