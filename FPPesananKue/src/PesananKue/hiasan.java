package PesananKue;

public class hiasan {
    private int pilihtema;
    private String tema;
    private int hargaHiasan;

    public hiasan(int pilihtema, String tema, int hargaHiasan) {
        this.pilihtema = pilihtema;
        this.tema = tema;
        this.hargaHiasan = hargaHiasan;
    }

    public String getTema() {
        return tema;
    }

    hiasan(int tm){
        pilihtema=tm;
        switch(pilihtema){
            case 1:
                tema="korean cake";
                hargaHiasan = 25000;
                break;
            case 2:
                tema="flower";
                hargaHiasan = 27000;
                break;
            case 3:
                tema="character cake";
                hargaHiasan = 30000;
                break;
            default:
                System.out.println("Input salah");;
        }

    }

    public void getDetails() {
        System.out.println("Tema Hiasan : " + getTema());
    }

    public int getHargaHiasan() {
        return hargaHiasan;
    }

}
