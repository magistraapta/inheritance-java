import java.lang.reflect.Constructor;

public abstract class hewan  {
    String nama;
    String suara;
    String makan;

   public hewan (String nama, String suara, String makan){
    this.suara= suara;
    this.makan= makan;
    this.nama= nama;
   } 

   public void suara(){
    System.out.println("Suara " + nama + " : " + suara);
   }

   public void makanan(){
    System.out.println(nama + " suka makan " + makan);
   }
}
