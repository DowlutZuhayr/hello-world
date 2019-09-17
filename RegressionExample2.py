
# x: age                  |   10   20   30   40   50   60    70    80   90   100

# y: population have mob  |   40   80   90   82   65   50    35    30   15    5

# 1. draw scatter
# 2. calculate gradient and y intercept
# 3. plot the new program line

import numpy as np
import matplotlib.pyplot as plot


def cal_coefficient(a, b):

    size = np.size(a)

    meanA = np.mean(a)
    meanB = np.mean(b)

    crossDeviationOfAandB = np.sum(b*a) - size*meanB * meanA
    sumOfSquaredDeviationsofA = np.sum(a*a) - size*meanA - meanB

    b1 = crossDeviationOfAandB/sumOfSquaredDeviationsofA
    b0 = meanB - b1 * meanA

    return b0, b1


def function_to_plot_reg(a, b, z):

    # plot points
    plot.scatter(a, b, color="r", marker="*", s=30)

    # predicted response vector
    b_predictor = z[0] + z[1] * a

    # plotting the regression line
    plot.plot(a, b_predictor, color="y")

    # naming the labels
    plot.xlabel("a")
    plot.ylabel("b")

    # displaying
    plot.show()


def main():
    a = np.array([25, 17, 12, 8, 3, 15, 37, 20, 4])
    b = np.array([8, 14, 26, 35, 45, 18, 4, 15, 40])

    # estimate coefficient

    z = cal_coefficient(a, b)
    print("estimated coefficients:\nb0={} \nb1 = {}".format(z[0], z[1]))

    # plot reg line
    function_to_plot_reg(a, b, z)


if __name__ == "__main__":
    main()










