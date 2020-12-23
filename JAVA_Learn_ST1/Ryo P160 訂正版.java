public class Ryo P160 訂正版 {
 public static void main(String[] args) {

    int[] seq = new int [10]; //0-9までの数字をsewの配列に入れる
        for (int i = 0; i < seq.length; i++){ //seqの長さ（10回）分繰り返す
            seq[i] = new java.util.Random() .nextInt(4); //0-3までの数字をseqの配列にランダムで代入
            char[] base = {'A', 'T', 'G', 'C'}; //base[0] = 'A', base[1] = 'T', base[2] = 'G', base[3] = 'C'
            System.out.print(base[seq[i]] + " ");  //seq[i] = 0-4までの数字をランダムに代入。つまりbase[seq[i]] = baseのインデックス0-3の文字を出力する
            }
 }
}

/*上記プログラムを分解するとこういうこと。
そして、これを実行しても上記と同様の結果が出る！
public class Main {
	public static void main(String[] args) {

    int[] seq = new int [10];
        for (int i = 0; i < seq.length; i++){
            seq[i] = new java.util.Random() .nextInt(4);
            char[] base = new char [4];
            base[0] = 'A';
            base[1] = 'T';
            base[2] = 'G';
            base[3] = 'C';
            System.out.print(base[seq[i]] + " ");
            }
	}
}
*/