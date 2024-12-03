public class Music {
    String name;
    String author;
    String genre;
    double price;

    public Music(String name, String author, String genre, double price)){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }
    public void get_info(){
        System.out.println(this.name + " by " + this.author + ". genre: " + this.genre + ". Costs " +this.price);
    }

    public String toString(){
        return this.name + " by " + this.author ;
    }
}

