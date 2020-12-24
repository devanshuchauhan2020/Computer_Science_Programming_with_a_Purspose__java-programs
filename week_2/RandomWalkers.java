public class RandomWalkers {
	public static void main(String[] args) {
		int r = Integer.parseInt(args[0]);
		int t = Integer.parseInt(args[1]);
		
		int sum=0;

		for(int te=1;te<=t;++te){
			int i = 0 , j = 0 , c ;
         int  s=0;
        
		while(true){
			
        int ax = Math.abs(i);
        int ay = Math.abs(j);
			if(r==ax+ay){
        	break;
           }

        ++s;
		c = (int)(Math.random() * 4);
		if(c == 0)	{++i;}
        if(c == 1)  {--i;}
        if(c == 2) {++j;}
        if(c == 3){--j;}
       
          
		}
		sum=sum + s;

	 }
	 double step = (double)sum/t;
		System.out.println("average number of steps = "+step);
	}
}
