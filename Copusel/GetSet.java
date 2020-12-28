public class GetSet {
private String movie;
private String date;
private int price;

    public GetSet(String movie, String date, int price) {
        this.movie = movie;
        this.date = date;
        this.price = price;
    }
    
    public void setMovie(String movie) {
        this.movie = movie;
    }
    
    public String getMovie() {
        return this.movie;
    }
    
    public void checkmovie() {
        System.out.println("checkmovieメソッドで映画の情報を確認する");
        System.out.println(this.movie);
        System.out.println(this.date);
        System.out.println(this.price + "円");

    }
    
    public void field() {
        System.out.println("フィールド値、privateを取得");
        System.out.println(movie);
        System.out.println(date);        
        System.out.println(price);
    }
    
}