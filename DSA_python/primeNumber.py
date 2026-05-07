
def prime(n):
    check = 0
    for i in range(1,n+1):
        if (n % i == 0):
            check += 1
    if (check == 2):
        print("Prime")
    else:
        print("Not, prime")

if __name__ == '__main__':
    print("Prime number...")
    num = int(input("Enter a number : "))
    print(num)
    prime(num)
