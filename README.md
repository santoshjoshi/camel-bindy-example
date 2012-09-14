Camel Bindy Example
-----------------------------------------

The Example is about using the marshaling and unmarshaling capability of Camel Bindy Component

##### About The Example

This example demonstrates the use of apache camel to process a huge text file with Bindy component.

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
          
#####Camel Route

A Camel route is written that executes as below

1. Reads a txt huge text file(student.txt) delimeted with '|'  from inbox directory
2. Unmarshals it to a JAVA POJO
3. Process POJO
4. Create another POJO during processing
4. Marshal the pojo back to new file (studentResult.txt) in outbox directory after processing


#####Setting up the Example

1. check out the example
2. execute mvn clean install
3. execute mvn exec:exec
			
