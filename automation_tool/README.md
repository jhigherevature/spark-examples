# Spark Gradebook Automation Tool
Gradebook Automation tool (soon to be outphased) to allow for easier gradebook management for student lab completion.

## Prerequisites
* [Download 7 zip](https://www.7-zip.org/download.html)

## Instructions
* Download and place the 'spark_lab_tool.jar' file in a folder on your computer.
* Open git bash or some command line in the folder.
* run the following command: ```java -jar spark_lab_tool.jar```
* Upon first execution, the jar file will detect if the following folders and files exist, and generate them if they do not:
  * assignment_list - folder
  * batch_files - folder
  * gradebook_sheet - folder
  * lab_weeks - folder
  * zip_files - folder
  * file-write.bat - batch file
  * lab-week-extractor.bat - batch file
  * clear-lab-weeks.bat - batch file
  * clear-zip-files.bat - batch file
* Download assignments from Revature Pro and Place the Zip files within the generated 'zip_files' folder to extract work and generate workbook

## Application Options
1. Generate Workbook From Zip Files : This option will perform options 3-5 below
1. Extract Student Lab Assignments : This option is not implemented, but will extract the content student's work within the folders placed inside of the lab_weeks folder.
1. Extract Contents from Zip Files : This option will extract zip files from Revature Pro, placed within 'zip_files' folder, and move the "Week" folders (weeks 1 - 4) to the 'lab_weeks' folder.
1. Write Student Lab Completion : This option will read the names of students who have completed assignments (within the content of 'lab_weeks' folder) and write the names of students to text files placed within the 'assignment_list' folder
1. Write to lab completion Workbook : This option will read the names of students from the text files in the 'assignment_list' folder and write their names to columns within an excel workbook which is placed in the 'gradebook_sheet' folder
1. Clear Contents of zip_files folder : This option will remove delete any remaining files and folders within the 'zip_files' folder.
1. Clear Contents of lab_weeks folder : This option will remove all files and folders within the "lab_weeks" folder. This is recommended when you are starting a new batch.
