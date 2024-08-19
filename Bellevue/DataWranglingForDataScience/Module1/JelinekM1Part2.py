import random
from collections import Counter
import statistics
import numpy as np
from scipy.stats import pearsonr

# Create a list of 100 random salaries
# random.seed(0)
# salaries = [round(random.random()*1000000, -3) for _ in range(100)]
# print(salaries)

salary_list = [844000.0, 758000.0, 421000.0, 259000.0, 511000.0, 405000.0, 784000.0, 303000.0, 477000.0, 583000.0, 908000.0, 505000.0, 282000.0, 756000.0, 618000.0, 251000.0, 910000.0, 983000.0, 810000.0, 902000.0, 310000.0, 730000.0, 899000.0, 684000.0, 472000.0, 101000.0, 434000.0, 611000.0, 913000.0, 967000.0, 477000.0, 865000.0, 260000.0, 805000.0, 549000.0, 14000.0, 720000.0, 399000.0, 825000.0, 668000.0, 1000.0, 494000.0, 868000.0, 244000.0, 325000.0, 870000.0, 191000.0, 568000.0, 239000.0, 968000.0, 803000.0, 448000.0, 80000.0, 320000.0, 508000.0, 933000.0, 109000.0, 551000.0, 707000.0, 547000.0, 814000.0, 540000.0, 964000.0, 603000.0, 588000.0, 445000.0, 596000.0, 385000.0, 576000.0, 290000.0, 189000.0, 187000.0, 613000.0, 657000.0, 477000.0, 90000.0, 758000.0, 877000.0, 923000.0, 842000.0, 898000.0, 923000.0, 541000.0, 391000.0, 705000.0, 276000.0, 812000.0, 849000.0, 895000.0, 590000.0, 950000.0, 580000.0, 451000.0, 660000.0, 996000.0, 917000.0, 793000.0, 82000.0, 613000.0, 486000.0]

# Checks to see how many salaries are listed, adds the salaries together, then devides them to find the mode and prints it
total_salaries = len(salary_list)
total_sum = sum(salary_list)
mean = total_sum / total_salaries
print(f"Mean is: {mean:.2f}")

# Sorts the salaries least to greatest, uses previously found sum of all salaries, devides total salaries by 2 to see if remainder, prints median
sorted_salaries = sorted(salary_list)
n = total_salaries
if n% 2 == 0:
    median1 = sorted_salaries[n // 2]
    median2 = sorted_salaries[n // 2 - 1]
    median = (median1 + median2) / 2
else: 
    median = sorted_salaries[n // 2]
print(f"Median is: {median:.2f}")

# Counts number of salaries, finds the mode
data  = Counter(salary_list)
max_count = max(data.values())
modes = [k for k, v in data.items() if v == max_count]

if len(modes) == total_salaries:
    print("No mode found")
else:
    print(f"The mode is: {', '.join(map(str, modes))}")

# Finds the sample variance and prints it
squared_diff_sum = sum((x - mean) ** 2 for x in salary_list)
sample_variance = squared_diff_sum / (total_salaries - 1)
print(f"Sample Variance is: {sample_variance:.2f}")

# Uses previous sample variance to find sample standard deviation
sample_std_dev = sample_variance ** 0.5
print(f"Sample Standard Deviation is: {sample_std_dev:.2f}")

# Calculate the range
salary_range = max(salary_list) - min(salary_list)

# Calculate the coefficient
cv = (sample_std_dev / mean) * 100

# Calculate interquartile range
q1 = statistics.quantiles(salary_list, n=4)[0]
q3 = statistics.quantiles(salary_list, n=4)[2]
iqr = q3 - q1

# Calculate quartile coefficient of dispersion
qcd = (iqr / median) * 100

print(f"Range: {salary_range}")
print(f"Coefficient of Variation: {cv:.2f}%")
print(f"Interquartile Range: {iqr}")
print(f"Quartile Coefficient of Dispersion: {qcd:.2f}%")

# Min-max scaling
min_salary = min(salary_list)
max_salary = max(salary_list)
normalized_salaries = [(x - min_salary) / (max_salary - min_salary) for x in salary_list]

# Standardizing
standardized_salaries = [(x -  mean) / sample_std_dev for x in salary_list]

print("Normalized salaries: ", normalized_salaries)
print("Standardized salaries: ", standardized_salaries)

# Covariance between standard and normalized 
covariance_matrix = np.cov(standardized_salaries, normalized_salaries)

# Pearson correlation coefficient
pearson_correlation_coefficient, _ = pearsonr(standardized_salaries, normalized_salaries)

print("Covariance matrix:\n", covariance_matrix)
print("Pearson correlation coefficient:", pearson_correlation_coefficient)