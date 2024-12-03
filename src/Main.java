public class Main {
    public static void main(String[] args) {
        Music smile = new Music("Die with a smile", "Ester Junta", "pop");
        Music judas = new Music("Judas", "lady Gaga", "pop");
        Music after = new Music("After hours","the Weekend", "pop");


        User Kutya = new User("Ermekov Kutmansher", "POP", 800);
        User Dastan = new User("Dastan David uulu", "indi", 120);
//        Kutya.getInfo();
//        Dastan.getInfo();
        Kutya.getBalance();
        Kutya.buyMusic(night_call);
        Kutya.getBalance();
    }
}
