public class Music {
    String name;
    String author;
    String genre;
    double price;
    Integer views;

    public Music(String name, String author, String genre, double price)){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.views = 0;
    }
    public void get_info(){
        System.out.println(this.name + " by " + this.author + ". genre: " + this.genre + ". Costs " +this.price);
    }

    public String toString(){
        return this.name + " by " + this.author ;
    }

    public void getViews(){
        System.out.println(this.name + " was listened " + this.views + " times");
    }
}

