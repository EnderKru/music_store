public class Main {

    public static void main(String[] args) {

        Genre pop = new Genre("POP");
        Genre rock = new Genre("ROCK");

        Author Bruno= new Author("Bruno Mars");
        Author ladyGaga = new Author("Lady Gaga");
        Author theWeeknd = new Author("The Weeknd");
        Author eltonJohn = new Author("Elton John");

//
        Music dieWithASmile = new Music("Die With A Smile",  Bruno, pop,
                "https://youtu.be/AdBzzpq3xV4?si=b8oBEvNe0k1tI77p", 40);
        Music judas = new Music("Judas",ladyGaga, pop,
                "https://www.youtube.com/watch?v=qF0PdgefNMY", 55);
        Music afterHours = new Music("After Hours", theWeeknd,pop,
                "https://www.youtube.com/watch?v=ygTZZpVkmKg",60);
        Music imStillStanding = new Music("I'm Still Standing", eltonJohn, rock,
                "https://music.yandex.ru/album/5114/track/20766?utm_medium=copy_link", 50);

        Music blindingLights = new Music("Blinding Lights", theWeeknd, pop,
                "https://www.youtube.com/watch?v=fHI8X4OXluQ", 40);
        Music pokerFace = new Music("Poker Face", ladyGaga, pop, "https://www.youtube.com/watch?v=gsLvizl5j4E", 40);

        User nikita = new User("Nikita Viktorovic", "POP", 500);
        User bayzak = new User("Bayzak David uulu", "ROCK", 120);

        bayzak.buyMusic(imStillStanding, 5);


        dieWithASmile.openVideo();


    }

}
