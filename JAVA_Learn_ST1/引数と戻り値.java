public class 引数と戻り値 {

///*
  public static void main(String[] args) {
  add(100, 10); //addメソッドからmainメソッドへ呼ぶ
  }

  public static void add(int x, int y){
  //addメソッドはmainメソッドの引数で受けた100と10をx と yに代入する
  int ans = x + y;
  //また、addメソッドはx と yを足し算して int型のansに代入する
  System.out.println("100 + 10は" + ans);
  }
//*/



///*
  public static void main(String[] args) {
  int ans = add(100, 10);
  //int型のansはaddメソッドに引数100 と 10を渡す
  System.out.println("100 + 10は" + ans);
  //addメソッドからansを受け取って出力する
  }

  public static int add(int x, int y) {
  //戻り値addメソッドはmainメソッドからの100 と 10をint x と int yに代入する
    int ans = x + y;
    //戻り値、addメソッドはx と yを足し算して int型のansに代入する
    return ans;
    //mainメソッドのansに上記で定義した「int ans = x + y;」を返す(戻り値)
  }
//*/

}



