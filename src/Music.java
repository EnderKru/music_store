public class Music {
    String name;
    String author;
    String genre;

    public Music(String name, String author, String genre){
        this.name = name;
        this.author = author;
        this.genre = genre;
    }
    public String get_info(){
        return this.name + " by " + this.author + ". genre: " + this.genre;
    }
}
