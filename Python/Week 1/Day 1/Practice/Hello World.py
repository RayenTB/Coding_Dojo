# 1. TASK: print "Hello World"
print("Hello World")
# 2. print "Hello Noelle!" with the name in a variable
name = "Noelle" 
print("Hello, " "Noelle")  # with a comma
print("Hello " + name)  # with a +
# 3. print "Hello 42!" with the number in a variable
name = 42
print("Hello", name)  # with a comma
# The following line will give an error because you can't concatenate a string and an integer using the + operator.
# print("Hello " + age)
# 4. print "I love to eat sushi and pizza." with the foods in variables
fave_food1 = "sushi"
fave_food2 = "pizza"
print("I love to eat {0} and {1}.".format(fave_food1, fave_food2))  # with .format()
print(f"I love to eat {fave_food1} and {fave_food2}.")  # with an f string
