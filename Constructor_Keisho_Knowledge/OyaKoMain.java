public class OyaKoMain {
    public static void main(String[] args) {
       Oya o = new Oya("親クラスの引数");
       System.out.println("");

       Ko k = new Ko();
       System.out.println("");
 
       Mago m = new Mago("孫クラスの引数");
    }
}
