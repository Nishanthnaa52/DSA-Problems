arr = [13,45,22,77,2,32,1,12]
n = len(arr)

for i in range(n-1):

	m = i

	for j in range(i,n):
		
		if (arr[j] < arr[m]):
			m = j

	arr[i], arr[m] = arr[m], arr[i]

print(arr)