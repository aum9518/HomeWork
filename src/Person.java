public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String nationality;
    private Country citizen;
    private City cityOfBorn;
    private Adress adress;
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setNationality(String nationality){
        this.nationality=nationality;
    }
    public void setCitizen(Country citizen){
        this.citizen=citizen;
    }
    public void setCityOfBorn(City cityOfBorn){
        this.cityOfBorn=cityOfBorn;
    }
    public void setAdress(Adress adress){
        this.adress=adress;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public String getNationality(){
        return nationality;
    }
    public Country getCitizen(){
        return citizen;
    }
    public City getCityOfBorn(){
        return cityOfBorn;
    }
    public Adress getAdress(){
        return adress;
    }
}
