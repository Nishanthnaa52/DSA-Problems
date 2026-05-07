
def largest_element(arr):
	
	# brutforce method.
	# time complexity - O(n log n) 
	
	# space complexity - O(1)
	# arr = sorted(arr) 
	# print(arr[len(arr)-1])

	"""------------------------------------------------------"""

	# optimal Method 
	# time complexity - O(n) 
	# space complexity - O(1) 
	
	m = arr[0]

	for i in range(len(arr)):
		if (arr[i] >= arr[m]):
			m = i
	print(f"Max valu : {arr[m]}")

def largest_second_element(arr):

	# Brutforce

	# Time complexity - O(n log n + n), the sorting take a O(n log n).

	# arr = sorted(arr)
	# lar = arr[-1]
	# print(arr)
	# for i in range(len(arr)-1,0,-1):

	# 	if arr[i] != lar:
	# 		lar = arr[i]
	# 		break

	# print(lar)

	"""------------------------------------------------------"""

	# Better

	# Time complexity - O(2n).
	# m = arr[0]
	
	# for i in range(len(arr)):

	# 	if (arr[i] >= m):
	# 		m = arr[i]

	# s = arr[0]

	# for j in range(len(arr)):

	# 	if (arr[i] >= s and arr[i] < m):
	# 		s = arr[i]

	# print(f"Scound largest : {s}")	

	"""------------------------------------------------------"""

	# Optimal
	# Time complexity - O(n)
	m = arr[0]
	s = arr[0]

	for i in range(len(arr)):

		if arr[i] > m:
			s = m
			m = arr[i]

		elif (arr[i] < m and arr[i] > s):
			s = arr[i]

	print(f"Largest : {m} \t Secound largest : {s}")

def ckeck_is_sorted(arr):

	# Time complexity - O(log n)

	# tmp = sorted(arr)

	# if arr == tmp:
	# 	print("Sorted")
	# else:
	# 	print("Not soterd")

	"""------------------------------------------------------"""

	# Time complexity - O(n)
	for i in range(len(arr)-1):

		if not(arr[i] <= arr[i+1]):
			return False

	return True
		
def remove_duplication(arr):

	# Time complexity - O(n log n)
	
	# sets = set(arr)
	# dup_arr = list(sorted(sets))

	# for i in range(len(dup_arr)):
	# 	arr[i] = dup_arr[i]

	# return [arr[i] for i in range(len(dup_arr))] # Return a original value for the given array

	"""------------------------------------------------------"""

	# optimal method
	# Time complexity - O(n)
	# space complexity - O(1)

	i = 0

	for j in range(len(arr)):
		if arr[i] != arr[j]:
			i += 1
			arr[i] = arr[j]

	return [arr[x] for x in range(i+1)] 

def left_sheift(arr, n=3):

	# Time complexity - O(n)
	# Space complexity - O(1)

	for i in range(n-1):
		tmp = arr[i+1]
		arr[i+1] = arr[i]
		arr[i] = tmp

	return arr

def rotate_D_place(arr, n=3):
	
	k = n % len(arr)

	l, r = 0, len(arr)-1

	while l < r:
		arr[l], arr[r] = arr[r], arr[l]
		l += 1
		r -= 1

	l, r = 0, k-1
	while l < r:
		arr[l], arr[r] = arr[r], arr[l]
		l += 1
		r -= 1

	l, r = k, len(arr)-1
	while l < r:
		arr[l], arr[r] = arr[r], arr[l]
		l += 1
		r -= 1

	return arr

def move_zero(arr):
	
	# Time complexity - O(2*n)
	# Space complexity - O(n)

	# zero = arr.count(0)
	# ans = []
	# for i in range(len(arr)):
	# 	if arr[i] != 0:
	# 		ans.append(arr[i])

	# for i in range(zero):
	# 	ans.append(0)

	# return ans

	"""------------------------------------------------------"""

	# Time complexity - O(n)
	# Space complexity - O(1) - Becouse we don't use a extra space

	j = 0
	# TC - O(x) - Becouse we break the array when find a zero index.
	for i in range(len(arr)):
		if arr[i] == 0:
			j = i
			break

	#TC - O(j to len(arr))
	for i in range(j+1,len(arr)):

		if arr[i] != 0:
			arr[j], arr[i] = arr[i], arr[j]
			j += 1

	return arr

def linear_search(arr, num=3):
	
	# Time complexity - O(n)
	# Space complexity - o(1)

	for i in range(len(arr)):
		if arr[i] == num:
			return i

	return -1


