# Name Generator

As a dungeon master, one of the biggest problems I face is coming up with names on the spot, so I decided to make a simple application that does the hard work for me!

### Features:
* Reads file data to create arraylists
* Randomly selects a name using Random()
* An interactive GUI created by Java Swing
### Project Structure:
* Tester.java - allows GUI and GenerateNames to communicate to each other
* GenerateNames.java - based on a given gender, will call NameLists.java to get a certain ArrayList of names to randomly pick from
* NameLists.java - reads from text files and turns the data into arrayLists
* GUI.java - The user interface, features a button and a drop down menu
* FemaleNames.txt and MaleNames.txt - text files containing female names and male names for NameLists.java to read from
### What I learned:
* How to turn input from a file into array lists
* Formatting with JPannels
* How to work with ActionListeners and ItemListeners in Java Swing
* How to have a GUI interact with another Class
### Additional Features to add:
  Eventually, I plan to update the name generator be able to create names for specific races such as elves, dwarves, or halflings.
