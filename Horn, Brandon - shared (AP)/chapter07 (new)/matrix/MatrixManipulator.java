package matrix;

/**
 * Offers the specified operations on integer matrices.
 */
public class MatrixManipulator
{
	/**
	 * Determines if (first + second) is defined where + indicates matrix addition.
	 * 
	 * @return true if matrix addition is defined, false otherwise.
	 */
	public static boolean addable(int[][] first, int[][] second)
	{
		return true; // remove this
	}

	/**
	 * Performs (first + second) where + indicates matrix addition. (Precondition: addable(first, second) returns true.)
	 * 
	 * @return the result of first + second.
	 * @throws IllegalArgumentException
	 *             if the precondition is not met.
	 */
	public static int[][] add(int[][] first, int[][] second)
	{
		return null; // remove this
	}

	/**
	 * Performs (scalar * matrix) where * indicates scalar multiplication of a matrix. (Precondition: matrix.length > 0 && matrix[0].length > 0)
	 * 
	 * @return the result of scalar * matrix.
	 * @throws IllegalArgumentException
	 *             if the precondition is not met.
	 */
	public static int[][] multiplyByScalar(int scalar, int[][] matrix)
	{
		return null; // remove this
	}

	/**
	 * Multiplies the specified row of first and the specified column of second. (Precondition: first[row].length > 0 && first[row].length == second.length)
	 * 
	 * @return the result of multipliying the specified row and column.
	 * @throws IllegalArgumentException
	 *             if the precondition is not met.
	 */
	public static int multiply(int[][] first, int row, int[][] second, int col)
	{
		return 0; // remove this
	}

	/**
	 * Determines if (first * second) is defined where * indicates matrix multiplication.
	 * 
	 * @return true if matrix multiplication is defined, false otherwise.
	 */
	public static boolean multipliable(int[][] first, int[][] second)
	{
		return true; // remove this
	}

	/**
	 * Performs (first * second) where * indicates matrix multiplication. (Precondition: multipliable(first, second) returns true.)
	 * 
	 * @return the result of first * second.
	 * @throws IllegalArgumentException
	 *             if the precondition is not met.
	 */
	public static int[][] multiply(int[][] first, int[][] second)
	{
		return null; // remove this
	}

	private static boolean atLeastOneByOne(int[][] matrix)
	{
		return matrix != null && matrix.length > 0 && matrix[0].length > 0;
	}
}
