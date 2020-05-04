package com.example.Day3;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length()) {
			return false;
		}
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : magazine.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		for (char ch : ransomNote.toCharArray()) {
			int count = map.getOrDefault(ch, 0);
			if (count <= 0) {
				return false;
			}
			map.put(ch, count - 1);
		}
		return true;
	}

	public static void main(String args[]) {
		RansomNote note = new RansomNote();
		String ransomNote = "a";
		String magazine = "b";
		System.out.print(note.canConstruct(ransomNote, magazine));
	}
}
