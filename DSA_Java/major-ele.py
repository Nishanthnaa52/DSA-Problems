num = [2,2]
ans = []
l = len(num) // 3

d = {}

for i in range(len(num)):

	if num[i] in d:
		d[num[i]] += 1
	else:
		d[num[i]] = 0

for j in d:
	if d[j] >= l:
		ans.append(j)

print(l,d, ans)