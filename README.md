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
4. Marshal the pojo back to new file (studentResult.txt) in outbox directory after processing

============================================================================================================
#####     Example 2
      In this example we are processing a Fixed Length Format file and exploring  Bindy Capabilities For:
        a. Processing Fixed Length Format
        b. Date and number formatting, padding, trimming and alignment 
     
######Input file format
     Name, Debut Date, Country , Mathes palyed, Runs scored, Average, Strike rate, Batting posion, Reteriment Date
     
     Rahul Dravid      1996-09-10INDIA       00160   593060.54180.54 42012-09-01

#####Camel Route 2

The Camel route executes as below

1. Reads the fixed length file(player.txt) from inbox/fixedlength directory
2. Unmarshal it to a Java POJO
3. Logs the POJO to console


#####Setting up the Example

1. check out the example
2. execute mvn camel:run
			
