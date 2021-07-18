

/*

class Amstrong
{
	public static void main(String[]args)
	{
		int n,temp,rem,dc=0,sum=0;
		n=Integer.valueOf(args[0]).intValue();
		for(temp=n;temp>0;temp=temp/10)
		    {
		       dc=dc+1;
		       //System.out.println("\n"+dc);
	        }
	    for(temp=n;temp>0;temp=temp/10)
	     {
	    	rem=temp%10;
	    	sum=sum+rem*rem*rem;   //sum=sum+rem^dc;
	     }
	    if(sum==n)
	       {
	        	System.out.println(n+" is amstrong");
	       }
	    else
	       {
	        	System.out.println(n+" is notamstrong");
	       }
	}
}

*/
		



class Amstrong
{
	public static void main(String[]args)
	{
		int n,temp,rem,dc=0,sum=0;
		n=Integer.valueOf(args[0]).intValue();
		temp=n;
		while(temp>0)
		{
		       dc=dc+1;
			   temp=temp/10;
		       //System.out.println("\n"+dc);
		}
			temp=n;
	    while(temp>0)
	     {
	    	rem=temp%10;
			//System.out.println(+rem);
			double d =Math.pow(rem,dc);
			//System.out.println(+d);
			sum=sum+(int)d;            // sum=sum+(rem^dc); 
			temp=temp/10;
		}
	    if(sum==n)
	       {
	        	System.out.println(n+" is amstrong");
	       }
	    else
	       {
	        	System.out.println(n+" is notamstrong");
	       }
	}
}		
		
