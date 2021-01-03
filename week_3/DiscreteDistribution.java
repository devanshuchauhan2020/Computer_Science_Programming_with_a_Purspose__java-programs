public class DiscreteDistribution{
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);

		int[] n=new int[args.length-1];
		int[] s=new int[n.length];
		int sum=0;
		for(int i=0; i<args.length-1;++i){
			n[i]=Integer.parseInt(args[i+1]);
			sum=sum+n[i];
			s[i]=sum;
		} 
		for(int i=0; i<m;++i){
			int r= (int)(Math.random() * s[n.length-1]);
			for(int j=0;j<n.length;++j){
				if(r<s[j]){
					System.out.print(j+1+" ");
					break;
				}
			}
		}
		
		
	}
}