<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS_checkout Empty Cart</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>0dae9da1-1df7-44c9-b3c2-7506f4763762</testSuiteGuid>
   <testCaseLink>
      <guid>bd863b7a-0ff5-46cb-9917-325cee93c099</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC001_valid Login</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>549b597a-3baf-4f92-b6cd-92f6cee793a8</id>
         <iterationEntity>
            <iterationType>SPECIFIC</iterationType>
            <value>1</value>
         </iterationEntity>
         <testDataId>Data Files/loginData</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>549b597a-3baf-4f92-b6cd-92f6cee793a8</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Username</value>
         <variableId>e11208e8-5cf1-40be-81dc-a388c20a16c1</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>549b597a-3baf-4f92-b6cd-92f6cee793a8</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>54bc495a-2bb2-4a89-9be5-be548f44e6cc</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>c08f4549-bdf3-4a33-9481-58da361efe46</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>e6a8ebd3-ad79-442e-b45c-57f878e00479</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC008_checkout with empty chart</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>d1c151f0-0db3-42ef-ba65-dec0f1b1e8d9</id>
         <iterationEntity>
            <iterationType>SPECIFIC</iterationType>
            <value>1</value>
         </iterationEntity>
         <testDataId>Data Files/userInfo</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>d1c151f0-0db3-42ef-ba65-dec0f1b1e8d9</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>firstName</value>
         <variableId>a7fed0d0-f131-467e-89ba-1623a9f59f35</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>d1c151f0-0db3-42ef-ba65-dec0f1b1e8d9</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>lastName</value>
         <variableId>f81f06a0-6eee-47ca-8225-82ce1885faa4</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>d1c151f0-0db3-42ef-ba65-dec0f1b1e8d9</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>zipCode</value>
         <variableId>9881c4db-029a-4119-b3fe-4daa67be0a4b</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>0158972f-1947-473e-8e65-f850a205b16f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC010_Log out function</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>