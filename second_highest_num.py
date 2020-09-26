n = int(input())
arr = list(map(int, input().split()))
m=max(arr)
print(m)
arr.remove(m)
while m in arr:
	arr.remove(m)
print(arr)
print(max(arr))