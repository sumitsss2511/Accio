num = int(input("Enter your number"))
sum = 0

if(num<0):
    print("enter correct number")
else:
    for i in range(0,num+1):
        sum+=num
        num-=1

    print(sum)


