package PesananKue;

public class pelanggan {
    private String name;
    private int noHp;
    private String alamat;

    public pelanggan(String name, int noHp, String alamat) {
        this.name = name;
        this.noHp = noHp;
        this.alamat = alamat;
    }
    public void GetDetails(){
        System.out.println("nama : " + getName());
        System.out.println("no. Hp : " + getNoHp());
        System.out.println("Domisili : " +getAlamat());
    }

    public String getName() {
        return name;
    }

    public int getNoHp() {
        return noHp;
    }

    public String getAlamat() {
        return alamat;
    }
}
