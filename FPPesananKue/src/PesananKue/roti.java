package PesananKue;

public class roti {
    private int pilihtipe;
    private int ukuran;
    private int hargaRoti;
    private String jenis;

    public roti( int hargaRoti, int pilihtipe, int ukuran, String jenis) {
        this.pilihtipe = pilihtipe;
        this.ukuran = ukuran;
        this.jenis = jenis;
        this.hargaRoti = hargaRoti;

    }

    roti(int tp){
        pilihtipe=tp;
        switch(pilihtipe){
            case 1:
                jenis="bolu";
                ukuran=25;
                hargaRoti=50000;
                break;
            case 2:
                jenis="sponge";
                ukuran=25;
                hargaRoti=60000;
                break;
            case 3:
                jenis="brownies";
                ukuran=25;
                hargaRoti=70000;
                break;
            case 4:
                jenis="bolu";
                ukuran=35;
                hargaRoti=80000;
                break;
            case 5:
                jenis="sponge";
                ukuran=35;
                hargaRoti=90000;
                break;
            case 6:
                jenis="brownies";
                ukuran=35;
                hargaRoti=100000;
                break;
            default:
                System.out.println("Input Salah");
        }
    }

    public void getDetails() {
        System.out.println("jenis : " + getJenis());
        System.out.println("ukuran : " + getUkuran());
    }

    public int getUkuran() {
        return ukuran;
    }

    public int getHargaRoti() {
        return hargaRoti;
    }

    public String getJenis() {
        return jenis;
    }

}
