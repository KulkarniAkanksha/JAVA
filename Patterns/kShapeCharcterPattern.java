public class kShapeCharcterPattern {

	public static void main(String[] args) {
		int i, j, ch;
		
		int rows = 6;
		for (i = rows - 1; i >= 0; i-- ) 
		{
			ch = 65;
			for (j = 0 ; j <= i; j++ ) 	
			{
				System.out.print((char)(ch + j) + " ");
			}
			System.out.println();
		}
		
		for (i = 1 ; i < rows; i++ ) 
		{
			ch = 65;
			for (j = 0 ; j <= i; j++ ) 	
			{
				System.out.print((char)(ch + j) + " ");
			}
			System.out.println();
		}
	}
}