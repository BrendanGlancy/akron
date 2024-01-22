# (TENTATIVE) SYLLABUS

## Class Schedule and Topics

| CLASS DATE | LECTURE TOPIC | TEXT REFERENCE | ASSIGNMENTS |
|------------|---------------|----------------|-------------|
| 1 MW Week 1 (01/15 – 01/19) | Review Syllabus; Introduction to the Course, Review of Statistics; Introduction to Data Mining | | (Mon., Jan. 15 = MLK Day; NO CLASSES) |
| 2 MW Week 2 (01/22 – 01/26) | Introduction to Software (R and RStudio) | | |
| 3 MW Week 3 (01/29 – 02/02) | Introduction to Data Mining | Chap 01 | |
| 4 MW Week 4 (02/05 – 02/09) | Data | Chap 02 | |
| 5 MW Week 5 (02/12 – 02/16) | Exam # 1 (on Monday) Exploring Data, Classification | Portions of Chaps 3 - 7 | |
| 6 MW Week 6 (02/19 – 02/23) | Classification | Chap 9, 10 | (Tues., Feb. 20 = President’s Day; NO CLASSES) |
| 7 MW Week 7 (02/26 – 03/01) | Classification | Chap 12 | |
| 8 MW Week 8 (03/04 – 03/08) | Classification | Chap 14 | |
| 9 MW Week 9 (03/11 – 03/15) | Classification | Chap 15 | |
| 10 MW Week 10 (03/18 – 03/22) | Exam # 2 (on Wednesday) Association Analysis | Chap 16 | |
| 11 MW Week 11 (03/25 – 03/29) | SPRING RECESS; NO CLASSES | | |
| 12 MW Week 12 (04/01 – 04/05) | Association Analysis | Chap 17 | |
| 13 MW Week 13 (04/08 – 04/12) | Association Analysis | Chap 18 | |
| 14 MW Week 14 (04/15 – 04/19) | Cluster Analysis | Chap 19 | |
| 15 MW Week 15 (04/22 – 04/26) | Text Mining | Chap 20 | |
| 16 MW Week 16 (04/29 – 05/03) | Classifying Stream Data | Chap 21 | |
| 17 Week 17 (05/06 – 05/10) | Exam # 3: (to be confirmed later) | | Wed., May. 08, 2024 @ 12:15 – 02:15 pm |

# Topics

- Statistics
- Data
- Levels of measurement
- Sampling
- Data organization
- Central tendency and Variation
- Correlation and Regression
- Elementary probability theory

## Sampling

- **A simple random sample** of n measurements from a population is a subset of the population selected in such a manner that every sample of size n from the population has an equal chance of being selected
    - Every sample of size n from the population has an equal chance of being selected
    - No researcher bias occurs in the items selected for the sample
    - A random sample may not always reflect the diversity of the population
- **Stratified Sampling** - Entire population is divided into distinct subgroups (called strata). All members of a stratum share a specific characteristic, you then draw a random sample from each stratum
- **Sampling frame** - List of individuals from which a sample is actually selected the sampling frame, Ideally, the sampling frame is the entire population
- **Undercoverage** - The sample frame does not match the population, we have what is called Undercoverage
- **Sampling Error** - the extent to which to sample information does not match the corresponding population information

- Frequency Tables: partitiions data into classes or intervals of equal width and show how many data values are in each class. The classes or intervals are constructed so that each data value falls into exactly one class.

**EXAMPLE BELOW**

### Frequency Table

The table below represents the frequency of categories in a sample dataset:

| Category | Frequency | Percentage |
|----------|-----------|------------|
| Category A | 15        | 30%        |
| Category B | 10        | 20%        |
| Category C | 20        | 40%        |
| Category D | 5         | 10%        |
| **Total**  | **50**    | **100%**   |

## Observations

- **Category C** has the highest frequency with 20 occurrences, which is 40% of the total.
- **Category D** has the lowest frequency with 5 occurrences, accounting for 10% of the total.
- The total number of observations is 50.

# Histogram: effective visual display of data in a frequency table

- Distribution Shapes

![histogram-example-2](https://github.com/BrendanGlancy/akron/assets/61941978/c5455022-a898-4eeb-9536-c3a3190cee72)


Stem-and-Leaf Plot:

Stem | Leaf
-----|-------
  5  | 1 3 7
  6  | 0 2 6 8
  7  | 1 4 4 9
  8  | 2 5 7 9

### Time Series

![time series](https://github.com/BrendanGlancy/akron/assets/61941978/ad919761-9449-4d04-8270-c6d31b14d3d1)

### Measure of Variation

- Range: difference between the largest and the smallest values of a data distribution
- Variance and Standard Deviation: Measure distribution or spread around an expected value
    - The larger the SD the larger the spread, if we have a small standard deviation then there is a sharp peak
- Coefficient of Variation: standard deviation as a percent of the sample or population mean

### Percentiles

- For whole numbers P (where 1 <= P <= 99), the pth percentage of a distribution is a value such that P% of the data fall below it and (100 - P)% of the data fall at or above it 

### Box and Whisker Plot

![box-plot](https://github.com/BrendanGlancy/akron/assets/61941978/3d5ac468-eddb-4c24-b977-47852f6a0c25)

Sometimes we run into data that seems incorrect, we call these **outliers**

### Correlation and Regression

- Scattergram: A graph in which data pairs (x, y) are plotted as individual points on a grid with horizontal axis x and vertical axis y. x is called the explanatory variable (independent variable) and y the response variable (or dependent variable)

![scatterplot_example_4col](https://github.com/BrendanGlancy/akron/assets/61941978/f7b92c36-d83d-4355-a703-40de3810ccfb)

- Outlier: a data point that has an unusual combination of data values
- Quantitatively:
    - Beyond 3 std devations
    - Fill in later 

**Sample Correlation Coefficient** r = a numerical measurement that assess the strength of a linear relationship between x and y

### Linear Regression 

- Lineaer regression provides a line of least square fit to the pairs (x, y)

- Probability Assignments
    - Intuition
    - relative frequency
    - equally likely outcomes

### Law of Large Numbers

- In the long run, as the sample size increases and increases the relative frequencies of outcomes get closer and closer to the theorictical probability value

### Compound Events

- Two events are independent if the occurrence or nonoccurence of one event does not chagne the probability that the other event will occur
- If the probability/outcome of an event changes the probability of another event, the probability of the second event is dependent of the first event
- For independent events A and B
    - P(A and B) = P(A).P(B)
- General rule for any events, use conditional probabilities

- Conditional probability
    - P(A|B) = P(A and B) / P(B)
- Two events are mutually exclusive or disjoint it the cannot occure together. In particular A and B are mutually exclusive if P(A and B) = 0

## Random Variables and Probability Distribution
- A Quantitative variable x is a random variable if the value that x takes on in a given experiment or observation is a chance or random outcome
**Discrete random variable**
**Continuous random variable**
**Probability random variable**

The areas are important because each area is equal to the probability that the measurement of an item selected at random fall in this interval

- How to determine whether data has a normal distribution 
    - Histogram: Should be roughly a bell shape
    - Outliers: for a normal distribution there should be no more than one outlier
    - Skewness: normal distributions are symmetric.  

