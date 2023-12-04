javac FactorialCalculator.java

# Check if the compilation was successful
if [ $? -eq 0 ]; then
    # This script depends on passing an integer argument
    java FactorialCalculator $1
else
    echo "Compilation failed. Please check your Java code for errors."
fi
