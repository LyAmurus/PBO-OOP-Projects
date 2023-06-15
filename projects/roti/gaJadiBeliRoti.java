package roti;

import tokoroti.TokoRoti;

public class gaJadiBeliRoti extends TokoRoti{
    private String alasan;
    
    public gaJadiBeliRoti (String namaPembeli, int noAntrian, String jenisRoti, int hargaRoti, String rasaRoti, String alasan){
        super (namaPembeli, noAntrian, jenisRoti, hargaRoti, rasaRoti);
        this.alasan = alasan;
    }
    
    public void gaJadiBeliRotiDong(){
        System.out.println("yah roti ga jadi diorder, mungkin bukan rezekinya");
    }       
    
    public void kumpulanData(){
        super.kumpulanData(alasan);
    }

}
