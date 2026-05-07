
def divisors(n):
    for i in range(1,n+1):
        if (n % i == 0):
            print(i);

if __name__ == '__main__':
    print("Divisors Number")
    num = 13
    divisors(num)
