import com.polban.akademik.*;
/**
 * App
 */
public class App {
    public static void main(String[] args) {
        Mahasiswa[] mahasiswa = new Mahasiswa[10];
        mahasiswa[0] = new Mahasiswa("HAIKAL HARIYANTO", 20, "231511081");
        mahasiswa[1] = new Mahasiswa("WILDAN GUMILANG", 20, "231511087");
        mahasiswa[2] = new Mahasiswa("SULTHAN AULIA RAHMAN", 20, "231511093");
        mahasiswa[3] = new Mahasiswa("FAUZAN RIZKY RAMADHAN", 20, "231511075");
        mahasiswa[4] = new Mahasiswa("DZAKI NURHIDAYAT", 20, "231511078");
        mahasiswa[5] = new Mahasiswa("HAFIZ AL IKHSAN", 20, "231511073");
        mahasiswa[6] = new Mahasiswa("ABYAN DZAKY", 20, "231511065");
        mahasiswa[7] = new Mahasiswa("RADITYA RAYA", 20, "231511086");
        mahasiswa[8] = new Mahasiswa("FAKHRIE RIZDAN", 20, "231511077");
        mahasiswa[9] = new Mahasiswa("DIO RAHMAN", 20, "231511070");

        Dosen[] dosen = new Dosen[10];
        dosen[0] = new Dosen("JONNER HUTAHAEAN", 50, "123456");
        dosen[1] = new Dosen("RIZQI SOLAHUDDIN", 47, "345678");
        dosen[2] = new Dosen("ADE CHANDRA", 53, "124532");
        dosen[3] = new Dosen("ZULKIFLI ARSYAD", 42, "09742");
        dosen[4] = new Dosen("YUDI WIDHIYASANA", 48, "92447");
        dosen[5] = new Dosen("SANTI SUNDARI", 47, "028456");
        dosen[6] = new Dosen("YADHI ADITYA", 50, "345678");
        dosen[7] = new Dosen("SUPRIHANTO", 54, "2348529");
        dosen[8] = new Dosen("ADE HODIJAH", 57, "204670");
        dosen[9] = new Dosen("TRISNA GELAR", 45, "204567");

        MataKuliah[] mataKuliah = new MataKuliah[10];
        mataKuliah[0] = new MataKuliah("21IF001", "PBO");
        mataKuliah[1] = new MataKuliah("21IF002", "PRPL");
        mataKuliah[2] = new MataKuliah("21IF003", "Komgraf");
        mataKuliah[3] = new MataKuliah("21IF004", "Matdis");
        mataKuliah[4] = new MataKuliah("21IF005", "Basdat");
        mataKuliah[5] = new MataKuliah("21IF006", "Aljabar Linear");
        mataKuliah[6] = new MataKuliah("21IF007", "DDP");
        mataKuliah[7] = new MataKuliah("21IF008", "Komdatjar");
        mataKuliah[8] = new MataKuliah("21IF009", "Proyek 3");
        mataKuliah[9] = new MataKuliah("21IF010", "SDA");

        Ruangan[] ruangans = new Ruangan[4];
        ruangans[0] = new Ruangan("D101", "Ruang Kelas");
        ruangans[1] = new Ruangan("D102", "Lab Multimedia");
        ruangans[2] = new Ruangan("D106", "Lab Database");
        ruangans[3] = new Ruangan("D217", "Ruang Kelas");

        System.out.println("--- MAHASISWA ---");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.print(i+1 + ". ");
            mahasiswa[i].info();
            System.out.println("");
        };
        
        System.out.println("--- DOSEN ---");
        for (int i = 0; i < dosen.length; i++) {
            System.out.print(i+1 + ". ");
            dosen[i].info();
            System.out.println("");
            
        };
        
        System.out.println("--- JADWAL 2C-D3 ---");
        Jadwal[] jadwal2C = new Jadwal[5];
        jadwal2C[0] = new Jadwal("Senin", "08.40-10.20", dosen[6], mataKuliah[0], ruangans[3]);
        jadwal2C[1] = new Jadwal("Selasa", "10.20-12.20", dosen[5], mataKuliah[1], ruangans[0]);
        jadwal2C[2] = new Jadwal("Rabu", "07.00-16.40", dosen[9], mataKuliah[8], ruangans[1]);
        jadwal2C[3] = new Jadwal("Kamis", "15.50-18.20", dosen[3], mataKuliah[0], ruangans[2]);
        jadwal2C[4] = new Jadwal("Jum'at", "07.00-14.20", dosen[8], mataKuliah[4], ruangans[2]);

        for (int i = 0; i < jadwal2C.length; i++) {
            jadwal2C[i].tampilkanJadwal();
            System.out.println("");
        };
    }
}