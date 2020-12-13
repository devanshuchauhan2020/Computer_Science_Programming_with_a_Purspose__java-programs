public class CMYKtoRGB {
    public static void main(String[] args) {
		double c = Double.parseDouble(args[0]);
		double m = Double.parseDouble(args[1]);
		double y = Double.parseDouble(args[2]);
		double k = Double.parseDouble(args[3]);

		double w = 1-k, c1 = 1-c, m1 = 1-m, y1 = 1-y;
		
		int r = (int) Math.round(255.0 * w * c1);
		int g = (int) Math.round(255.0 * w * m1);
		int b = (int) Math.round(255.0 * w * y1);
		System.out.println("red   = "+r);
		System.out.println("green = "+g);
		System.out.println("blue  = "+b);
	}
}