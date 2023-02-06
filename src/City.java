public class City {
    private String nameOfCity;
    private int populationOfCity;
    private int founded;
    private double area;
    private int postalCode;

    public void setNameOfCity(String nameOfCity){
        this.nameOfCity=nameOfCity;
    }
    public void setPopulation(int populationOfCity){
        this.populationOfCity=populationOfCity;
    }
    public void setFounded(int founded){
        this.founded=founded;
    }
    public void setArea(double area){
        this.area=area;
    }
    public void setPostalCode(int postalCode){
        this.postalCode=postalCode;
    }
    public String getNameOfCity(){
        return nameOfCity;
    }
    public int getPopulationOfCity(){
        return populationOfCity;
    }
    public int getFounded(){
        return founded;
    }
    public double getArea(){
        return area;
    }
    public int getPostalCode(){
        return postalCode;
    }

}
