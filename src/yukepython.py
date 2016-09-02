def hw(n):
    if n==1:
        return 1
    else :
        return n*hw(n-1)

print hw(10);
