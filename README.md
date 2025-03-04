# algo-utils
A Java utility package for searching and sorting as well as performing optimization, string manipulation, and mathematical operations, implemented with optimized algorithm patterns.

# About
This project was born of a desire to strengthen my knowledge of algorithms and data structures, my practical ability to implement them at ease, and my abiity to recognize opportunity for their implementation in real world scenarios. Because I am a person who learns by doing, I decided to build a project in which I implement all of the algorithms I desired to master in this way. I decided to make the project public-facing so that early-career developers and bootcamp grads alike could benefit from a highly organized, curated collection of fundamental algorithm patterns. 

This project is developing and I will be enthusiastically contributing over the next several weeks and months.

# What's in the Box
At the time of writing, I have included classes with methods that implement fundamental algorithm patterns in the following categories:
```
  > sorting
    > comparison-based
      > in-place
        - SelectionSort
        - BubbleSort
  > searching
    > divide-and-conquer
      - BinarySearch
    > linear
      - LinearSearch
```  
I intend to increase the number of sorting and searching alogirithms, and expand the codebase to include patterns in the following additional categories: 
```
  > optimization algorithms
      > Greedy
      > Dynamic
      > Backtracking
  > graph algorithms
      > traversal
      > shortest path
  > string algorithms
      > searching
      > pattern matching
  > math algorithms
      > arithmetic
      > algebra
      > number theory
```


# How to Use 

Add the package to your pom or gradle file. This package is listed on [sonatype central repository](https://central.sonatype.com/artifact/io.github.charlottekies/algoutils/overview) repository, as well as github packages.


For local development, if you include the package from github, you will need to update your maven settings.xml file to include a valid PAT.
1. Generate a github Personal Access Token (PAT) with Appropriate Permissions: 
* read:packages: Allows you to download packages from GitHub Packages.
* write:packages: Allows you to upload packages to GitHub Packages (if you want to deploy).
* delete:packages: (Optional) Allows you to delete packages from GitHub Packages.

2. Add the PAT to your local maven settings.xml
You can store your GitHub token in your settings.xml file, located at ~/.m2/settings.xml on your local machine or in your CI/CD environment.
```
<settings>
    <servers>
        <server>
              <id>github</id>
              <username>${env.GITHUB_ACTOR}</username>  <!-- GitHub username -->
              <password>${env.GITHUB_TOKEN}</password>    <!-- GitHub token -->
            </server>
    <servers>
</settings>
```
2. Include the package in your pom or gradle file

- pom.xml:
```
<!-- include from github workspace -->
  <dependencies>
    <dependency>
      <groupId>io.github.charlottekies</groupId>
      <artifactId>algoutils</artifactId>
      <version>1.0.4</version>  <!-- Make sure the version matches -->
    </dependency>
  </dependencies>

  <repositories>
    <repository>
      <id>github</id>
      <url>https://maven.pkg.github.com/charlottekies/algo-utils</url>
    </repository>
  </repositories>

<!-- alternatively, include from central.sonatype -->
  <dependencies>
    <dependency>
        <groupId>io.github.charlottekies</groupId>
        <artifactId>algoutils</artifactId>
        <version>1.0.5</version>
    </dependency>
  </dependencies>
```
- gradle: 
```
implementation group: 'io.github.charlottekies', name: 'algoutils', version: '1.0.5'
```

3. Use in your code: 
```
import com.charlottekies.algoutils.sorting.comparison.inplace.BubbleSorter;

public class SortService {
    private BubbleSorter sorter;

    public SortService(BubbleSorter sorter) {
      this.sorter = sorter;
    }

    public int[] sortInput(int[] input) {
      sorter.sort(input);
      retrun input;
  ` } 
```
