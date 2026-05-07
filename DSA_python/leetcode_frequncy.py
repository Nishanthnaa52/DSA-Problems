k = int(input())
num = list(map(int, input().split(',')))

num.sort(reverse=True)
print(num)
check = len(num)
l, r = 0, 1;
ans = 1
while (0 < check-1):

	if (num[l] <= (num[r] + k)):
		ans += 1
		r += 1
	else:
		l += 1
		r += 1

	check -= 1

print(ans)