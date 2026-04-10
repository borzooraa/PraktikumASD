public class cmMahasiswa23 {
    String nim, nama, prodi;

    cmMahasiswa23(String nim, String nama, String Prodi){
        this.nim=nim;
        this.nama=nama;
        this.prodi=Prodi;
    }

    public void tampilMahasiswa(){
        System.out.println(nim+" | "+nama+" | "+prodi+" | ");
        
    }
}
