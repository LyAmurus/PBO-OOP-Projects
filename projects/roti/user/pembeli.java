package roti.user;

import roti.beliRoti;
import roti.gaJadiBeliRoti;

public class pembeli {
    public static void main(String[] args){
        beliRoti pembeli1 = new beliRoti("Andi Surya Priyadi", 01, "Roti Belanda",12000 ,"Alpukat", "susu cokelat", "topingnya diratain ke semua tempat ya");
        gaJadiBeliRoti pembeli2 = new gaJadiBeliRoti("Andi Surya Priyadi", 01, "Roti Belanda", 12000 ,"Alpukat","pesanannya ditarik aja deh, ternyata di rumah masih banyak roti"); 
        
        beliRoti pembeli3 = new beliRoti("Mulyadi", 02, "Roti Jepang",15000 ,"Anggur", "susu Keju", "topingnya banyakin kejunya");
        gaJadiBeliRoti pembeli4 = new gaJadiBeliRoti("Mulyadi", 02, "Roti Jepang", 15000 ,"Anggur","Di cancel aja ya"); 

        beliRoti pembeli5 = new beliRoti("Rijal Fauzi", 03, "Roti O",13000 ,"Coklat", "Seres", "Tambahin coklat diatasnya");
        gaJadiBeliRoti pembeli6 = new gaJadiBeliRoti("Rijal Fauzi", 03, "Roti O", 13000 ,"Coklat","Di batalkan aja saya sudah telat"); 
    
    
    
    pembeli1.kumpulanData();

    pembeli1.beliRotiDong();
    
    pembeli2.kumpulanData();
    
    pembeli2.gaJadiBeliRotiDong(); 

    pembeli3.kumpulanData();

    pembeli3.gaJadiBeliRotiDong();

    pembeli4.kumpulanData();

    pembeli4.gaJadiBeliRotiDong();

    pembeli5.kumpulanData();

    pembeli5.gaJadiBeliRotiDong();

    pembeli6.kumpulanData();

    pembeli6.gaJadiBeliRotiDong();
    }

}
