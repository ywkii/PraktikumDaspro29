import java.util.Scanner;

public class StudiKasus229 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = input.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA")||
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah dokumen (0-4): ");
            int jumlahDokumen = input.nextInt();
            System.out.print("Peringkat juara (1, 2, 3, atau 0 jika bukan juara): ");
            int peringkat = input.nextInt();
            boolean isDokumenLengkap = (jumlahDokumen >= 4);

            if (!isDokumenLengkap) {
                int kurangDokumen = 4 - jumlahDokumen;
                System.out.println("Status: Dokumen tidak lengkap (kurang " + kurangDokumen + "dokumen). Dana penghargaan tidak diberikan.");
            } else {
                boolean isJuaraValid = (peringkat >= 1 && peringkat <= 3);
                if (isJuaraValid) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan. ");
                } else {
                    System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
                }
            }
        }
        else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah dokumen (0-4): ");
            int jumlahDokumen = input.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            int statusPkm = input.nextInt();
                        boolean isDokumenLengkap = (jumlahDokumen >=4);

                        if (!isDokumenLengkap) {
                            int kurangDokumen = 4 - jumlahDokumen;
                            System.out.println("Status: Dokumen tidak lengkap (kurang " + kurangDokumen + " dokumen). Dana penghargaan tidak diberikan. ");
                        } else {
                            boolean isLolosPkm = (statusPkm == 1);
                            if (isLolosPkm) {
                                System.out.println("Status: Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                            } else {
                                System.out.println("Status: Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
                            }
                        }
                    }
                    else if (jenisKegiatan.equalsIgnoreCase("LAINNYA")) {
                        System.out.println("Status: Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
                    }
                    else {
                        System.out.println("Status: Jenis kegiatan tidak valid.");
                    }

                    input.close();
    }
}