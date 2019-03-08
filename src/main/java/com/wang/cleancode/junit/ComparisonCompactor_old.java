package com.wang.cleancode.junit;

public class ComparisonCompactor_old {
	private static final String ELLIPSIS = "...";
	private static final String DELTA_END = "]";
	private static final String DELTA_START = "[";
	private int fContextLength;
	private String expected;
	private String actual;
	private String compactExpected;
	private String compactActual;
	private int prefixIndex;
	private int suffixIndex;

	public ComparisonCompactor_old(int contextLength, String expected, String actual) {
		fContextLength = contextLength;
		this.expected = expected;
		this.actual = actual;
	}
	public String formatCompactedComparison(String message) {
		if (canBeCompacted()) {
			compactExpectedAndActual();
			return format(message, compactExpected, compactActual);
		}
		return format(message, expected, actual);
	}

	private void compactExpectedAndActual() {
		findCommonPrefixAndSuffix();
		compactExpected = compactString(expected);
		compactActual = compactString(actual);
	}

	private boolean canBeCompacted() {
		return expected != null && actual != null && !areStringsEqual();
	}

	private String compactString(String source) {
		String result = DELTA_START + source.substring(prefixIndex, source.length() - suffixIndex + 1) + DELTA_END;
		if (prefixIndex > 0)
			result = computeCommonPrefix() + result;
		if (suffixIndex > 0)
			result = result + computeCommonSuffix();
		return result;
	}
	private void findCommonPrefixAndSuffix(){
		findCommonPrefix();
		int expectedSuffix = expected.length() - 1;
		int actualSuffix = actual.length() - 1;
		for (; actualSuffix >= prefixIndex && expectedSuffix >= prefixIndex; actualSuffix--, expectedSuffix--) {
			if (expected.charAt(expectedSuffix) != actual.charAt(actualSuffix))
				break;
		}
		suffixIndex = expected.length() - expectedSuffix;
	}
	
	private void findCommonPrefix() {
		prefixIndex = 0;
		int end = Math.min(expected.length(), actual.length());
		for (; prefixIndex < end; prefixIndex++) {
			if (expected.charAt(prefixIndex) != actual.charAt(prefixIndex))
				break;
		}
	}

	private String computeCommonPrefix() {
		return (prefixIndex > fContextLength ? ELLIPSIS : "") + expected.substring(Math.max(0, prefixIndex - fContextLength), prefixIndex);
	}
	
	private String computeCommonSuffix() {
		int end = Math.min(expected.length() - suffixIndex + 1 + fContextLength, expected.length());
		return expected.substring(expected.length() - suffixIndex + 1, end) + (expected.length() - suffixIndex + 1 < expected.length() - fContextLength ? ELLIPSIS : "");
	}
	
	private boolean areStringsEqual() {
		if (expected == null && actual == null)
			return true;
		return expected.equals(actual);
	}

	String format(String message, Object expected, Object actual) {
		if (message == null)
			return String.format("expected:<%s> but was:<%s>", expected, actual);
		return String.format("%s expected:<%s> but was:<%s>", message, expected, actual);
	}
}
