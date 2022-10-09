public class wortel extends tumbuhan implements edible {
    public wortel(String nama, String jenis, int id){
        super(nama, jenis, id);
    }

    @Override
    public void dimasak() {
        System.out.println(nama + " enak dijadikan jus\n");
    }
}
