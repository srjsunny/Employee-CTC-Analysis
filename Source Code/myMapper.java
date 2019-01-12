package EmployeeCtc;

import java.io.*;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;




public class myMapper extends Mapper <Object,Text,Text,Text> {
	
	@Override
	public void map(Object key,  Text value, Context context)throws IOException,InterruptedException
	{
	//emp-id 	Name 	 Age 	 Gender	  Dept	CTC
	//101 		Suraj    23      male      IT    45

	String tokens[] = value.toString().split("\t");
	String dept = tokens[4];

	context.write(new Text(dept), value);
	}
	

}
