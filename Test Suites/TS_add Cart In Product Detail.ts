<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS_add Cart In Product Detail</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>c91535db-867e-4e90-b6b7-37951d79d749</testSuiteGuid>
   <testCaseLink>
      <guid>48244838-26a7-4fd4-b9f2-448f938391c3</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC001_valid Login</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>dfd9c9ac-aa8c-49ee-9cf9-7a12c9900913</id>
         <iterationEntity>
            <iterationType>SPECIFIC</iterationType>
            <value>1</value>
         </iterationEntity>
         <testDataId>Data Files/loginData</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>dfd9c9ac-aa8c-49ee-9cf9-7a12c9900913</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Username</value>
         <variableId>e11208e8-5cf1-40be-81dc-a388c20a16c1</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>dfd9c9ac-aa8c-49ee-9cf9-7a12c9900913</testDataLinkId>
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
      <guid>f4cd2a12-f2b7-44e4-a486-efcaa6d5a538</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC005_checkout cart from detail product</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>0432acfd-83d1-431c-9807-d5d19806dd32</id>
         <iterationEntity>
            <iterationType>SPECIFIC</iterationType>
            <value>1</value>
         </iterationEntity>
         <testDataId>Data Files/productData</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>0432acfd-83d1-431c-9807-d5d19806dd32</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ProductName</value>
         <variableId>546e5992-c818-4be6-aecc-162cc6c0e45a</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>a6bc717b-0aad-4e75-b1f4-522099f8816b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC006_checkout function succesfully</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>0dbf468b-9309-40d8-b319-60886082a470</id>
         <iterationEntity>
            <iterationType>SPECIFIC</iterationType>
            <value>1</value>
         </iterationEntity>
         <testDataId>Data Files/userInfo</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>0dbf468b-9309-40d8-b319-60886082a470</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>firstName</value>
         <variableId>3de70def-5aba-4a0e-814e-ca2cf8f2dc40</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>0dbf468b-9309-40d8-b319-60886082a470</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>lastName</value>
         <variableId>2a34529b-6d20-426b-bc58-27bb27262db7</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>0dbf468b-9309-40d8-b319-60886082a470</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>zipCode</value>
         <variableId>9230d1b4-3efb-4b65-b9ff-893e7f173347</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
