package PesananKue;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        pesanan[] Pesanan;
        Pesanan = new pesanan[5];
        Pesanan[1] = new pesanan(01,
                new roti(1),
                new cream(2),
                new hiasan(2),
                new pelanggan("sule", 1879129, "Surabaya"));
        Pesanan[2] = new pesanan(02,
                new roti(5),
                new cream(3),
                new hiasan(4),
                new pelanggan("Halimi", 6582580, "Jakarta"));
        Pesanan[3] = new pesanan(03,
                new roti(3),
                new cream(6),
                new hiasan(1),
                new pelanggan("Dona", 13547819, "Sidoarjo"));

        Scanner scr = new Scanner(System.in);
        boolean finish;
        boolean selesai = false;

        while (!selesai){
            System.out.println("ingin menampilkan pesanan ke- berapa (1-3)?" +
                    "\n\tKlik 4 jika ingin keluar");
            int pilih = scr.nextInt();
            if(pilih==4){
                selesai = true;
            }else {
                System.out.println("no pesanan: " + Pesanan[pilih].getNoPesanan());
                finish = false;
                while(!finish){
                    System.out.println("Pilih Detail Pesanan" +
                            "\n\t1. Roti" +
                            "\n\t2. Cream" +
                            "\n\t3. Hiasan" +
                            "\n\t4. Harga" +
                            "\n\t5. Pelanggan"+
                            "\n\t6. Quit");
                    int choice = scr.nextInt();
                    switch (choice){
                        case 1:
                            Pesanan[pilih].getRotiPesanan().getDetails();
                            break;
                        case 2:
                            Pesanan[pilih].getCreamPesanan().getDetails();
                            if(Pesanan[pilih].getCreamPesanan().AdaBuah()){
                                System.out.println("Pencet satu jika mau tanpa buah? ");
                                if(scr.nextInt()==1){
                                    Pesanan[pilih].getCreamPesanan().noBuah();
                                }else {
                                    continue;
                                }
                            }else {
                                System.out.println("pencet 1 jika mau ditambah buah");
                                if (scr.nextInt() == 1){
                                    Pesanan[pilih].getCreamPesanan().buah();
                                }else {
                                    continue;
                                }
                            }
                            break;
                        case 3:
                            Pesanan[pilih].getHiasanPesanan().getDetails();
                            break;
                        case 4:
                            Pesanan[pilih].HargaKue();
                            break;
                        case 5:
                            Pesanan[pilih].getPelangganPesanan().GetDetails();
                            break;
                        case 6:
                            finish = true;
                            break;
                    }
                }
            }


        }

    }
}
