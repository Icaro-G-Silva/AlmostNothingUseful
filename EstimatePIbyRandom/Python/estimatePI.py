from random import uniform

#The more points, the more accurate it gets
def estimatePi(n):
    quantPointCircle = 0
    quantPointTotal = 0
    for _ in range(n):
        x = uniform(0,1)
        y = uniform(0,1)
        distance = (x**2) + (y**2)
        if distance <= 1: quantPointCircle += 1
        quantPointTotal += 1
    return 4 * quantPointCircle / quantPointTotal

print(estimatePi(10000000))
