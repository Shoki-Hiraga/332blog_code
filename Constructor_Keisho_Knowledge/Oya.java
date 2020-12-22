public class Oya {
String oyaName;

    public Oya(String oyaName) {
        this.oyaName = oyaName;
        
        System.out.println("1. 親クラスコンストラクタを呼び出し");
        System.out.println("2. String型を引数にして ～【" + oyaName + "】～ を呼び出した");
        System.out.println("3. 親クラスコンストラクタを終了");
    }
}
    