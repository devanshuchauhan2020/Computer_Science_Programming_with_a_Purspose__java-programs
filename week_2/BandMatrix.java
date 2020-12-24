public class BandMatrix {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int w = Integer.parseInt(args[1]);
		for(int i=1 ;  i <= n ; ++i){
			int c = i - w;
			int c2 = i+w;
			for(int j = 1 ;j<= n ; ++j){
				if(i==j){System.out.print("*  ");}
				else{
					if((j>=c) && (j<=c2)){
						System.out.print("*  ");
					}
				    else{
				    	System.out.print("0  ");
				    }
				}
			}
			System.out.print("\n");
		}
	}
}