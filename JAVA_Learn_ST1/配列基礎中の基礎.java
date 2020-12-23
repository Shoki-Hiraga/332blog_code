public class 配列基礎中の基礎 {
  
    public static void main(String[] args) {
    int[] a = new int[3];
    a[0] = 1;
    a[1] = 3;
    a[2] = 10;
    
    System.out.println(a[0] + "  1要素ずつ出力");
    System.out.println(a[1] + "  1要素ずつ出力");
    System.out.println(a[2] + "  1要素ずつ出力");
    
    for (int i : a){
      System.out.println(i + "  拡張for");
    }
    
    for (int i = 0; i < a.length; i++){
      System.out.println(a[i] + "  ノーマルfor");//上の拡張for分の正式版
      
    }
    }
}
