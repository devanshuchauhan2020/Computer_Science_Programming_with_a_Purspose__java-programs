public class ThueMorse {
    public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int[] v = new int[n];
		v[0] = 0;
		char[][] a = new char[n][n];
		

		for (int i = 1 ; i < n ; ++i)
		{
			
			int j = i;
			int c = 0;
			while (j != 0)
			{
				if (j % 2 != 0)
				{
					++c;
				}
				j = j / 2;
				
			}
			v[i] = c;
		}

		for (int i = 0 ; i < n ; ++i) {
			for ( int j = 0 ; j < n ; ++j) {
				int c = v[i] + v[j];
				if (c % 2 == 0) {
					a[i][j] = '+';
				}
				else{
					a[i][j] = '-';
				}
			}
		}
		for (int i = 0 ; i < n ; ++i) {
			for (int j = 0 ; j < n ; ++j){
				System.out.print(a[i][j] + "  ");
			}
			System.out.print("\n");
		}
	}
}