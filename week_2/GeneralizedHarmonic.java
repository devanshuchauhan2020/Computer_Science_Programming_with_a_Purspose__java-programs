public class  GeneralizedHarmonic {
    public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
        double r = Double.parseDouble(args[1]);
        double s = 0;
        for(int i=1 ; i<=n ; ++i){
        	double rp = Math.pow(i,r);
        	s = s + ( 1 / rp );
        }
        System.out.println(""+s);
	}
}