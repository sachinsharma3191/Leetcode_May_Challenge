package com.example.Day18;

import java.util.*;

public class StockSpanner {
	private Stack<Integer> prices, weights;

	public StockSpanner() {
		prices = new Stack<>();
		weights = new Stack<>();
	}

	public int next(int price) {
		int w = 1;
		while (!prices.isEmpty() && prices.peek() <= price) {
			prices.pop();
			w += weights.pop();
		}
		prices.push(price);
		weights.push(w);
		System.out.print(price + "-->" + weights);
		return w;
	}

	public static void main(String args[]) {
		StockSpanner S = new StockSpanner();
		S.next(100);
		S.next(80);
		S.next(60);
		S.next(70);
		S.next(60);
		S.next(75);
		S.next(85);
	}
}
