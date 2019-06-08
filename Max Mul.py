def solve (A,N):
    # Write your code here
    A.sort()
    a=A[N-1]*A[N-2]
    b=A[0]*A[1]
    if a>b:
        return a
    else:
        return b

    
T = int(input())

for _ in range(T):
    N = int(input())
    A = list(map(int, input().split()))
    out_ = solve(A,N)
    print (out_)
