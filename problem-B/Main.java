public class Main {
    public static void main(String[] args) {
        Fish d = new Fish();
        d.eat();
        d.walk();

        Rabbit r = new Rabbit();
        r.play();
        r.eat();
        r.walk();

        Animal a = new Spider();
        a.walk();
        a.eat();
    }
}
