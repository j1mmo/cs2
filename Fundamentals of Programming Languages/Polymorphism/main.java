public class main {
    public static void main(String[] args) {
        GameObject cloud = new GameObject(new Drawn(), new Liquid(), new CanMove());
        GameObject building = new GameObject(new Drawn(), (CanBeHit) new CannotMove(), new CanMove());

    }
}
