from itertools import permutations

def is_valid_date(mm, dd):
    mm = int(mm)
    dd = int(dd)
    # month check
    if mm < 1 or mm > 12:
        return False
    # days in each month for 2018 (not leap year)
    days_in_month = {
        1: 31, 2: 28, 3: 31, 4: 30, 5: 31, 6: 30,
        7: 31, 8: 31, 9: 30, 10: 31, 11: 30, 12: 31
    }
    if dd < 1 or dd > days_in_month[mm]:
        return False
    return True

def is_valid_time(hh, mm):
    hh = int(hh)
    mm = int(mm)
    return 0 <= hh <= 23 and 0 <= mm <= 59

def largest_datetime(digits):
    digits = [str(d) for d in digits]
    best = None

    # Try all permutations of 8 digits out of 12
    for perm in permutations(digits, 8):
        month = perm[0] + perm[1]
        day = perm[2] + perm[3]
        hour = perm[4] + perm[5]
        minute = perm[6] + perm[7]

        if is_valid_date(month, day) and is_valid_time(hour, minute):
            # format to compare lexicographically (YYYY/MM/DD HH:MM)
            dt_str = f"2018/{month}/{day} {hour}:{minute}"
            if best is None or dt_str > best:
                best = dt_str

    if best is None:
        return "0"
    else:
        # return only MM/DD HH:MM part
        return best[5:]

# Example 1
digits = [0,0,1,2,2,2,3,5,9,9,9,9]
print(largest_datetime(digits))  # Output: 12/30 22:59

# Example 2
digits = [3,3,3,3,3,3,3,3,3,3,3,3]
print(largest_datetime(digits))  # Output: 0

# if __name__ == '__main__':
# 	arr = list(map(int, input().split(',')))
# 	print(f"\nThe given input : {arr}")
# 	ans = largest_datetime(arr)
# 	print(f"\nThe answer is : {ans}")