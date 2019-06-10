n=int(input())
v=[1000,900,500,400,100,90,50,40,10,9,5,4,1]
r=["M", "CM", "D", "CD","C", "XC", "L", "XL","X", "IX", "V", "IV","I"]
ans=""
m=0
while(n>0):
    for i in range(n//v[m]):
        ans+=r[m]
        n-=v[m]
    m+=1
print(ans)
