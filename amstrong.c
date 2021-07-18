
/*

main()
{
	int n,temp,rem,dc=0,sum=0;
	printf("Enter the value n :",n);
	scanf("%d",&n);
	
	for(temp=n;temp>0;temp=temp/10)
		{
		dc=dc+1;
		//printf("\n%d",dc);
	    }
	for(temp=n;temp>0;temp=temp/10)
	     {
	    	rem=temp%10;
	    	sum=sum+rem*rem*rem;    //sum=sum+rem^dc;    
	     }
	if(sum==n)
	{
		printf("%d is Amstrong",n);
	}
	else
	{
		printf("%d is notAmstrong",n);
	}
}

*/


#include<stdio.h>
#include<math.h>
main()
{
	int n,temp,rem,dc=0,sum=0,x;
	printf("Enter the value n :",n);
	scanf("%d",&n);
	temp=n;
	while(temp>0)
		{
		dc=dc+1;
		temp=temp/10;
		//printf("\n%d",dc);
	    }
	    temp=n;
	while(temp>0)
	     {
	    	rem=temp%10;
	    	x=pow(rem,dc);
	    	sum=sum+x;   //   sum=sum+rem*rem*rem;   //sum=sum+rem^dc;  
			temp=temp/10;  
	     }
	if(sum==n)
	{
		printf("%d is Amstrong",n);
	}
	else
	{
		printf("%d is notAmstrong",n);
	}
}
