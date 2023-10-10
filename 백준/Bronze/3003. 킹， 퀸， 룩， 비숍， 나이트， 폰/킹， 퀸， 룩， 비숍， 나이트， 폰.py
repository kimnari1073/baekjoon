lis = [1,1,2,2,2,8]
lis_in = list(map(int,input().split(" ")))
for i in range(6):
    print(lis[i]-lis_in[i],end=" ")