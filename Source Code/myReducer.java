package EmployeeCtc;

import java.io.*;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Reducer;


public class myReducer extends Reducer<Text,Text,NullWritable,Text>{
	
	@Override
	public void reduce(Text value,Iterable<Text>values,Context context)throws IOException,InterruptedException
	{
		//key            values
	//  dept                 [ emp-id 	Name 	 Age 	 Gender	  Dept	CTC   .. .....] 	
		
		long max=-1;
		
		String details="";
		
		
		for(Text val:values)
		{
			String []tokens = val.toString().split("\t");
			long ctc = Long.parseLong(tokens[5]);
			
			if(ctc > max)
			{	
				details = val.toString();
				
				max=ctc;
			}
			
		}
		
		context.write(NullWritable.get(), new Text(details));
		
		
	}
	
	
	
	

}
