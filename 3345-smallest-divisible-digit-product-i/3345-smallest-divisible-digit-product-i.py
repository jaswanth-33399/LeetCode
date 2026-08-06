class Solution:
    def digcount(self,n):
        prod=1
        while (n>0) :
            digit=n%10
            prod*=digit
            n//=10
        return prod
    def smallestNumber(self, n: int, t: int) -> int:
            
            for i in range(n,10**18):
                if (self.digcount(i)%t ==0 ):
                    return i
            return -1