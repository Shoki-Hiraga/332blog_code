public class Mago extends Oya{
//String magoName;
    public Mago(String oyaName) {
        super(oyaName);
        
        System.out.println("～～～～～孫クラス 継承外～～～～～");
        System.out.println("上記に【super(magoName)】をMago.java 内で宣言して、");
        System.out.println("親クラスコンストラクタを呼び出しているが、2．は継承されず出力されない");        
    }
}