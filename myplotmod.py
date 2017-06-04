#import io
import numpy as np
import matplotlib.pyplot as plt

## 
# reads an txt file and turn the into a readable format matrix
def dlread(fname, dl=';', transpose = False):
  with open(fname,'r') as fp:
    arr = {}
    i = 0
    tab = {ord('\r') : '', ord('\n') : ''}
    if dl.strip() != ';' :
      tab.update({ord(' ')  : ''})
    if dl.strip() != '\t':
      tab.update({ord('\t')  : ''})
    for line in fp:
      line = line.translate(tab)
      line = line.split(dl)
      x = list(map(int, line))
      arr[i] = x
      i+=1
  (keys,values) = zip(*arr.items())
  arr = np.asarray(values)
  if (transpose == True):
    arr = np.transpose(arr)
  return arr

##
# plots an 2D array in a loglogplot with legend 
# the first col of the data array is x
# and all other are y
def myloglog_tn(data, base, title, algo_names):
  x = data[0]
  y = data[1:]
  fig = plt.figure()
  fig.suptitle(title, fontsize=14, fontweight='bold')
  for i in range(0,len(y)):
    plt.loglog(x,y[i],
               label=algo_names[i],
               basex=base, basey=base)
  plt.legend(loc='upper left')
  plt.grid(True,which="both")
  plt.grid(True,ls="-")
  plt.xlabel("N")
  plt.ylabel("T(N)")
  plt.savefig(title + '.png', dpi=72)
  plt.show()

