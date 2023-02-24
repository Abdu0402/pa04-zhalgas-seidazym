public class Rabbit extends Animal implements Pet{
    String name;

    public Rabbit(String name){
        super(4);
        this.name = name;
    }
    public Rabbit(){
        this("");
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public void eat(){
        System.out.println("Rabbits eat carrots");
    }
    @Override
    public void play(){
        System.out.println("Rabbits are playing");
    }
}
