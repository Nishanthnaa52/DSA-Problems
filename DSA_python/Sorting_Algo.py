def selection_sort(arr, n):
	# Time complexity is O(n(n+1)/2) == O(n^2).
	# n-1 is the we don't need to check a last element.
	for i in range(n-1):
		
		small = i
		
		for j in range(i,n):
			
			# Check the small value in array.
			if (arr[j] < arr[small]):
				small = j
		
		# swap the values.
		arr[small], arr[i] = arr[i], arr[small]	
		
	return arr

def bubble_sort(arr, n):
	# Time complexity is O(n(n+1)/2) == O(n^2).

	for i in range(n,0,-1):
		
		for j in range(0,i-1):

			if (arr[j] > arr[j+1]):
				arr[j], arr[j+1] = arr[j+1], arr[j]

	return arr

def Insertion_sort(arr, n):
	# Time comlexity : O(n^2) in worst case || O(n) in bast case like [1,2,3,4,5] is already sorted.
	for i in range(n-1):
		j = i
		while(j >= 0 and (arr[j+1] < arr[j])) :
			tmp = arr[j+1]
			arr[j+1] = arr[j]
			arr[j] = tmp
			j -= 1
	return arr

def merge_sort(arr, low, high):

	if (low >= high): return
	mid = (low + high) // 2

	merge_sort(arr,low,mid) # for left array.
	merge_sort(arr,mid+1,high)	# for right array.

	merge(arr,low,mid,high)

	#return arr

# merge function for mergring a tow sorted array to single array.
def merge(arr,low,mid,high):
	left = low
	right = mid+1
	tmp = []
	while(left <= mid and right <= high):
		
		if (arr[left] <= arr[right]):
			tmp.append(arr[left])
			left += 1
		else:
			tmp.append(arr[right])
			right += 1

	while (left <= mid):
		tmp.append(arr[left])
		left += 1

	while (right <= high):
		tmp.append(arr[right])
		right += 1

	print(tmp)
	for i in range(len(tmp)):
		arr[low + i] = tmp[i]

def recursion_bubble_sort(arr,low=0):
	"""
		This function take a O(n^2) time comlexity.

		Args:
			arr : List to be sorted
			low : point to the unsorted array element start
	"""
	if (low >= len(arr)-1): return

	for i in range((len(arr)-low-1)):

		if (arr[i] >= arr[i+1]):
			arr[i], arr[i+1] = arr[i+1], arr[i]
	
	recursion_bubble_sort(arr,low+1)

def recursion_insertion_sort(arr,n=0):
	"""
		Args:
			arr : List to be sorted.
			n : Initcal point of the list value check start.
	"""
	if (n >= len(arr)-1): return

	j = n
	while(j >= 0 and (arr[j+1] < arr[j])):
		arr[j], arr[j+1] = arr[j+1], arr[j]
		j -= 1

	recursion_insertion_sort(arr, n+1)

def quick_sort(arr,low,high):

	if (low < high):

		ph = place(arr, low, high)
		quick_sort(arr, low, ph-1)
		quick_sort(arr, ph+1, high)

def place(arr, low, high):

	pivot = arr[low]
	i = low
	j = high

	while (i < j):

		while(arr[i] <= pivot and i <= high-1):
			i += 1

		while(arr[j] > pivot and j >= low+1):
			j -= 1

		if (i < j):
			arr[i], arr[j] = arr[j], arr[i]

	arr[low], arr[j] = arr[j], arr[low]

	return j

if __name__ == '__main__':
	num = list(map(int, input().split(',')))
	n = len(num)
	print(f"Unsorted array : {num}")
	quick_sort(num, 0, len(num)-1)
	print(f"Sorted array : {num}")