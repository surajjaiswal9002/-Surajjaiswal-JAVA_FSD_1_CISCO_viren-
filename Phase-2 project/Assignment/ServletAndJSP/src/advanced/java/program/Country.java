package advanced.java.program;

public class Country {

	  private String flag;
	  private String name;
	  private String fullName;
	  private String capital;
	  private String phoneCode;
	  private String topLevelDomain;
	  private String region;

	  public Country(String flag, String name, String fullName, String capital, String phoneCode, String topLevelDomain, String region) {
	    this.flag = flag;
	    this.name = name;
	    this.fullName = fullName;
	    this.capital = capital;
	    this.phoneCode = phoneCode;
	    this.topLevelDomain = topLevelDomain;
	    this.region = region;
	  }

	  public String getFlag() {
	    return flag;
	  }

	  public String getName() {
	    return name;
	  }

	  public String getFullName() {
	    return fullName;
	  }

	  public String getCapital() {
	    return capital;
	  }

	  public String getPhoneCode() {
	    return phoneCode;
	  }

	  public String getTopLevelDomain() {
	    return topLevelDomain;
	  }

	  public String getRegion() {
	    return region;
	  }
	 }
