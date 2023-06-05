package PesananKue;

public class pesanan {
    private int noPesanan;
    private roti rotiPesanan;
    private cream creamPesanan;
    private hiasan hiasanPesanan;
    private pelanggan pelangganPesanan;
    private int totalHarga;

    public pesanan(int noPesanan, roti rotiPesanan, cream creamPesanan, hiasan hiasanPesanan, pelanggan pelangganPesanan) {
        this.noPesanan = noPesanan;
        this.rotiPesanan = rotiPesanan;
        this.creamPesanan = creamPesanan;
        this.hiasanPesanan = hiasanPesanan;
        this.pelangganPesanan = pelangganPesanan;
    }

    public void HargaKue(){
        totalHarga = getCreamPesanan().getHargaCream() + getHiasanPesanan().getHargaHiasan() +
                getRotiPesanan().getHargaRoti();
        System.out.println("total harga kue anda : " + totalHarga);
    }

    public pelanggan getPelangganPesanan() {
        return pelangganPesanan;
    }

    public int getNoPesanan() {
        return noPesanan;
    }

    public roti getRotiPesanan() {
        return rotiPesanan;
    }

    public cream getCreamPesanan() {
        return creamPesanan;
    }

    public hiasan getHiasanPesanan() {
        return hiasanPesanan;
    }
}
