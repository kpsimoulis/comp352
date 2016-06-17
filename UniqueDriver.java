
public class UniqueDriver {

	public static void main(String[] args) {
		int[] A = { 1, 3, 7 };
		int[] B = { 3, 4, 7, 8, 9 };
		
		int unique = unique(A, B);
		System.out.println("You have " + unique + " unique numbers in your two arrays" );

	}
	
	static int unique(int[] A, int[] B) {
		
		int j = Math.min(A.length-1, B.length-1);
		int count = 0;
		int idxA = 0;
		int idxB = 0;
		
		for (int i = 0; i < j; i++) {
			// Find every unique in A until we bypass the value in B
			while (A[idxA] < B[idxB]) {
				count++;
				idxA++;
			}
			// Find every unique in B until we bypass the value in A
			while (B[idxB] < A[idxA]) {
				count++;
				idxB++;
			}
			// Equal numbers, increase the index on both Arrays
			if (A[idxA] == B[idxB]) {
				idxA++;
				idxB++;
			}
		}
		// Return the unique we found so far + remaining elements in A + remaining elements in B
		return count + (A.length - idxA) + (B.length - idxB);
		
	}
	
}
