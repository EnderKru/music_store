public class Main {
    public static void main(String[] args) {
        Music smile = new Music("Die with a smile", "Ester Junta", "pop", 30);
        Music judas = new Music("Judas", "lady Gaga", "pop", 40);
        Music after = new Music("After hours","the Weekend", "pop", 45);
        Music standing = new Music("I'm still standing", "Elton John", "pop", 60);
        Music lights = new Music("Blinding lights", "the Weekend", "pop", 50);
        Music poker = new Music("Poker Face","lady Gaga", "pop", 40);


        User Kutya = new User("Ermekov Kutmansher", "POP", 800);
        User Dastan = new User("Dastan David uulu", "indi", 120);
//        Kutya.getInfo();
//        Dastan.getInfo();
        Kutya.getBalance();
        Kutya.buyMusic(judas);
        Kutya.getBalance();


        Kutya.getBalance();
        Kutya.buyMusic(judas);
        Kutya.buyMusic(standing);
        Kutya.buyMusic(judas);
        Kutya.buyMusic(standing);
        Kutya.buyMusic(lights);
        Kutya.buyMusic(poker);
        Kutya.getBalance();
        Dastan.getBalance();
        Dastan.buyMusic(smile);
        Dastan.buyMusic(judas);
        Dastan.buyMusic(poker);
        Dastan.buyMusic(poker);
        Dastan.buyMusic(poker);
        Dastan.getBalance();
        Kutya.getPlaylist();
        Dastan.getPlaylist();


        Kutya.listenMusic(judas);
        Kutya.listenMusic(standing);
        Kutya.listenMusic(lights);
        Kutya.listenMusic(lights);
        Kutya.listenMusic(lights);
        Kutya.listenMusic(lights);
        Dastan.listenMusic(lights);
        Dastan.listenMusic(lights);
        Dastan.listenMusic(lights);
        Dastan.getDownloads();
        Dastan.getViews();
    }
}
