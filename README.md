Camel Bindy Example
-----------------------------------------

The Example is about utilizing features provided by Camel Bindy Component

##### About The Example

Currently there are parts two examples 

#####     Example 1
     This is a simple example that shows the marshalling and unmarshalling capability of Camel Bindy Component

 
It reads a large text file delimited with '|' (pipe) and each new record delimited with '\n' (new line)
process it and saves it back to another text file after adding some other information, the input and output data file
formats are shown below 


######Input file format
     id|name|semester|java|c|dbms|mathematics|datastructure

     1|Student 1|1st|80|56|54|90|90
     2|Student 2|1st|50|65|75|90|60  

######Output File format
     id|name|semester|grade|total score|result    

     1|Student 1|1st|A|370|Pass
     2|Student 2|1st|A|340|Pass 
          
#####Camel Route 1

A Camel route is written that executes as below

1. Reads a txt huge text file(student.txt) delimeted with '|'  from inbox/csv directory
2. Unmarshals it to a JAVA POJO
3. Process POJO
4. Create another POJO during processing
4. Marshal the pojo back to new file (studentResult.txt) in outbox/csv/simple directory after processing

============================================================================================================
#####     Example 2
      A simple Bindy Example to test the one to many capabilities using csv data binding.
      In this example we are depicting a simple one to many Department to Employee relationship.

######Input
	 A java pojo Department with multiple employees will get generated using the method generateEmployeeDepartmentModel 
	 from "org.apache.camel.example.util.ModelGenerator.java".
	 
	 here we are using camel bean component.
     <camel:bean ref="modelgenerator" method="generateEmployeeDepartmentModel" />

######Output file format
     id|name|semester|grade|total score|result 
     1|Coumpters|1|first-name-1|last-name-1|2012-11-10|9876543210

#####Camel Route 2

The Camel route executes as below:

1. The Timer component "bindyonetomanyTimer" executes the route
2. It then calls generateEmployeeDepartmentModel method in  "org.apache.camel.example.util.ModelGenerator.java" to get a department and its employee
3. The department pojo is marshaled using csv data binding and appended to a file

============================================================================================================
#####     Example 3
      In this example we are exploring  Bindy Capabilities For:
        a. Processing Fixed Length Format
        b. Date and number formatting, padding, trimming and alignment 
     
######Input file format
     Name, Debut Date, Country , Mathes palyed, Runs scored, Average, Strike rate, Batting posion, Reteriment Date
     
     Rahul Dravid      1996-09-10INDIA       00160  9,30060.5480.54 42012-09-01

#####Camel Route 3

The Camel route executes as below:

1. Reads the fixed length file(player.txt) from inbox/fixedlength directory
2. Unmarshal it to a Java POJO
3. Logs the POJO to console

============================================================================================================
#####     Example 4
     This example is just the reverse of example 3 , it marshalls a pojo back to file using the fixed file format

######Input
	 A java pojo Player is generated using the method generatePlayerModel 
	 from "org.apache.camel.example.util.ModelGenerator.java".
	 
	 again here we are using camel bean component.
     <camel:bean ref="modelgenerator" method="generatePlayerModel" />
         
######Output file format
     Name, Debut Date, Country , Mathes palyed, Runs scored, Average, Strike rate, Batting posion, Reteriment Date
     
     Rahul Dravid      1996-09-10INDIA       00160  9,30060.5480.54 42012-09-01

#####Camel Route 4

The Camel route executes as follows:

1. The Timer component "bindymarshallingtimerTimer" executes the route
2. It then calls generatePlayerModel method in  "org.apache.camel.example.util.ModelGenerator.java" to get player's detail
3. The Player pojo is marshaled using fixed length data binding and written to a file


============================================================================================================
#####     Example 5
      A simple fix example to show bindy capabilities for processing of fix messages.
     
######Input file format
     8=FIX.4.19=9035=049=INVMGR56=BRKR34=23652=19980604-07:59:3010=225

#####Camel Route 5

The Camel route executes as below:

1. Reads the FIX protocoled file(fix-simple.txt) from inbox/fix/simple/ directory
2. Unmarshal it to a Java POJO
3. Logs the POJO to console

============================================================================================================
#####     Example 6
      A FIX example to explore FIX messages with:
        a. Header, Body and Trailer
     
######Input file format
	 the file has the same format as above(as in example 5), but the difference is the way marshalling is done
	 it uses three classes(check code).
	 
     8=FIX.4.19=9035=049=INVMGR56=BRKR34=23652=19980604-07:59:3010=225

#####Camel Route 5

The Camel route executes as below:

1. Reads the FIX protocoled file(complex.txt) from inbox/fix/complex/ directory
2. Unmarshal it to a Java POJO
3. Logs the POJO with Header ,Body and sections info to  console

============================================================================================================

#####Setting up the Example

1. check out the example
2. execute mvn camel:run

If you want to run only one example and stop or pause execution of other example then please set autoStartup="false" 
(currently true for all routes) for all routes you don't want to get executed.
