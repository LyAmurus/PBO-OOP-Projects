package immutableObject;

public final class TokoRoti {
    
    private final String namaPembeli;
    private final int noAntrian;
    private final String jenisRoti;
    private final int hargaRoti;
    private final String rasaRoti;
    
    public TokoRoti(String namaPembeli, int noAntrian, String jenisRoti, int hargaRoti, String rasaRoti) {
        this.namaPembeli = namaPembeli;
        this.noAntrian = noAntrian;
        this.jenisRoti = jenisRoti;
        this.hargaRoti = hargaRoti;
        this.rasaRoti = rasaRoti;
    }
    
    public String getNamaPembeli() {
        return namaPembeli;
    }
    
    public int getNoAntrian() {
        return noAntrian;
    }
    
    public String getJenisRoti() {
        return jenisRoti;
    }
    
    public int getHargaRoti() {
        return hargaRoti;
    }
    
    public String getRasaRoti() {
        return rasaRoti;
    }
    
    public void kumpulanData() {
        System.out.println("Nama pembeli  : " + getNamaPembeli());
        System.out.println("No antrian    : " + getNoAntrian());
        System.out.println("Jenis roti    : " + getJenisRoti());
        System.out.println("Harga roti    : " + getHargaRoti());
        System.out.println("Rasa roti     : " + getRasaRoti());
    }
}