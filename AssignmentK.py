import math  # For pow and sqrt
import sys
from random import shuffle, uniform
import matplotlib.pyplot as plt


# Pre-Processing_
def ReadData(fileName):
    # Read the file, splitting by lines
    f = open(fileName, 'r')
    lines = f.read().splitlines()
    f.close()

    items = []

    for i in range(1, len(lines)):
        line = lines[i].split(',')
        itemFeatures = []

        for j in range(len(line) - 1):
            v = float(line[j])  # Convert feature value to float
            itemFeatures.append(v)  # Add feature value to dict

        items.append(itemFeatures)

    shuffle(items)

    return items


# Auxiliary Function
def FindColMinMax(items):
    n = len(items[0])
    minima = [sys.maxsize for i in range(n)]
    maxima = [-sys.maxsize - 1 for i in range(n)]

    for item in items:
        for f in range(len(item)):
            if item[f] < minima[f]:
                minima[f] = item[f]

            if item[f] > maxima[f]:
                maxima[f] = item[f]

    return minima, maxima


def EuclideanDistance(x, y):
    S = 0  # The sum of the squared differences of the elements
    for i in range(len(x)):
        S += math.pow(x[i] - y[i], 2)

    return math.sqrt(S)  # The square root of the sum


def InitializeMeans(items, k, cMin, cMax):
    # Initialize means to random numbers between
    # the min and max of each column/feature

    f = len(items[0])  # number of features
    means = [[0 for i in range(f)] for j in range(k)]

    for mean in means:
        for i in range(len(mean)):
            # Set value to a random float
            # (adding +-1 to avoid a wide placement of a mean)
            mean[i] = uniform(cMin[i] + 1, cMax[i] - 1)

    return means


def UpdateMean(n, mean, item):
    for i in range(len(mean)):
        m = mean[i]
        m = (m * (n - 1) + item[i]) / float(n)
        mean[i] = round(m, 3)

    return mean


def FindClusters(means, items):
    clusters = [[] for i in range(len(means))]  # Init clusters

    for item in items:
        # Classify item into a cluster
        index = Classify(means, item)

        # Add item to cluster
        clusters[index].append(item)

    return clusters


#_Core Functions
def Classify(means, item):
    # Classify item to the mean with minimum distance

    minimum = sys.maxsize
    index = -1

    for i in range(len(means)):
        # Find distance from item to mean
        dis = EuclideanDistance(item, means[i])

        if dis < minimum:
            minimum = dis
            index = i

    return index


def CalculateMeans(k, items, maxIterations=100000):
    # Find the minima and maxima for columns
    cMin, cMax = FindColMinMax(items)

    # Initialize means at random points
    means = InitializeMeans(items, k, cMin, cMax)

    # Initialize clusters, the array to hold
    # the number of items in a class
    clusterSizes = [0 for i in range(len(means))]

    # An array to hold the cluster an item is in
    belongsTo = [0 for i in range(len(items))]

    # Calculate means
    for e in range(maxIterations):
        # If no change of cluster occurs, halt
        noChange = True
        for i in range(len(items)):
            item = items[i]
            # Classify item into a cluster and update the
            # corresponding means.

            index = Classify(means, item)

            clusterSizes[index] += 1
            means[index] = UpdateMean(clusterSizes[index], means[index], item)

            # Item changed cluster
            if index != belongsTo[i]:
                noChange = False

            belongsTo[i] = index

        # Nothing changed, return
        if noChange:
            break

    return means


# Main
def main():
    items = ReadData('C:\\Users\\DELL PC\\PycharmProjects\\K-Means\\fileKMeans.txt')

    k = 3

    means = CalculateMeans(k, items)
    clusters = FindClusters(means, items)
    print(means)
    print(clusters)

    # newItem = [5.4,3.7,1.5,0.2]
    # print( Classify(means,newItem))
    from sklearn.datasets.samples_generator import make_blobs
    from sklearn.cluster import KMeans

    X, y_true = make_blobs(n_samples=len(items), centers=3, cluster_std=0.60, random_state=0)

    kmeans = KMeans(n_clusters=3)
    kmeans.fit(X)
    y_kmeans = kmeans.predict(X)

    plt.scatter(X[:, 0], X[:, 1], c=y_kmeans, s=20, cmap='summer')
    centers = kmeans.cluster_centers_
    plt.scatter(centers[:, 0], centers[:, 1], c='red', s=100, alpha=0.9)
    plt.show()


if __name__ == "__main__":
    main()