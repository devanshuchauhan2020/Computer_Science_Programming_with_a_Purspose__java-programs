public class Birthday
{
    public static void main(String[] args) 
	{
		int n ,t;
		n = Integer.parseInt(args[0]);
		t = Integer.parseInt(args[1]);
		int[] count = new int[n+1];
		int[] p = new int[n+1];
		
		for (int i = 1 ; i <= t; ++i)
		{
			int flag = 0;
			for (int j = 0; j <= n; ++j)
			{

				int b = (int) (Math.random() * n) + 1;
				p[j] = b;
				for (int x = 0; x < j; ++x)
				{
					if (p[j] == p[x])
					{
						count[j] += 1;
						flag = 1;
						break;
					}
				}
				if (flag == 1)
				{
					break;
				}
			} 
			
		} 

		double fraction = 0.0, c = 0;
		int x = 0;
		do{
			c = c + count[x];
			fraction = c/t;
			System.out.print(x + 1 + "    " + count[x] + "    " + fraction + "\n");
			x++;
		}while((fraction < 0.5) && (x <= n));
	}
}