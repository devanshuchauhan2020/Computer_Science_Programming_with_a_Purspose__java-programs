public class GreatCircle {
    public static void main(String[] args) {
		double x1 = Math.toRadians(Double.parseDouble(args[0]));
		double y1 = Math.toRadians(Double.parseDouble(args[1]));
		double x2 = Math.toRadians(Double.parseDouble(args[2]));
		double y2 = Math.toRadians(Double.parseDouble(args[3]));

		double c = Math.pow(Math.sin((x2-x1)/2),2);
		
		
		double s1 = Math.cos(x1);
		double s2 = Math.cos(x2);
		double s3 = Math.pow(Math.sin((y2-y1)/2),2);
		
		double s = s1*s2*s3;

		double f1 = c+s;
		double f2 = Math.sqrt(f1);
		double f = Math.asin(f2);
		

		double d = 2*6371.0*f;
		System.out.println(d+" kilometers");
	}
}