num = int(input("Enter a number : "))
num_s = str(num)
new_num = int(num_s[::-1])
if(new_num==num):
    print("palindrome number")
else:
    print("not a palindrome nmber")