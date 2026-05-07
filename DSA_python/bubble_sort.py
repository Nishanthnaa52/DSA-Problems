arr = [23,54,11,22,3,5,1]
l = len(arr)

for i in range(l,0,-1):
	check = 0
	for j in range(i-1):
 
		if arr[j] > arr[j+1]:

			tmp = arr[j+1]
			arr[j+1] = arr[j]
			arr[j] = tmp

			check = 1

	if (check == 0): break

print(arr)