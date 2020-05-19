package com.example.Day17;

import java.util.*;

public class FindAllAnagrams {
	public List<Integer> findAnagrams(String s, String p) {
		int s1 = s.length(), s2 = p.length();
		if (s1 < s2) {
			return new ArrayList<>();
		}
		HashMap<Character, Integer> sCount = new HashMap<>();
		HashMap<Character, Integer> pCount = new HashMap<>();

		for (char ch : p.toCharArray()) {
			pCount.put(ch, pCount.getOrDefault(ch, 0) + 1);
		}
		List<Integer> output = new ArrayList<>();
		for (int i = 0; i < s1; i++) {
			char ch = s.charAt(i);
			sCount.put(ch, sCount.getOrDefault(ch, 0) + 1);
			if (i >= s2) {
				ch = s.charAt(i - s2);
				if (sCount.get(ch) == 1) {
					sCount.remove(ch);
				} else {
					sCount.put(ch, sCount.get(ch) - 1);
				}
			}
			if (sCount.equals(pCount)) {
				output.add(i - s2 + 1);
			}
		}
		return output;

	}

	public static void main(String args[]) {
		String s = "abab";
		String p = "ab";
		FindAllAnagrams anagram = new FindAllAnagrams();
		System.out.print(anagram.findAnagrams(s, p));
	}
}
