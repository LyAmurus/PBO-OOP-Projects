package roti;


import tokoroti.TokoRoti;

public class beliRoti extends TokoRoti implements interfaces.interRoti{
    private String toping;
    private String pesan;
    
    public beliRoti(String namaPembeli, int noAntrian, String jenisRoti, int hargaRoti, String rasaRoti, String toping, String pesan){
        super (namaPembeli, noAntrian, jenisRoti, hargaRoti, rasaRoti);
        this.toping = toping;
        this.pesan = pesan;
    }
    @Override
    public void kumpulanData(Object... args) {
        if (args.length == 0) {
            super.kumpulanData();
            System.out.println("Toping : " + toping);
            System.out.println("Pesan : " + pesan);
        } else if (args.length == 1) {
            System.out.println("\n");
            super.kumpulanData();
            System.out.println("Toping : " + toping);
            System.out.println("Pesan : " + pesan);
            System.out.println("Alasan : " + args[0]);
        }
    }
    
    @Override
    public void gaJadiBeliRotiDong(){
        System.out.println("yah roti ga jadi diorder, mungkin bukan rezekinya");
    }
    @Override
    public void beliRotiDong(){
        System.out.println("asik roti berhasil diorder, segera kirimkan pesanan");
    }
}
