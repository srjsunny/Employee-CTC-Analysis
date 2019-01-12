package EmployeeCtc;

import java.io.*;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;



public class myPartitioner extends Partitioner<Text,Text> {
	
	@Override
	public int getPartition(Text key,Text value,int numReducetask)
	{   
	    //key         value
		//dept       [ emp-id 	Name 	 Age 	 Gender	  Dept	CTC]
		
		int partition = 0;
		String []token = value.toString().split("\t");
		String gender = token[3];
		
		if(numReducetask!=0)
		{
			if(gender.equals("female"))
				partition = 0;
			else 
				partition = 1;
		}
		
		return partition;
		
		
	}
	

}
