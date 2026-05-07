numRow = 5

ans = []


for i in range(numRow):
	sub = [1]

	if i > 0:

		prev = ans[i - 1]

		for j in range(1, i):
			sub.append(prev[j - 1] + prev[j])

		sub.append(1)

	ans.append(sub)


print(ans)