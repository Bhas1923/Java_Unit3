class HiddenClass {
    private int secret = 100;

    void showSecret() {
        System.out.println("Secret value is hidden inside the class");
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        HiddenClass h = new HiddenClass();
        h.showSecret();
    }
}
