import java.util.Vector;
public class User {
    String name;
    String favorite_genre;
    double money;
    Vector<Music> playList;
    public User(String name, String favorite_genre, double money){
        this.name = name;
        this.favorite_genre = favorite_genre;
        this.money = money;
        this.playList = new Vector<Music>();;
    }
    public void getInfo(){
        System.out.println(this.name + " likes " + this.favorite_genre); ;
    }
    public void getBalance(){
         System.out.println(this.name + " has " + this.money) ;
    }
    public void buyMusic(Music music){
        this.playList.add(music);
        this.money -= music.price;
        System.out.println(this.name + " bought " + music + " for " + music.price);
    }
}
