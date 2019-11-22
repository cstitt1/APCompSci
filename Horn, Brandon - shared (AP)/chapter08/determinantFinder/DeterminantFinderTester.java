package determinantFinder;

public class DeterminantFinderTester
{
	public static void testTwoByTwoDeterminant()
	{
		int[][] matrix = new int[2][2];

		int num = 10;

		for (int row = 0; row < matrix.length; row++)
			for (int col = 0; col < matrix[0].length; col++)
				matrix[row][col] = num++;

		int determinant = DeterminantFinder.findTwoByTwoDeterminant(matrix);

		printMatrix(matrix);
		System.out.println("DeterminantFinder.findTwoByTwoDeterminant(matrix):");
		System.out.println(determinant);
	}

	public static void testDeterminant()
	{
		int[] rowZero =
		{ 1, -2, 4, 0 };
		int[] rowOne =
		{ 7, 3, 0, 3 };
		int[] rowTwo =
		{ -1, 1, -4, 0 };
		int[] rowThree =
		{ 0, 3, 2, 1 };
		int[][] matrix =
		{ rowZero, rowOne, rowTwo, rowThree };

		int determinant = DeterminantFinder.findDeterminant(matrix);

		printMatrix(matrix);
		System.out.println("DeterminantFinder.findDeterminant(matrix):");
		System.out.println(determinant);
	}

	public static void printMatrix(int[][] matrix)
	{
		for (int row = 0; row < matrix.length; row++)
			System.out.println(java.util.Arrays.toString(matrix[row]));
	}
}
