Camel Bindy Example
-----------------------------------------

The Example is about using the marshaling and unmarshaling capability of Camel Bindy Component

##### About The Example

This example demonstrates the use of apache camel to process a huge text file with Bindy component.

It reads a large text file delimited with '|' (pipe) and each new record delimited with '\n' (new line)
process it and saves it back to another text file after adding some other information, the input and out put data
is shown below 


######Input file
     id|name|semester|java|c|dbms|datastructure|mathematics

     1|Student 1|1st|80|56|54|90|90
     1|Student 2|1st|50|65|75|90|60  

######Output File
     id|name|semester|grade|total score|result    

     1|Student 1|1st|A|370|Pass
     1|Student 2|1st|A|340|Pass 
          
#####Camel Route

	    
A Camel route is written that executes as below

1. Reads a txt huge text file delimeted with '|'  
2. Unmarshals it to a JAVA POJO
3. Process POJO
4. Marshal the pojo back to another file after processing


#####Setting up the Example

1. check out the example

2. execute mvn clean install
 
3. execute mvn exec:exec
			
