public class Country {
    private String nameOfCountry;
   private int populationOfCountry;
   private String nameOfPresident;
   private String currency;
   private String language;
   public void setNameOfCountry(String nameOfCountry){
       this.nameOfCountry=nameOfCountry;
   }
   public void setPopulationOfCountry(int populationOfCountry){
       this.populationOfCountry=populationOfCountry;
   }
   public void setNameOfPresident(String nameOfPresident){
       this.nameOfPresident= nameOfPresident;
   }
   public void setCurrency(String currency){
       this.currency=currency;
   }
   public void setLanguage(String language){
       this.language=language;
   }
   public String getNameOfCountry(){
       return nameOfCountry;
   }
   public int getPopilationOfCountry(){
       return populationOfCountry;
   }
   public String getNameOfPresident(){
       return nameOfPresident;
   }
   public String getCurrency (){
       return currency;
   }
   public String getLanguage(){
       return language;
   }

}
