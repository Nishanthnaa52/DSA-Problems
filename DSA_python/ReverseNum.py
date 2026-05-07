num = 6789

ans = 0

while (num > 0):
    val = num % 10
    ans = (ans * 10) + val
    num = int(num / 10)
print(ans)
