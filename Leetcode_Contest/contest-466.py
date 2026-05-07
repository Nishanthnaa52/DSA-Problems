def minOperations(arr):
	count = 0

	f = 0
	s = 1

	while (s < len(arr) and f < len(arr)):

		if arr[f] != arr[s]:
				arr[f] = arr[f] & arr[s]
				arr[s] = arr[f]

				count += 1

				f += 2
				s += 1
		else:
			f += 1
			s += 1
	return arr,count 

	# for i in range(len(arr)):

	# 	for j in range(len(arr)):

	# 		if arr[i] != arr[j]:
	# 			arr[i] = arr[i] & arr[j]
	# 			arr[j] = arr[i]

	# 			count += 1

	# return count,arr

def minOperations2(s):
	h = {}
	m = 0
	k = list(s)
	print(k)
	for i in range(len(k)):

		if k[i] not in h and k[i] != 'a':
			h[k[i]] = (122 - ord(k[i])) + 1

			m = max(h.values())

		elif k[i] == 'a':
			h[k[i]] = 0

	return m

if __name__ == '__main__':

	arr = input()
	ans = minOperations2(arr)
	print(ans)
