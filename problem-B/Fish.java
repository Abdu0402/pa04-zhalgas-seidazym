public class Fish extends Animal implements Pet{
    String name;

    public Fish(String name){
        super(0);
        this.name = name;
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
    public void play(){
        System.out.println("Fishes are playing");
    }
    @Override 
    public void walk(){
        System.out.println("Fishes can not walk and they do not have legs :)");
    }
    @Override
    public void eat(){
        System.out.println("Fishes are eating water insects");
    }
}
