/*
 * Project: PersonalityQuizC211
 * Author: Myah Hall
 * Date: 11/19/2026
 * Description: This class represents a personality type in the quiz and stores its name and description.
 */

public class PersonalityType {
	// Storing the name and description of a personality type
	private String name;
	private String description;
	
	// Creating a personality type with default values
	public PersonalityType() {
		name = "";
		description = "";
	}

	// Creating a personality type with a name and description
	public PersonalityType(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	// Returning the name of the personality type 
	public String getName() {
		return name;
	}
	
	// Updating the name of the personality type
	public void setName(String name) {
		this.name = name;
	}
	
	// Returning the description of the personality type
	public String getDescription() {
		return description;
	}
	
	// Updating the description of the personality type
	public void setDescription(String description) {
		this.description = description;
	}
	
}
