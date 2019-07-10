#include <stdio.h> 
int main() 
{int n,s,f,sum=0;
 scanf("%d",&n);
 s=n%10;
 f=n; 
 while(f>10)
 {f=f/10;
  sum=f+s; }
 printf("%d",sum); //Type your code
 return 0; }