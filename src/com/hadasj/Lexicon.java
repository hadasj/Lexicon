package com.hadasj;

public class Lexicon {

	private String text;

	public Lexicon(final String text) {
		this.text = text;
	}

	public String parse() {
		final String[] slova = text.split(" ");
		String vystup = "";

		for (final String slovo : slova) {
			vystup += slovo + ": " + slovo.length() + "\n";
		}

		return vystup;
	}

}
