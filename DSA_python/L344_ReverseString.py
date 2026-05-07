class Solution:
    def ReverseString(s: list[str]) -> list[str]:
        
        halfValue = int(len(s)/2) # Half of the value for the given list
        reverValue = -1 #Negativ value for reverse value get for list 

        for i in range(0,halfValue): # Run the loop in half of the value in give list

            RefValue = s[i] # the Fist value for list

            s[i] = s[reverValue] # Store the last value in first value

            s[reverValue] = RefValue # Stroe the last value in first value

            reverValue -= 1 

        return s

if __name__ == '__main__':

    arr = ["n","i","s","h","a", "n", "t", "h"]
    #print("Working...")
    print(Solution.ReverseString(arr))
