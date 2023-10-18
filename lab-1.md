# Lab Report 1 "Remote Access and FileSystem"

**For each of the commands cd, ls, and cat, I will share an example of the command being used with...**
1. no arguments
2. a path to a directory as an argument
3. a path to a file as an argument

---

**Here is what my file structure looks like at the start of the lab**

![FileStructure](lab1-file-structure.png)

## Command: "cd"
1. **Usage w/ no args**
   ```
   [user@sahara ~]$ pwd
   /home
   [user@sahara ~]$ cd
   [user@sahara ~]$
   ```
   My working directory is the home folder, which in this case is the root directory for this lab. After executing cd with no arguments, my current working directory remained the same because I was in the root directory. If I was in lecture1, a sub-directory of /home, I would have been directed back to /home. A cd with no arguments will change you back to the working directory's parent directory if one exists. This is not an error.
   
2. **Usage w/ a path to a directory as an arg**
   ```
   [user@sahara ~]$ pwd
   /home
   [user@sahara ~]$ cd lecture1
   [user@sahara ~/lecture1]$
   ```
   The working directory here is the home directory. In this example, I attempted to change directories from the home directory to the lecture1 directory. Because lecture1 was a subdirectory of home, the command was a success, not an error. The last prompt shows that I am now in the lecture1 directory.
   
3. **Usage w/ a path to a file as an arg**
   ```
   [user@sahara ~/lecture1]$ pwd
   /home/lecture1
   [user@sahara ~/lecture1]$ cd Hello.java
   bash: cd: Hello.java: Not a directory
   ```
   The current working directory in this example is /home/lecture1. In this example, I attempted to change directories to the Hello.java file. Hello.java is a file that exists in lecture1, however, becuase the change directory command only works with paths to folders this attempt failed and provided an error informing me that Hello.java is not a directory. 
   
## Command: "ls"
1. **Usage w/ no args**
   ```
   [user@sahara ~]$ pwd
   /home
   [user@sahara ~]$ ls
   lecture1
   ```
   The current working directory is the home directory. ls is a command that "lists" out the folders and files in the specified path. In this case, however, I did not specify any path for ls to list out for me. When no argument is passed to an ls command, ls lists the contents of the current working directory. Since my current working directory was the home folder, I was returned the contents of the home folder. This was not an error.
   
2. **Usage w/ a path to a directory as an arg**
   ```
   [user@sahara ~]$ pwd
   /home
   [user@sahara ~]$ ls lecture1
   Hello.class  Hello.java  messages  README
   ```
   For this example, I am still currently in the home directory. In contrast to the previous example, a path to a directory was provided to the ls command, lecture1. In my current working directory is a folder that is named lecture1. Since this is a valid directory within my working directory ls succesfully returned ouput listing the contents in the lecture1 directory. This is not an error.
   
3. **Usage w/ a path to a file as an arg**
   ```
   [user@sahara ~]$ pwd
   /home
   [user@sahara ~]$ ls lecture1/Hello.java
   lecture1/Hello.java
   ```
   I am in the same working directory as the last two examples, home. In this case I gave the path to the Hello.java file in the lecture directory. Hello.java is a file so it cannot contain any other files for ls to output. Since I was not in the directory that Hello.java is store in, ls returned its relative path. This is not an error.
   
## Command: "cat"
1. **Usage w/ no args**
   ```
   [user@sahara ~]$ pwd
   /home
   [user@sahara ~]$ cat
   test
   test
   test1
   test1
   ^C
   [user@sahara ~]$
   ```
   My current working directory is the home directory. This case resulted in interestig behavior. cat is a command that outputs the complete contents of specified files. In this example I did not provide any file for cat to print out. After calling this command no new prompt was available for me but instead, I was able to continue typing in the terminal. In the line after where I call cat, I typed "test" and hit enter. Afterwards, the terminal responded back with an identical string. I was able to continue this behavior until I terminated the command with hitting ctrl+c. Despite the interesting behavior I do not believe this is an error.
   
2. **Usage w/ a path to a directory as an arg**
   ```
   [user@sahara ~]$ pwd
   /home
   [user@sahara ~]$ cat lecture1
   cat: lecture1: Is a directory
   ```
   In this example, the current working directory is home. Since cat is meant to output the contents of a file or more than one file, this example caused the terminal to return an error. I provided the directory lecture1 which exists within my current working directory but since it is not a file the command was unable to print out any text within a file.
   
3. **Usage w/ a path to a file as an arg**
   ```
   [user@sahara ~]$ pwd
   /home
   [user@sahara ~]$ cat lecture1/messages/en-us.txt
   Hello World!
   ```
   Once again, the current working directory is the home folder. Here, I provided the cat command with the path to the en-us.txt file which resulted in the terminal outputting the file's contents. The text inside the file was "Hello World!" so this is exactly was was returned to the terminal. No errors were returned.
