package com.example.Day8;

public class PointsStraightLine {
	public boolean checkStraightLine(int[][] coordinates) {
		if (coordinates.length == 2)
			return true;
		int first[] = coordinates[0];
		int second[] = coordinates[1];
		int A = (first[1] - second[1]), B = (second[0] - first[0]);
		int C = -A * first[0] - B * first[1];
		int size = coordinates.length;
		for (int i = 1; i < size; i++) {
			int x = coordinates[i][0];
			int y = coordinates[i][1];
			if (C + A * x + B * y != 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String args[]) {
		int coordinates[][] = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 6, 7 } };

		System.out.print(new PointsStraightLine().checkStraightLine(coordinates));
	}
}
