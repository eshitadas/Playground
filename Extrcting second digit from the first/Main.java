#include <stdio.h>
#include<math.h>
int main() {int n,v,r,count=0,s,p;
            scanf("%d",&n);
           v=n;
         while(n>0)
         {
           n=n/10;
           count=count+1;
         }
            s=count-2;
            r=v/(pow(10,s));
            p=r%10;
            printf("%d",p);
	//Type your code
	return 0;
}