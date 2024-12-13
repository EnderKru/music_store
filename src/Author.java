public class Author {
    String name;
    Integer quantity_music;


    public Author(String name){
        this.name = name;
        this.quantity_music = 0;
    }

    public String toString(){
        return this.name;
    }

    public String getInfo(){
        return this.name + " created " + this.quantity_music + " times";
    }
}
