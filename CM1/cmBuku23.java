public class cmBuku23 {
    String kode, judul;
    int tahun;

    cmBuku23(String kode, String judul, int tahun){
        this.kode = kode;
        this.judul = judul;
        this.tahun = tahun;
    }
    public void tampilBuku(){
        System.out.println(kode+" | "+judul+" | "+tahun+" | ");
    }
    
}
