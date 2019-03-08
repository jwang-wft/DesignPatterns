package com.wang.cleancode;

public class FunctionIsTooLong {

	public static void main(String[] args) {
		FunctionIsTooLong fitl = new FunctionIsTooLong();
		fitl.printGuessStatistics('B', 0);
		fitl.printGuessStatistics('B', 1);
		fitl.printGuessStatistics('B', 10);

		GuessStatisticsMessage gsm = new GuessStatisticsMessage();
		gsm.printMessage('A', 0);
		gsm.printMessage('A', 1);
		gsm.printMessage('A', 5);
	}

	// this function is little too long
	private void printGuessStatistics(char candidate, int count) {
		String number;
		String verb;
		String pluralModifier;
		if (count == 0) {
			number = "no";
			verb = "are";
			pluralModifier = "s";
		} else if (count == 1) {
			number = "1";
			verb = "is";
			pluralModifier = "";
		} else {
			number = Integer.toString(count);
			verb = "are";
			pluralModifier = "s";
		}
		String guessMessage = String.format("There %s %s %s%s", verb, number,
				candidate, pluralModifier);
		System.out.println(guessMessage);
	}
}

// make the long function as a class
class GuessStatisticsMessage {
	private String number;
	private String verb;
	private String pluralModifier;

	public void printMessage(char candidate, int count) {
		GuessStatisticsMessage msg = createPluralDependentMessageParts(count);
		msg.outputMessage(candidate);
	}
	
	private GuessStatisticsMessage createPluralDependentMessageParts(int count) {
		number = Integer.toString(count);
		switch (count) {
		case 0:
			return thereAreNoLetters();
		case 1:
			return thereIsOneLetter();
		default:
			return thereAreManyLetters(count);
		}
	}

	private GuessStatisticsMessage thereAreManyLetters(int count) {
		verb = "are";
		pluralModifier = "s";
		return this;
	}

	private GuessStatisticsMessage thereIsOneLetter() {
		verb = "is";
		pluralModifier = "";
		return this;
	}

	private GuessStatisticsMessage thereAreNoLetters() {
		number = "no";
		verb = "are";
		pluralModifier = "s";
		return this;
	}
	
	private void outputMessage(char candidate){
		String message = String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
		System.out.println(message);
	}
}
