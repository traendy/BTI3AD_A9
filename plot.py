from myplotmod import dlread, myloglog_tn

arr = dlread("sample.txt", ";", True)
names = ['matrix','list']
myloglog_tn(arr, 10, "Dykstra(Adjazenzgraph)", names)

