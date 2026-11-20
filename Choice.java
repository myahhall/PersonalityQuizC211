/*
 * Project: PersonalityQuizC211
 * Author: Myah Hall
 * Date: 11/19/2026
 * Description: This class represents an answer choice in the
 * personality quiz and connects it to a personality type.
 */

public class Choice {
	
	// Storing the answer text and its associated personality type
	private String text;
	private PersonalityType personalityType;
	
	// Creating an answer choice with default values
	public Choice() {
		text = "";
		personalityType = null;
	}
	
	// Creating an answer choice with text and a personality type
	public Choice(String text, PersonalityType personalityType) {
		this.text = text;
		this.personalityType = personalityType;
	}
	
	// Returning the text of the answer choice 
	public String getText() {
		return text;
	}
	
	// Updating the text of the answer choice
	public void setText(String text) {
		this.text = text;
	}
	
	// Returning the personality type that is associated with the choice
	public PersonalityType getPersonalityType() {
		return personalityType;
	}
	
	// Updating the personality type that is associated with the choice.
	public void setPersonalityType(PersonalityType personalityType) {
		this.personalityType = personalityType;
	}
	

}
