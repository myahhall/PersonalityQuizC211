/*
 * Project: PersonalityQuizC211
 * Author: Myah Hall
 * Date: 11/19/2026
 * Description: This class represents a question in the personality
 * quiz and stores its text, answer choices, and selected answer index.
 */

public class Question {
	
	// Storing the question text and available answer choices
	private String text;
	private Choice[] options;
	
	// Storing the index of the selected answer
	private int answerIndex;
	
	// Creating a question with default values
	public Question() {
		text = "";
		options = new Choice[0];
		answerIndex = -1;
	}
	
	// Creating a question with text and available answer choices
	public Question(String text, Choice[] options) {
		this.text = text;
		this.options = options;
		this.answerIndex = -1;
	}
	
	// Returning the text of the question
	public String getText() {
		return text;
	}
	
	// Updating the text of the question
	public void setText(String text) {
		this.text = text;
	}
	
	// Returning the available answer choices 
	public Choice[] getOptions() {
		return options;
	}
	
	// Updating the available answer choices
	public void setOptions(Choice[] options) {
		this.options = options;
	}
	
	// Returning the index of the selected answer
	public int getAnswerIndex() {
		return answerIndex;
	}
	
	// Updating the index of the selected answer
	public void setAnswerIndex(int answerIndex) {
		this.answerIndex = answerIndex;
	}

}
