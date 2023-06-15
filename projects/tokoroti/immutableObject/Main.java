package immutableObject;

public class Main {
    public static void main(String[] args) {
        TokoRoti roti1 = new TokoRoti("Andi", 1, "Roti Tawar", 5000, "Manis");
        TokoRoti roti2 = new TokoRoti("Budi", 2, "Roti Sobek", 7000, "Asin");
        TokoRoti roti3 = new TokoRoti("Rijal Fauzi", 3, "Roti Gandum", 9000, "Pedas");

        System.out.println("Data Roti 1:");
        roti1.kumpulanData();

        System.out.println("\nData Roti 2:");
        roti2.kumpulanData();

        System.out.println("\nData Roti 3:");
        roti3.kumpulanData();
        
    }
}
