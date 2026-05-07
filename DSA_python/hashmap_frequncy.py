num = int(input())
arr = list(map(int, input().split(',')))

d = {}

for a in arr:

	if a in d:
		d[a] += 1
	else:
		d[a] = 1
 	
print(f"The number of {num} is {d[num]}")