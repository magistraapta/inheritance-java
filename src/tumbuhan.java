public abstract class tumbuhan {
    String nama;
    String jenis;
    int id;

    public tumbuhan (String nama, String jenis, int id){
        this.nama = nama;
        this.jenis = jenis;
        this.id = id;
    }

    public void display(){
        System.out.println("Nama tumbuhan ini : " + nama);
        System.out.println("Jenis tumbuhan ini : " + jenis);
    }
}
