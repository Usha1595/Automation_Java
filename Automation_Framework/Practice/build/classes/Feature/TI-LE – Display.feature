@Smoke_Test
Feature: TI-LE – Display

Background: Given Open the dasinfra
            when  user set transcode 'tcode' and click on Enter

@TestCase_9 
Scenario: Validate 'TI-LE - display PR (ME53N)' page
When user set trans code '/nME53N ' and click 'Enter'
   And click on 'Other purchase requisition' tab
   And user set Purchase Requisition '2100002244' and click 'Enter'
     Then Validate 'Material group' in Material data tab

@TestCase_10 
Scenario: Validate 'TI-LE - display STO (ME23N)'page
When user set trans code '/nME23N' and click 'Enter'
    And click on 'Other purchase order' tab
    And user set Purchase order '4500002685' and click 'Enter'
    Then Validate 'Po Quantity' in Additional data tab 

@TestCase_11 
Scenario: Validate 'TI-LE - display OBD (VL03N)'page
When user set trans code '/nVL03N ' and click 'Enter'
    And  user set Out Bound Delivery '8000001319' and click 'Enter'
    Then validate 'Outbound delivery' field
