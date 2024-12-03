public class Main {
    public static void main(String[] args) {
        Music smile = new Music("Die with a smile", "Ester Junta", "pop");
        Music judas = new Music("Judas", "lady Gaga", "pop");
        Music after = new Music("After hours","the Weekend", "pop");
        System.out.println(smile.get_info());
        System.out.println(judas.get_info());
        System.out.println(after.get_info());
    }
}
