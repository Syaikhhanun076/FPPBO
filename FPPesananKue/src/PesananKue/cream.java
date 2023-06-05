package PesananKue;

public class cream {
    private boolean AdaBuah;
    private int pilihcream;
    private String jeniscream;

    private int hargaCream;

    private String rasa;

    public cream(boolean adaBuah, int pilihcream, String jeniscream, String rasa, int hargaCream) {
        AdaBuah = adaBuah;
        this.pilihcream = pilihcream;
        this.jeniscream = jeniscream;
        this.rasa = rasa;
        this.hargaCream = hargaCream;
    }

    cream(int jc){
        pilihcream=jc;
        switch(pilihcream){
            case 1:
                jeniscream="whipped cream";
                rasa = "coklat";
                hargaCream = 10000;
                break;
            case 2:
                jeniscream="whipped cream";
                rasa = "vanilla";
                hargaCream = 10000;
                break;
            case 3:
                jeniscream="whipped cream";
                rasa = "stroberi";
                hargaCream = 10000;
                break;
            case 4:
                jeniscream="double cream";
                rasa = "coklat";
                hargaCream = 12000;
                break;
            case 5:
                jeniscream="double cream";
                rasa = "vanilla";
                hargaCream = 12000;
                break;
            case 6:
                jeniscream="double cream";
                rasa = "stroberi";
                hargaCream = 12000;
                break;
            default:
                System.out.println("Input Salah");
        }
    }

    public void getDetails() {
        System.out.println("Jenis cream : " + getJeniscream());

    }

    public String getJeniscream() {
        return jeniscream;
    }

    public void setBuah(boolean buah) {
        AdaBuah = buah;
    }

    public boolean AdaBuah() {
        return AdaBuah;
    }

    public int getHargaCream() {
        return hargaCream;
    }

    public void buah(){
        this.setBuah(true);
        System.out.println(this.getJeniscream() + " ditambah buah");
    }

    public void noBuah(){
        this.setBuah(false);
        System.out.println(this.getJeniscream() + " Buah dihilangkan");
    }
}
