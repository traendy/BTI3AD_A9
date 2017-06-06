from myplotmod import dlread, myloglog_tn

arr = dlread("getweight.txt", ";", True)
names = ['matrix','list']
myloglog_tn(arr, 10, "getWeigtcount", names)

arr = dlread("getweight.txt", ";", True)
names = ['matrix','list']
myloglog_tn(arr, 10, "getNeighborCount", names)

arr = dlread("getweight.txt", ";", True)
names = ['matrix','list']
myloglog_tn(arr, 10, "total ", names)

