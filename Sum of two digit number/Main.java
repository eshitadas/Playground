#include<stdio.h>
int main()
{int n,sum;
 scanf("%d",&n);
 sum=0;
 while(n!=0)
 {
   sum=sum+n%10;
   n=n/10;
 }
 printf("%d",sum);
  //Type your code here
  return 0;
}