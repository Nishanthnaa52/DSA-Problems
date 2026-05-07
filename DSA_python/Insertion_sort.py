arr = [3,6,33,51,1,143,2]
l = len(arr)
for i in range(l):

	j = i
	while(j > 0 and arr[j-1] > arr[j]):
		arr[j], arr[j-1] = arr[j-1], arr[j]
		j -= 1

print(arr)