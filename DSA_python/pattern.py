def pattern1(n) :
    for i in range(n):
        for j in range(n):
            print('* ', end="")
        print()

def pattern2(n):
    
    for  i in range(1,n):
        for j in range(i):
            print("* ", end="")
        print()

def pattern3(n):
    
    for i in range(1,n+1):
        for j in range(1,i+1):
            print(str(j) + " ", end="")
        print()

def pattern4(n):
    
    for i in range(1,n+1):
        for j in range(1,i+1):
            print(str(i) + " ", end="")
        print()

def pattern5(n):

    for i in range(n):
        for j in range(n-i):
            print("* ", end="")
        print()

def pattern6(n):

    for i in range(n):
        for j in range(1, (n-i)+1):
            print(str(j) + " ",  end="")
        print()

def pattern7(n):

    for i in range(n):

        for j in range((n-i)-1):
            print(" ", end="")

        for j in range((2*i)+1):
            print("*", end="")

        for j in range((n-i)-1):
            print(" ",  end="")

        print()

def pattern8(n):

    for i in range(1,n):

        for j in range(i):
            print(" ", end="")

        for j in range((n*2)-(i*2+1)):
            print("*", end="")

        for j in range(i):
            print(" ", end="")

        print()

def pattern9(n):

    for i in range(n):

        for j in range((n-i)-1):
            print(" ", end="")

        for j in range((i*2)+1):
            print("*", end="")

        for j in range((n-i)-1):
            print(" ", end="")

        print()

    for i in range(n):

        for j in range(i):
            print(" ", end="")

        for j in range((2*n) - (2*i)-1):
            print("*", end="")

        for j in range(i):
            print(" ", end="")
        print()

def pattern10(n):

    for i in range(1,(2*n)):

        star = i

        if (i > n) : star = (2*n)-i

        for j in range(star):
            print("*", end="")
        print()

def pattern11(n):
    star = 0
    for i in range(1,n+1):

        if (i%2 == 1):star = 1

        for j in range(i):
            print(str(star)+" ", end="")
            star = 1 - star
        print()

def pattern12(n):

    for i in range(1,n+1):

        for j in range(1,i+1):
            print(str(j)+" ", end="")

        for j in range(1,((n-i)*2)+1):
            print("  ", end="")

        for j in range(i,0,-1):
            print(str(j)+" ", end="")
        print()

def pattern13(n):
    num = 1
    for i in range(1,n+1):
        for j in range(i):
            print(str(num) + " ", end="")
            num += 1
        print()

def pattern14(n):

    for i in range(1,n+1):

        for j in range(i):
            print(chr(65+j) + " ", end="")
        print()

def pattern15(n):

    for i in range(n):

        for j in range(n-i):

            print(chr(65+j) + " ", end="")

        print()

def pattern16(n):

    for i in range(1,n+1):

        for j in range(i):
            print(chr(64+i) + " ", end="")
        print()

def pattern17(n):

 for i in range(n):

        for j in range((n-i)-1):
            print("  ", end="")

        ch = 0
        breakPoint = int(((2*i)+1) / 2)
        for j in range((2*i)+1):
            print(chr(65+ch) + " ", end="")
            if j < breakPoint: ch += 1
            else: ch -= 1 

        for j in range((n-i)-1):
            print("  ",  end="")

        print()

def pattern18(n):

    for i in range(1,n+1):

        for j in range(1,i+1):
            print(chr((64+n)-i+j) + " ", end="")
        print()      

def pattern19(n):
    inS = 0
    for i in range(n):

        for j in range(n-i):
            print("*", end="")
        for j in range(inS):
            print(" ", end="")
        for j in range(n-i):
            print("*", end="")
        print()
        inS+=2
    

    inS = inS - 2
    for i in range(1,n+1):

        for j in range(i):
            print("*", end="")
        for j in range(inS):
            print(" ", end="")
        for j in range(i):
            print("*", end="")
        print()
        inS-=2

def pattern20(n):
    num = (2*n)-2
    for i in range(1,n+1):
        
        for j in range(i):
            print("*", end="")

        for j in range(num):
            print(" ", end="")

        for j in range(i):
            print("*", end="")
        print()
        num -= 2

    num = 2

    for i in range(1,n):

        for j in range(n-i):
            print("*", end="")

        for j in range(num):
            print(" ", end="")

        for j in range(n-i):
            print("*", end="")
        print()
        num += 2

def pattern21(n):

    for i in range(n):

        for j in range(n):

            if (i == 0 or j == 0 or i == n-1 or j == n-1):
                print("*", end="")
            else:
                print(" ", end="")
        print()
        
def pattern22(n):

    for i in range((2*n)-1):
        
        for j in range((2*n)-1):
            top = i
            left = j
            right = (2*n-2)-j
            bottom = (2*n-2)-i
            print((n - min(min(top,bottom), min(left, right))), end="")
        print()    


if __name__ == '__main__' :
    n = int(input())
    pattern1(n)