# Lab Report 1 "Remote Access and FileSystem"

**For each of the commands cd, ls, and cat, I will share an example of the command being used with...**
1. no arguments
2. a path to a directory as an argument
3. a path to a file as an argument

---

**Here is what my file structure looks like at the start of the lab**

![FileStructure](lab1-file-structure.png)

---

## Command: "cd"
1. **Usage w/ no args**
   ```
   [user@sahara ~]$ pwd
   /home
   [user@sahara ~]$ cd
   [user@sahara ~]$
   ```
   It seems that I did not receive any significant output since I did not provide any directory to change to from my current working directory. My current working directory remained the same because I did not instruct the terminal to change to another directory.
   
2. **Usage w/ a path to a directory as an arg**
   ```
   [user@sahara ~]$ pwd
   /home
   [user@sahara ~]$ cd lecture1
   [user@sahara ~/lecture1]$
   ```
   In this example, my directory changed from the home folder into the lecture1 folder since the argument lecture1 was found in the current working directory. The last prompt shows that I am now in the lecture1 directory.
   
3. **Usage w/ a path to a file as an arg**
   ```
   [user@sahara ~/lecture1]$ pwd
   /home/lecture1
   [user@sahara ~/lecture1]$ cd Hello.java
   bash: cd: Hello.java: Not a directory
   ```
   I received an error in this example because I instructed the terminal to change its current working directory into a file. A directory and a file are not the same. A directory can hold either other directories and files while a file only contains content relevant to that file and marks the end of its path.
   
## Command: "ls"
1. **Usage w/ no args**
   ```
   [user@sahara ~]$ pwd
   /home
   [user@sahara ~]$ ls
   lecture1
   ```
3. **Usage w/ a path to a directory as an arg**
   ```
   [user@sahara ~]$ pwd
   /home
   [user@sahara ~]$ ls lecture1
   Hello.class  Hello.java  messages  README
   ```
5. **Usage w/ a path to a file as an arg**
   ```
   [user@sahara ~]$ pwd
   /home
   [user@sahara ~]$ ls lecture1/Hello.java
   lecture1/Hello.java
   ```
   
## Command: "cat"
1. **Usage w/ no args**
   ```
   [user@sahara ~]$ pwd
   /home
   [user@sahara ~]$ cat

   ```
3. **Usage w/ a path to a directory as an arg**
   ```
   [user@sahara ~]$ pwd
   /home
   [user@sahara ~]$ cat lecture1
   cat: lecture1: Is a directory
   ```
5. **Usage w/ a path to a file as an arg**
   ```
   [user@sahara ~]$ pwd
   /home
   [user@sahara ~]$ cat lecture1/messages/en-us.txt
   Hello World!
   ```
