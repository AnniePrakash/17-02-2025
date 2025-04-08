Feature: Login Functionalities


Scenario: checking with invalid datas with edge
Given Facebook URL Launched
When User enters "<userName>" and "<password>"
Then Takescreenshot

Examples:
|userName|password|
|Hanno|123456|
|Shawn|23|
|Annie|573|
