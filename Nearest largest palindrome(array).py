num = int(input())
lis = list(map(int,input().split()))
mid = -1
if num%2==1:
    mid = (len(lis)//2)
else:
    mid = (len(lis)//2)-1
j = 0
for i in range(len(lis)-1,mid,-1):
    if lis[i]>lis[j]:
        lis[i-1] += 1
    if(lis[i-1]==10):
        lis[i-2] += 1
        lis[i-1] = 0
        lis[i] += 1
    lis[i] = lis[j]
    j += 1
for i in lis:
    print(i,end=" ")
    
