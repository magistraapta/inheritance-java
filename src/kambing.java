public class kambing extends hewan implements edible {
    public kambing(String nama, String suara, String makan) {
        super(nama, suara, makan);
    }

    @Override
    public void makanan() {
        // TODO Auto-generated method stub
        super.makanan();
    }

    @Override
    public void suara() {
        // TODO Auto-generated method stub
        super.suara();
    }

    @Override
    public void dimasak() {
        System.out.println("\n"+nama + " enak dimakan\n");
    }
}
