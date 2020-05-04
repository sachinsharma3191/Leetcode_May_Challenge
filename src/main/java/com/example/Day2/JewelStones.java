package com.example.Day2;

import java.util.HashSet;
/*
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  
 * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
The letters in J are guaranteed distinct, and all characters in J and S are letters.
 Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * 
 * */

public class JewelStones {
	public static int numJewelsInStones(String J, String S) {
		HashSet<Character> set = new HashSet<>();
		for (char s : J.toCharArray()) {
			set.add(s);
		}
		int ans = 0, size = S.length();
		for (int i = 0; i < size; i++) {
			char ch = S.charAt(i);
			if (set.contains(ch)) {
				ans++;
			}
		}
		return ans;
	}

	public static void main(String args[]) {
		String J = "z";
		String S = "ZZ";
		System.out.println(numJewelsInStones(J, S));
	}
}
