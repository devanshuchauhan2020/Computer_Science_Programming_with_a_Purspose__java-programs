public class RandomWalker {
	public static void main(String[] args) {
		int r = Integer.parseInt(args[0]);
		int i = 0 , j = 0 , c ;
		int s = 0;
		System.out.println("(0, 0)");
		while(true) {
			int ax = Math.abs(i);
            int ay = Math.abs(j);
			if(r==ax+ay){
        	break;
        }
			s++;
		c = (int)(Math.random() * 4);
		if(c == 0)	{++i;}
        if(c == 1)  {--i;}
        if(c == 2) {++j;}
        if(c == 3){--j;}
        System.out.println("("+i+", "+j+")");
        
		}
		System.out.println("steps = "+s);
	}
}