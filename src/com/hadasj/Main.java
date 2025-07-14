package com.hadasj;

public class Main {

	private static final String TEXT = """
			Milan hledá a hledá, ale také neví, který je Cup a kde je Dup.
			""";

	public static void main(String[] args) {
		final Lexicon lexicon = new Lexicon(TEXT);
		System.out.println(lexicon.parse());
	}
}
