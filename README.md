# Niyas_Parambath.MonefyTests

	
Automation Script

Github: https://github.com/niyasnpkdy/Niyas_Parambath.MonefyTests
B
ase class: MonefyApp.java //Base class has the initialisation setup for the application. Also the base class constructor initiate the properties object to read the Config.properties file

Test NG Classes: 
@BeforeTest //Initial Setup and driver initialisation
@BeforeMethod //Launch the application
@Test // Perform the test case execution
@AfterTest //Teardown methods.

AddAccountTest.java //Test case to add account
DashBoardAddIncomeTest.java //Test case to add income form dashboard
DashBoardExpenseTest.java  //Test Case to add expense from expense main button
ExpenseCategoriesTest.java //Test case to add expense categories from dashboard.

Properties file
Config.properties //This has all the input values, Some of the common Xpaths and ID attributes.


Util Class
MonefyTestUtil.java //This has the commonly used methods