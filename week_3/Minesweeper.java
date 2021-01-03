public class Minesweeper {
    public static void main(String[] args) {
		boolean flag = true;
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);

	/*	if(k>(m*n)){
			System.out.println("\n\nMines should be less than grid space!!!!\n\n");
			System.exit(0);
		}

	*/
		char[][] q = new char[m][n];
		int ck = 0 , cm = 0;

        if(k>0){
		while (flag) {
		int x = (int) (Math.random() * m);
		int y = (int) (Math.random() * n);
		if (q[x][y] != '*'){
			q[x][y] = '*';
			++ck;
		}
		if ( ck == k) {
			flag = false;
		}
	}
 }


    for ( int a = 0 ; a < m; ++a) {
    	for (int b = 0 ; b < n ; ++b){
    		cm = 0;
    		if (q[a][b] == '*'){
    			System.out.print('*' + "  ");
    			continue;
    		}
    		if ( (a > 0) && (b > 0) && (q[a-1][b-1] == '*') ){
    			++cm;
    		}
    		
    		if ( (a > 0) && (q[a-1][b] == '*') ){
    			++cm;
    		}
    		
    		if ( (a > 0) && (b < (n - 1)) && (q[a - 1][b + 1] == '*') ){
    			++cm;
    		}
    		
    		if( (b>0) && (q[a][b-1]=='*') ){
    			++cm;
    		}
    		
    		if( (b<(n-1)) && (q[a][b+1]=='*') ){
    			++cm;
    		}
    		
    		if( (a<(m-1)) && (b>0) && (q[a+1][b-1]=='*') ){
    			++cm;
    		}
    		
    		if( (a<(m-1)) && (q[a+1][b]=='*') ){
    			++cm;
    		}
    		
    		if( (a<(m-1)) && (b<(n-1)) && (q[a+1][b+1]=='*') ){
    			++cm;
    		}
    	
    		char cm1 =(char)(cm+'0');
    		
    		q[a][b] = cm1;
    		
          System.out.print(q[a][b]+"  ");
    	}
    	System.out.print("\n");
    }


}
}