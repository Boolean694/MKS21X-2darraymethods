public class ArrayMethods {
	public static int rowSum(int[][] arr, int x) {
		int c = 0;
		for(int q = 0; q < arr[x].length; q++) {
			c += arr[x][q];
		}
		return c;
	}
	
	public static int columnSum(int[][] arr, int x) {
		int c = 0;
		for(int q = 0; q < arr.length; q++) {
			if(x >= arr[q].length) {
				c += 0;
			}
			else {
				c += arr[q][x];
			}
		}
		return c;
	}
	
	public static int[] allRowSums(int[][] arr) {
		int[] na = new int[arr.length];
		for(int q = 0; q < arr.length; q++) {
			na[q] = rowSum(arr, q);
		}
		return na;
	}
	
	public static int[] allColSums(int[][] arr) {
		int longest = 0;
		for(int q = 0; q < arr.length; q++) {
			if(arr[q].length > longest) {
				longest = arr[q].length;
			}
		}
		
		int[] na = new int[longest];
		for(int q = 0; q < longest; q++) {
			na[q] = columnSum(arr, q);
		}
		return na;
	}
	
	public static boolean isRowMagic(int[][] arr) {
		int[] na = new int[arr.length];
		na = allRowSums(arr);
		boolean b = true;
		for(int q = 0; q < na.length - 1; q++) {
			if(na[q] != na[q + 1]){b = false; break;}
		}
		return b;
	}
	
	public static boolean isColumnMagic(int[][] arr) {
		int longest = 0;
		for(int q = 0; q < arr.length; q++) {
			if(arr[q].length > longest) {
				longest = arr[q].length;
			}
		}
		
		int[] na = new int[longest];
		na = allColSums(arr);
		boolean b = true;
		for(int q = 0; q < na.length - 1; q++) {
			if(na[q] != na[q + 1]){b = false; break;}
		}
		return b;
	}
}