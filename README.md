# Employee-CTC-Analysis
The objective of this project is to develop a MapReduce job and get details of employee, male and female seperately with highest CTC in each department.

### Data Format: 
It's tab seperated</br>
`empid  name   age  gender  dept   CTC`

### Prerequisite:
- Use Ubuntu or any flavour of Linux with following installed
  - Hadoop 2.x or above
  - JDK
  
  
### Idea:
The idea here to write **custom partitioner class** to partition the data based on gender before sending it to the reducer.
![](/img/partition.PNG)



### Output:
- We can see the partitioned records here.  
![](/img/parititionedRecords.PNG)


- Male records
![](/img/maleOutput.PNG)


- Female records 
![](/img/femaleOutput.PNG)



