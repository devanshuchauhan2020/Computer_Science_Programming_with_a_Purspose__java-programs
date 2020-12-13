public class  RightTriangle {
    public static void main(String[] args) {
		long a = Long.parseLong(args[0]);
		long b = Long.parseLong(args[1]);
		long c = Long.parseLong(args[2]);

		boolean r = ((a>0)&&(b>0)&&(c>0));

		long y = a*a;
		
		long x = b*b;
		
		long z = c*c;
	

		boolean d = ( (x == (y+z) ) || (y == (x+z) ) || (z == (x+y) ) );
		
		boolean f = (r && d);
		System.out.println(f);
	}
}