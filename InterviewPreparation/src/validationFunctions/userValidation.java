package validationFunctions;

public class userValidation {
	
	public static boolean emailValidation(String email){
		if ((email.length() > 0) & (email.length() <= 255)){
			return true;
		}
		return false;
	}
	
	public static boolean nameValidation(String name){
		if ((name.length() > 0) & (name.length() <= 255)){
			return true;
		}
		return false;
	}
	
	public static boolean passwordValidation(String password){
		System.out.println("uhh "  + (password.length() >= 1));
		if (((password.length() >= 1) & (password.length() <= 45))){
			System.out.println("Im in");
			return true;
		}
		return false;
		
	}
	
	public static boolean passwordValidationRetype(String password, String retypedPassword){
		if ((password.equals(retypedPassword))){
			return true;
		}
		return false;
		
	}
	
	public static boolean contactNumberValidation (String contactNumber){
		if (contactNumber.length()== 11){
			return true;
		}
		return false;
	}
	
	public static boolean cityOrTownValidation(String cityOrTown){
		if ((cityOrTown.length() > 0) & (cityOrTown.length() <= 95)){
			return true;
		}
		return false;
	}
	
	public static boolean countyValidation(String county){
		if ((county.length() > 0) & (county.length() <= 45)){
			return true;
		}
		return false;
	}
	
	public static boolean postCodeValidation (String postCode){
		if ((postCode.length() > 5) & (postCode.length() <= 8)){
			return true;
		}
		return false;
	}
	
	
	
	

}
