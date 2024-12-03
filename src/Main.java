public class Main {
    public static void main(String[] args) {
        Music smile = new Music("Die with a smile", "Ester Junta", "pop",
                      "https://music.yandex.ru/album/33561249/track/131818709?utm_medium=copy_link", 30);
        Music judas = new Music("Judas", "lady Gaga", "pop",
                      "https://music.yandex.ru/album/220348/track/2202297?utm_medium=copy_link", 40);
        Music after = new Music("After hours","the Weekend", "pop",
                      "https://music.yandex.ru/album/10327453/track/62885781?utm_medium=copy_link", 45);
        Music standing = new Music("I'm still standing", "Elton John", "pop",
                         "https://music.yandex.ru/album/5114/track/20766?utm_medium=copy_link", 60);
        Music lights = new Music("Blinding lights", "the Weekend", "pop",
                       "https://music.yandex.ru/album/13707793/track/60292250?utm_medium=copy_link", 50);
        Music poker = new Music("Poker Face","lady Gaga", "pop",
                      "https://music.yandex.ru/album/8432683/track/81561?utm_medium=copy_link", 40);


        User Kutya = new User("Ermekov Kutmansher", "POP", 800);
        User Dastan = new User("Dastan David uulu", "indi", 120);
//        Kutya.getInfo();
//        Dastan.getInfo();
        Kutya.getBalance();
        Kutya.buyMusic(judas);
        Kutya.getBalance();


        Kutya.getBalance();
        Kutya.buyMusic(judas);
        // Kutya.buyMusic(standing);
        // Kutya.buyMusic(judas);
        // Kutya.buyMusic(standing);
        // Kutya.buyMusic(lights);
        // Kutya.buyMusic(poker);
        // Kutya.getBalance();
        // Dastan.getBalance();
        // Dastan.buyMusic(smile);
        Dastan.buyMusic(judas);
        // Dastan.buyMusic(poker);
        // Dastan.buyMusic(poker);
        // Dastan.buyMusic(poker);
        // Dastan.getBalance();
        // Kutya.getPlaylist();
        // Dastan.getPlaylist();


        Kutya.listenMusic(judas);
        Kutya.listenMusic(judas);
        Kutya.listenMusic(judas);
        Kutya.listenMusic(judas);
        Kutya.listenMusic(judas);
        Kutya.listenMusic(judas);
        Dastan.listenMusic(judas);
        Dastan.listenMusic(judas);
        Dastan.listenMusic(judas);
        judas.getViews();
        judas.getRate();
        judas.openVideo();
    }
}
