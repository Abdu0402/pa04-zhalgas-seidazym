public class SportAndHobbyImpl implements PersonInterface, SportInterface, HobbyInterface{
    String name;
    int age;
    String myFavoriteSport;
    String myHobby;
    int theCostToPlayThisSport;

    public void setName(String myName){
        this.name = myName;
    }

    public void setAge(int myAge){
        this.age = myAge;
    }

    public String getMyFavoriteSport(){
        return this.myFavoriteSport;
    }

    public void setMyFavoriteSport(String sportName){
        this.myFavoriteSport = sportName;
    }
    

    public int howMuchItCostToPlayThisSport(){
        this.theCostToPlayThisSport = this.age * 10;
        return theCostToPlayThisSport;
    }
    
    public String whatIsMyHobbi(){
        return myHobby;
    }

    public void setMyHobby(String hobby){
        this.myHobby = hobby;
    }
}
