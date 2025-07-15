package com.hadasj;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Rozdělení textu programem Lexicon:
 * 1. počet písmen ve slově
 * 2. vyloučení interpunkce
 * 3. počítání slov (některá slova mohou být víckrát)
 * 4. řazení podle délky slova, abecední řazení
 * 5. Dělka věty - počet slov, počet písmen
 */
public class Lexicon {

	private final String text;

	public Lexicon(final String text) {
		this.text = text;
	}

	public String parse() {
		final String[] slova = text.split(" ");
		String vystup = "";

		Arrays.sort(slova, Comparator.comparing(String::length));

		for (final String slovo : slova) {
			vystup += "\"" + slovo + "\" počet písmen: " + slovo.length() + "\n";
		}

		return vystup;
	}

}
