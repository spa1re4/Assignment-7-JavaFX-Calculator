# Assignment-7-JavaFX-Calculator
This project is a simple calculator built using JavaFX for the graphical user interface (GUI) and Java to handle arithmetic operations.

Main Features:
Graphical User Interface (GUI):

The calculator interface includes a text field to display the current input and result.
Buttons for number input (0-9), arithmetic operations (+, -, *, /), a decimal point (.), and buttons to calculate the result (=) and clear the input (AC).
Controller:

The HelloController class manages interactions between the user and the interface.
When number buttons are pressed, the corresponding number is added to the text field.
When an arithmetic operation (e.g., +) is selected, the first number is saved, and the user is prompted to enter a second number.
Pressing the = button performs the calculation and displays the result.
If an invalid operation is performed, such as division by zero, the calculator displays "ERROR."
The "AC" button resets the input for a new calculation.
