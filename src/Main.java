public class Main {

    public static void main(String[] args) {

        Genre pop = new Genre("POP");
        Author clean_bandit = new Author("Clean", "Bandit");
        Author kavinsky = new Author("Kavinsky", "Kavinsky");
        Author mitski = new Author("Mitski", "Matsubara");

//
        Music symphony = new Music("symphony",  clean_bandit, pop,
                "https://www.youtube.com/watch?v=aatr_2MstrI", 246, 40);
        Music night_call = new Music("Night call",kavinsky, pop,
                "https://www.youtube.com/watch?v=MV_3Dpw-BRY", 256, 55);
        Music real_hero = new Music("Real Hero", clean_bandit,pop,
                "https://www.youtube.com/watch?v=BHgYtKkSEDA",267, 60);
        Music my_love = new Music("My Love Mine All Mine ", mitski, pop,
                "https://www.youtube.com/watch?v=CwGbMYLjIpQ", 138, 50);

        Music never_gone = new Music("Never Gone give you ap", clean_bandit, pop,
                "https://www.youtube.com/watch?v=dQw4w9WgXcQ", 212, 40);

        User Ryan = new User("Ryan Gosling", "POP", 500);
        User Temi = new User("Temirlan Emilbekov", "Metal", 120);

        Ryan.buyMusic(night_call, 5);


        never_gone.openVideo();

    }

}