def Union(arr1, arr2):
	# arr1 = set(arr1)
	# arr2 = set(arr2)
	
	# ans = arr1 .intersection(arr2)

	"""------------------------------------------------------"""

	# ans = []

	# for i in range(len(arr1)):
	# 	if arr1[i] not in ans:
	# 		ans.append(arr1[i])

	# for i in range(len(arr2)):
	# 	if arr2[i] not in ans:
	# 		ans.append(arr2[i]) 

	"""------------------------------------------------------"""
	# Time complexity - O(m+n)
	# space complexity - O(m+n) {if this ans array is consider, if this not O(1)}
	ans = []
	i = 0
	j = 0

	while ( i < len(arr1) and j < len(arr2)):

		if arr1[i] < arr2[j]:
			if arr1[i] not in ans:
				ans.append(arr1[i])
			i += 1

		elif arr1[i] > arr2[j]:
			if arr2[j] not in ans:
				ans.append(arr2[j])
			j += 1

		elif arr1[i] == arr2[j]:
			if arr1[i] not in ans:
				ans.append(arr1[i])
			i += 1
			j += 1

	while (i < len(arr1)):
		if arr1[i] not in ans:
			ans.append(arr1[i])
		i += 1

	while (j < len(arr2)):
		if arr2[j] not in ans:
			ans.append(arr2[j])
		j += 1

	return ans

def MissingNum(arr):

	# Time complexity - O(n)
	# space complexity - O(1)

	# n = len(arr)+1
	# expected_sum = n * (n + 1) // 2
	# actual_sum = sum(arr)

	# return (expected_sum - actual_sum)

	"""------------------------------------------------------"""
	# Time complexity - O(n)
	# Space complexity - O(1)

	xor1 = 0
	xor2 = 0
	for i in range(len(arr)):
		xor1 = xor1 ^ i
		xor2 = xor2 ^ arr[i]

	return (xor1 ^ xor2) + 1

def MaxConsecutive(arr):
	# Time complexity - O(n)
	# space complexity - O(1)

	count = 0
	Max = 0

	for i in arr:

		if i == 1:
			count += 1
			
		else:
			if Max < count:
				Max = count
			count = 0

	if Max < count:
			Max = count

	return Max

def NumOnce(arr):

	# Hash map approch

	# Time complexity - O(n) + O(n)
	# space complexity - O(n)

	# freq = {}

	# for i in arr:

	# 	if i in freq:

	# 		freq[i] += 1

	# 	else:

	# 		freq[i] = 1

	# for num, count in freq.items():

	# 	if count == 1:
	# 		return num

	# return 1

	"""------------------------------------------------------"""

	xor = 0

	for i in arr:
		xor = xor ^ i

	return xor

def findTheDifference(self, s, t):

	i = 0
	j = 0
	ans = ''
	while(i < len(s) and j < len(t)):

		if s[i] != t[j]:

			for i in range(i,len(t)):
				ans += t[i]

			return ans

		else:
			i += 1
			j += 1

	return ans

def long_sub_arr(arr, c=12):

	# Time complexity - O(n^3)
	# Space complexity - O(1)

	# length = 0

	# for i in range(len(arr)):

	# 	for j in range(i,len(arr)):

	# 		s = 0

	# 		for k in range(i,j+1):

	# 			s = s + arr[k]

	# 		if s == c:
	# 			length = max(length,j-i+1)

	# return length

	"""------------------------------------------------------"""

	# Time complexity - O(n^2)
	# space complexity - O(1)

	# length = 0

	# for i in range(len(arr)):

	# 	s = 0
		
	# 	for j in range(i,len(arr)):

	# 		s = s + arr[j]

	# 		if s == c:
	# 			length = max(length, j-i+1)

	# return length

	"""------------------------------------------------------"""

	# length = 0
	# s = 0
	# Map = {}

	# for i in range(len(arr)):

	# 	s = s + arr[i]

	# 	if s == c:
	# 		length = max(length, i+1)

	# 	rem = s - c

	# 	if rem in Map:
	# 		l = i - Map[rem]
	# 		length = max(length,l)

	# 	if s not in Map:
	# 		Map[s] = i

	# return length

	"""------------------------------------------------------"""

	length = 0
	i,j = 0,0
	s = 0

	while(i < len(arr) and j < len(arr)):

		if s < c:
			s = s + arr[j]
			j += 1
		
		else:
			s = s - arr[i]
			i += 1

		if s == c:
			length = max(length,(j-i))
			s = s - arr[i]
			i += 1

	return length




if __name__ == '__main__':
	arr = list(map(int, input().split(',')))
	# arr1 = list(map(int, input().split(',')))
	print(f"Original array : {arr}\n")
	ans = long_sub_arr(arr)
	print(f"processed array : {arr}\n")
	print(f"Answer : {ans}")