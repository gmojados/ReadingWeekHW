# HW 3 PLURALSIGHT NOTES
---------------------------------------
_Benefits of Unit Testing_
- Test is just a code
- Executes target code
- Can be class, method, or function
-Checks to see if the results are correct
- Provide quick feedback
- This also helps as "Design Aid"
- Can be used as a form of documentation
---------------------------------------
_Setting up JUnit 5 in IDE_
- 3rd  party dependecies are provided in "JAR" files
- You can just add the test yourself  by right clicking and adding test case generate
- To confrim its a test it should show "@test"
- You may use Junit.org for documentation and JAR's
- mvnrepository.com is also another where you can download
- --------------------------------------
_Writing First JUNIT 5 Test_
-The test annotation indicated Junit that this is a a test method they need to  execute
-Annotation are metadata
- Execute the target code
- "AssertNotNull"
- "assertEqual" is Expected value first, then second argument is the actual value
- Set Up, Execute, Verify
  --------------------------------------
_Executing  test and interpreting Results_
-Check that everythign is running correct
-review your code for errors
-When you fail clicking the links in the stack will lead you to the error
--------------------------------------------
_Applying Assertions_
- Differentiate assertions
- Will verify that the two variables being compared point to literally the same object in memory.
- AssertEquals, AssertTrue, AssertFalse - will be the ones you will use  most
- Important to look at differences to verify what is wrong with the code when it fails
-------------------------------------------
_Setting Up and Tearing  Down Tests_
-Life Cycle 
-Before all will run once
- Before each will  run once before EACH
- After Each will run once AFTER EACH
- After all will run ONCE after all is completed -Usually  static
  ----------------------------
- initAll executes
- Test 1 executes
- TearDown executes

- init executes
- teste2 executes
- tearDown executes

- tearDownAll executes
- Teardown methods clean up or reset test data
