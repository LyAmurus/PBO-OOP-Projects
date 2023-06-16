package generic;

import interfaces.interRoti;

public class Tokoroti<t, T> implements interRoti<T> {

    // T Adalah Kepanjangan dari Tipe Parameter
    private t tokorotiT;

    // Method Void Set Dengan Tipe Parameter T
    protected void setTokoroti(T TokoRoti) {
        this.tokorotiT = TokoRoti;
    }

    // Method Return Get Yang Mengembalikan Nilai tokoroti
    protected T getTokorotiT() {
        return tokorotiT;
    }

    @Override
    public void beliRotiDong() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'beliRotiDong'");
    }

    @Override
    public void gaJadiBeliRotiDong() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gaJadiBeliRotiDong'");
    }
}