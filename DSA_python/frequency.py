nums = [1,2,4]
k = 5
fre = 1
ran = len(nums)
MaxFre = 0
while (ran > 1):
	pic = nums[ran]

	find = pic - nums[ren - 1]

	k = k - find

	if (k > 0):
		fre += 1
	MaxFre = max(MaxFre,fre)

	ran -= 1

print(MaxFre)