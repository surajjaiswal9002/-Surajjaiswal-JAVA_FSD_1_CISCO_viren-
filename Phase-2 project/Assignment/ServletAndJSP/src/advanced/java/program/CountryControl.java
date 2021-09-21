package advanced.java.program;

import java.util.ArrayList;
import java.util.List;

public class CountryControl {
  private List<Country>  countries= new ArrayList<Country>();

  public CountryControl() {
    countries.add(new Country("images/azerbaijan.png","Azerbaijan","Republic of Azerbaijan","Baku","+994",".az","Asia"));
    
    countries.add(new Country("images/bahamas.png","Bahamas","Commonwealth of the Bahamas","Nassau","+1-242",".bs","America"));
    
    countries.add(new Country("images/bahrain.png","Bahrain","Kingdom of Bahrain","Manama","+973",".bx","Asia"));
    
    countries.add(new Country("images/bangladesh.png","Bangladesh","People's Republic of Bangladesh","Dhaka","+880",".bd","Asia"));
  }

  public List<Country> getCountries() {
    return countries;
  }
  
}
