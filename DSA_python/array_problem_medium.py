def TwoSum(arr,target):
	# Time complexity - O(n^2)
	# space complexity - O(n)
	
	# for i in range(len(arr)+1):

	# 	for j in range(len(arr)):

	# 		a = arr[i] + arr[j]
	# 		if a == target:
	# 			print(f'Index value {i,j}')
	# 			return True


	# return False

 	#-------------------------------------------------------------------------
 	#This approch is make less then o(n^2) bit it still O(n^2)

	# for i in range(len(arr)):

	# 	for j in range(i+1,len(arr)):

	# 		a = arr[i] + arr[j]
	# 		if a == target:
	# 			print(f'Index value {i,j}')
	# 			return True

	# return False

	#-------------------------------------------------------------------------

	# Here we using a hashing approch. 
	# first we find whic element is in arr and find out of one more element we want to get a targeted value.

	# time complexity - O(n * log n)
	# Space complexity - O(n)
	
	h = {}

	for i in range(len(arr)):

		a = target - arr[i]

		if a in h.keys():
			print(f"The index value is {i , h[a]}")
			return True
		
		h[arr[i]] = i
	return False

	 #-------------------------------------------------------------------------

def sortArr(arr):
	# This is my approch of this problem.
	# time complexity - O(n + n) => O(2n)
	# space complexity - O(n) becouse we using extra space for store a new value (ans - variable)
	
	# h = {}

	# ans = []

	# # O(n)
	# for i in arr:
	# 	if i in h.keys():
	# 		h[i] += 1
	# 	else:
	# 		h[i] = 1

	# k = 0

	# # O(n)
	# while k <= 2:

	# 	for i in range(h[k]):
	# 		ans.append(k) 
	# 	k += 1
	
	# return ans

	#-------------------------------------------------------------------------

	# This is the most optimal solution for a this problem.
	# By using a dutch national flag algoritham to solve this problem.
	# Accrounding to this algorim is using three pointer to solve is low, mid, high.

	# Time complexity - O(n)
	# Space complexity - O(1) - we don't using any of the extra space.

	low = 0
	mid = 0
	high = len(arr)-1

	while mid <= high:

		if arr[mid] == 0:
			arr[low], arr[mid] = arr[mid], arr[low]
			mid += 1
			low += 1
		
		elif arr[mid] == 1:
			mid += 1
		else:
			arr[high], arr[mid] = arr[mid], arr[high]
			high -= 1

	return arr

def majorityEle(arr):
	# l = int(len(arr)/2)
	
	# for i in range(len(arr)):
	# 	count = 0	
	# 	for j in range(len(arr)):
	# 		if arr[i] == arr[j]:
	# 			count += 1

	# 		if count > l:
	# 			return arr[i] 
	# return 0

	#-------------------------------------------------------------------------

	# Time complexity - O(2n)
	# spcae complexity - O(n)

	# l = int(len(arr)/2)

	# h = {}

	# for i in arr:
	# 	if i in h.keys():
	# 		h[i] += 1

	# 	else:
	# 		h[i] = 1

	# for k,v in h.items():
	# 	if v > l:
	# 		return k

	# return -1

	#-------------------------------------------------------------------------

	# This is the optimal solution for this problem.
	# Here i am using a Moore's Voting Algorithm to solve the question.

	# Time complexity - O(n) in most of the time.
	# space complexity - O(1)

	count = 0
	el = 0
	for i in range(len(arr)):

		if (count == 0):
			count = 1
			el = arr[i]

		elif (arr[i] == el):
			count += 1

		else:
			count -= 1


	count1 = 0

	for i in range(len(arr)):
		if (arr[i] == el):
			count1 += 1

	if count1 > int(len(arr)/2):
		return el

	return -1

def Max_sub_arr(arr):

	Max = 0

	for i in range(len(arr)):

		for j in range(i,len(arr)):

			s = 0
			
			for k in range(i,j+1):

				s += arr[k]

			if s > Max:
				Max = s
			

	return Max

def BuySell(arr):

	# buy = arr[0]
	# buy_D = 0
	
	

	# for i in range(len(arr)):
	# 	if buy > arr[i]:
	# 		buy_D = i
	# 		buy = arr[i]

	
	# sell = arr[buy_D]
	# sell_D = 0
	# for j in range(buy_D,len(arr)):
		
	# 	if buy < arr[j]:
	# 		if sell < arr[j]:
	# 			sell = arr[j]
	# 			sell_D = j

	# profit = sell - buy

	# if buy < profit:
	# 	return profit
	
	# return 0

	#-------------------------------------------------------------------------

	Min = arr[0]
	profit = 0

	for i in range(len(arr)):

		cost = arr[i] - Min
		profit = max(profit,cost)
		Min = min(Min,arr[i])

	return profit


def RearrangeArr(arr):

	positive = 0
	negative = 1

	ans = [0]*len(arr)

	for i in range(len(arr)):

		if arr[i] > 0:
			ans[positive] = arr[i]
			positive += 2
		else:
			ans[negative] = arr[i]
			negative += 2

	return ans

def next_premution(arr):

	inf = -1
	n = len(arr)
	
	for i in range(n-2,-1,-1):
		if arr[i] < arr[i+1]:
			inf = i
			break

	if inf == -1:
		arr = arr[::-1]

		return arr

	for i in range(n-1,inf, -1):
		if arr[i] > arr[inf]:
			arr[i], arr[inf] = arr[inf], arr[i]
			break

	arr[inf+1:] = reversed(arr[inf+1:])

	return inf, arr

if __name__ == '__main__':

	arr = list(map(int, input().split(',')))
	#target = int(input())
	ans = next_premution(arr)
	print(f'\nGiev value is {arr}')
	print(f'\nThe ans is {ans}')