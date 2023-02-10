$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Checking the hotel booking functionality of an Adactin application",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user Enter The Username In The Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Enter The Password In The Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user Click The Login Button And It Navigates To Search Hotel Pages",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Must_Launch_The_Url()"
});
formatter.result({
  "duration": 301179739200,
  "error_message": "org.openqa.selenium.TimeoutException: timeout: Timed out receiving message from renderer: 295.383\n  (Session info: chrome\u003d110.0.5481.77)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LENOVO\u0027, ip: \u0027192.168.0.117\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 110.0.5481.77, chrome: {chromedriverVersion: 110.0.5481.30 (aedb656755c4..., userDataDir: C:\\Users\\ELCOT\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:54148}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: dc515ad441501f65abdd9fdb2605faaf\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat com.stepdefinition.Stepdefinition.user_Must_Launch_The_Url(Stepdefinition.java:18)\r\n\tat ✽.Given user Must Launch The Url(Adactin.feature:3)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_The_Username_In_The_Username_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_The_Password_In_The_Password_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Pages()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 9,
  "name": "Search functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;search-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user Select The Location From Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user Select The Hotel From Hotel Field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user Select The Room Type From Room Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user Select The Number of Rooms From Number of Rooms Field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Select CheckIn Date  From CheckIn Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Select CheckOut Date  From CheckOut Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Select Number Of Adult From Number Of Adult Field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Select Number Of Children From Number Of Children Field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Click The Search Button And It Navigates To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Location_From_Location_Field()"
});
formatter.result({
  "duration": 302944300,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#location\"}\n  (Session info: chrome\u003d110.0.5481.77)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LENOVO\u0027, ip: \u0027192.168.0.117\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 110.0.5481.77, chrome: {chromedriverVersion: 110.0.5481.30 (aedb656755c4..., userDataDir: C:\\Users\\ELCOT\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:54148}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: dc515ad441501f65abdd9fdb2605faaf\n*** Element info: {Using\u003did, value\u003dlocation}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.stepdefinition.Stepdefinition.user_Select_The_Location_From_Location_Field(Stepdefinition.java:42)\r\n\tat ✽.When user Select The Location From Location Field(Adactin.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Hotel_From_Hotel_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Room_Type_From_Room_Type_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Number_of_Rooms_From_Number_of_Rooms_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Select_CheckIn_Date_From_CheckIn_Date_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Select_CheckOut_Date_From_CheckOut_Date_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Select_Number_Of_Adult_From_Number_Of_Adult_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Select_Number_Of_Children_From_Number_Of_Children_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Click_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 21,
  "name": "Select functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;select-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "user Click The Check Box In Check Box Field",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user Click The Continue Button And It Navigates To The Book Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Click_The_Check_Box_In_Check_Box_Field()"
});
formatter.result({
  "duration": 100846800,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#radiobutton_0\"}\n  (Session info: chrome\u003d110.0.5481.77)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LENOVO\u0027, ip: \u0027192.168.0.117\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 110.0.5481.77, chrome: {chromedriverVersion: 110.0.5481.30 (aedb656755c4..., userDataDir: C:\\Users\\ELCOT\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:54148}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: dc515ad441501f65abdd9fdb2605faaf\n*** Element info: {Using\u003did, value\u003dradiobutton_0}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.stepdefinition.Stepdefinition.user_Click_The_Check_Box_In_Check_Box_Field(Stepdefinition.java:102)\r\n\tat ✽.When user Click The Check Box In Check Box Field(Adactin.feature:22)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_The_Continue_Button_And_It_Navigates_To_The_Book_Hotel_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 26,
  "name": "Book hotel functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;book-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "user Enter First Name In First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user Enter Last Name In Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user Enter Billing Address In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user Enter CCNumber In CCNumber Field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user Select CCType From CCType Field",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Select Expiry Date From Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Select Expiry Year From Year Field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Enter Cvvno In Cvvno Field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Click Book Now Button And It Navigates To Booking Confiramtion page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Enter_First_Name_In_First_Name_Field()"
});
formatter.result({
  "duration": 79020600,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#first_name\"}\n  (Session info: chrome\u003d110.0.5481.77)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LENOVO\u0027, ip: \u0027192.168.0.117\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 110.0.5481.77, chrome: {chromedriverVersion: 110.0.5481.30 (aedb656755c4..., userDataDir: C:\\Users\\ELCOT\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:54148}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: dc515ad441501f65abdd9fdb2605faaf\n*** Element info: {Using\u003did, value\u003dfirst_name}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.stepdefinition.Stepdefinition.user_Enter_First_Name_In_First_Name_Field(Stepdefinition.java:114)\r\n\tat ✽.When user Enter First Name In First Name Field(Adactin.feature:27)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_Last_Name_In_Last_Name_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_Billing_Address_In_Billing_Address_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_CCNumber_In_CCNumber_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Select_CCType_From_CCType_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Select_Expiry_Date_From_Date_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Select_Expiry_Year_From_Year_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_Cvvno_In_Cvvno_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Click_Book_Now_Button_And_It_Navigates_To_Booking_Confiramtion_page()"
});
formatter.result({
  "status": "skipped"
});
});