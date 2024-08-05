package com.seleniumautomation.xpath;

public class HandlingXpathAndCreatingXpath {

	public static void main(String[] args) {
		// Seleinum tool or UFT tool for automation //
		// What is Xpath in selenium!?
		/*	1. 	Xpath in selenium is an XML path used for navigation through the
		 * 		HTML structure of the page.
		 * 	2.	It is a syntax or language for finding any element on a web page using
		 * 		XML path expression.
		 * 	3.	Xpath can be used for both HTML and XML documents to find the location
		 * 		of any element on a webpage using HTML DOM structure.
		 */
		// There are two type
		/*	Absolute Xpath
		 * 	1.	The Xpath expression is created using the "selection from the root
		 * 		node".
		 * 	2.	It "starts with a single slash '/' " traverses from the root to whole 
		 * 		DOM to reach to the desired element.
		 * 	Eg: /html/body/div[1]/section/div/div[2]/div/form/div[2]/input[3]
		 * 
		 * 	Note: 	The biggest disadvantage of using this as locating an element is,
		 * 			if during the course of development any changes made in the path,
		 * 			may lead to a failed XPath expression.
		 */
		/*	Relative Xpath
		 * 	1.	The Xpath expression is generated from the middle of the DOM structure.
		 * 	2.	It is represented by a double slash '//' denoting the current node.
		 * 	3.	It is more compact, easy to use and less prone to been broken.
		 * 	Eg: //input[@id='vfb-5']
		 */
		// Xpath Methods
		/*	Part - I
		 * 	1.	Basic Xpath
		 * 	2.	Using 'OR' & 'AND'
		 * 	3.	Contains()
		 * 	4.	Starts-With()
		 * 	5.	Text()
		 * 	6.	Text() + Contains()
		 */
		/*	Part - II (Tough one and Advanced on from Part I)
		 * 	XPath axes
		 * 	1.	Following
		 * 	2. 	Following-sibiling
		 * 	3.	Parent
		 * 	4.	Child
		 * 	5.	Preceding
		 * 	6.	Ancestor
		 * 	7.	Descendant
		 */
		// 1) Basic X Path:
		/*	This common approach pf writing the XPath in Selenium which is the
		 * 	combinationof a tagname and attribute value
		 * 
		 * 	URL: https://nxtgenaiacademy.com/demo-site/
		 * 	Syntax: //tagname[@attribute='value']
		 * 
		 * 	First Name (TextBox)
		 * 	//input[@id='vfb-5'] or //*[@id='vfb-5']
		 *	RadioButton
		 * 	//*[@value='Female'] or //input[@value='Female']
		 * 	DropDown (HH)
		 * 	//select[@id='vfb-13-country'] or //*[@id='vfb-13-country']
		 * 	CheckBox
		 * 	//input[@value='Core Java']
		 * 	Button
		 * 	//input[@id='vfb-4']
		 * 	Image
		 * 	//img[@alt='NxtGen A.I Academy']
		 * 	Link
		 *	//a[@href='https://nxtgenaiacademy.com/python/']
		 */
		// 2) Using 'OR' & 'AND'
		// URL: https://nxtgenaiacademy.com/demo-site/
		/*	Button
		 * 	//input[@id='vfb-4' or @type='submit']
		 * 	//input[@id='vfb-4' and @type='submit']
		 */
		// 3) Starts-With() method
		/*	-	It is used when the value of any attribute changes dynamically at the
		 * 		webelement.
		 * 	Here the Transaction is static value, but the end values changes dynammically.
		 * 	Eg: Transaction_12X7SI3M
		 * 
		 * 	URL: https://nxtgenaiacademy.com/multiplewindows/
		 * 
		 * 	Syntax:	//tagName[starts-with(@attribute,'value')]
		 * 	
		 * 	New Browser Window
		 * 	//button[starts-with(@name,'newbrowserwindow')]
		 */
		// 4) Contains() method
		/*	The contain feature has an ability to find the element with partial text.
		 * 	ie both in the starting or ending the values changes.
		 * 
		 * 	Here the starting and ending values are dynamica but the "Transaction" is static
		 * 	Eg: 7232NH_Transaction_12X7SI3M
		 * 
		 * 	URL: https://nxtgenaiacademy.com/multiplewindows/
		 * 
		 * 	Syntax: //*[contains(@attribute,'partial value')]
		 * 
		 * 	New Browser Window
		 * 	//*[contains(@name,'browsertab')]
		 * 	New Message Window
		 * 	//*[contains(@name,'message')]
		 */
		// 5) Text()
		/*	With text function, we find the element wiht exact text match
		 * 
		 * 	URL: https://nxtgenaiacademy.com/demo-site/
		 * 
		 * 	Syntax: //tagname[text()='value']
		 * 
		 * 	Register for Demo
		 * 	//*[text()='Register For Demo']
		 */
		// 6) Text() + Contains() method
		/*	It is used when we have a text defined in as HTML tag and to identify element
		 * 	via text.
		 * 	
		 * 	It is also used for dynamically changing attribute value.
		 * 	
		 * 	It is widely used for text validation or verifications.
		 * 	
		 * 	URL: https://nxtgenaiacademy.com/demo-site/
		 * 
		 * 	Syntax: //*[contains(text(),'value')]
		 * 
		 * 	Successful Validation:
		 * 	//*[contains(text(),'Registration Form is Successfully Submitted')]
		 */
		// 7) XPath axes methods
		// These XPath axes methods are used to find the complex or dynamic elements.
		
		// i) Following
		/*	Selects all elements in the documents of the current node() and choose
		 * 	the one as per your requirement
		 * 
		 * 	Note: 	When we are unable to find using unique value. We will follow
		 * 			this method. Its similar to index number trick using in UFT
		 * 	
		 * 	URL: https://nxtgenaiacademy.com/demo-site/
		 * 
		 * 	Syntax:	//*[@attribute='value']//following::tagName[number]
		 * 
		 * 	Based on the specific value like title or text we can identify the 
		 * 	following webelements.
		 * 	
		 * 	Register For Demo
		 * 	//*[contains(text(),'Register For Demo')]//following::input[15]
		 * 	//*[contains(text(),'Register For Demo')]//following::select[2]
		 */
		// ii) Following-sibling
		/*	Siblings are at the same level of the current node
		 * 
		 * 	In case of following siblings, all following nodes of the context node,
		 * 	that shares the same parent, are applicable
		 * 
		 * 	Syntax:	//*[@attribute='value']//following-sibling::tagName[number]
		 * 
		 * 	URL: https://www.goibibo.com/
		 * 
		 * 	Selecting each menu bar link
		 * 	//ul[@class='happy-nav']//following-sibling::li[4]
		 */
		// iii) Parent - one parent
		/*	Select the parent of the current node
		 * 
		 * 	URL: https://www.tutorialspoint.com/tensortflow/index.htm
		 * 
		 * 	Syntax: //*[attribute='value']//parent::tagName[number]
		 * 
		 * 	Highlight Entire Menu - Only one parent
		 * 	//ul[@class='toc chapters']//parent::div[1]
		 */
		// iv) Child - many child - Important
		/*	Selects all children elements of the current node
		 * 
		 * 	URL: https://www.tutorialspoint.com/tensortflow/index.htm
		 * 
		 * 	Syntax: //*[@attribute='value']//child::tagName[number]
		 * 
		 * 	Highlight the link under the Tensor flow Tutorial
		 * 	//ul[@class='toc chapters']//child::li[8]	
		 * 
		 * 	Note: Select the links based on the number mentioned.
		 * 
		 * 	URL://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html
		 * 	//ul[@titile='Packages']//child::li[4]
		 */
		// v) Preceding
		/*	This method select all nodes that come before the current node.
		 * 
		 * 	URL: https//www.tutorialspoint.com/tensorflow/index.htm
		 * 
		 * 	Syntax: //*[@attribute='value']/preceding::tagName[number]
		 * 
		 * 	Highlighting the links above the TensorFlow useful resources
		 * 	//*[contains(text(),'TensorFlow Useful Resources')]//preceding::li[8]
		 * 	
		 * 	Note: Here the number increases from bottom to top.
		 */
		// vi) Ancestor
		/*	The ancestor axis selects all ancestors element (grandparent, parent, etc.) of the current node.
		 * 
		 * 	URL: https//www.tutorialspoint.com/tensorflow/index.htm
		 * 
		 * 	Syntax: //*[@attribute='value']//ancestor::tagName[]
		 * 
		 * 	Here we have 3 level of anchestor for the TensorFlow useful resources text.
		 * 	//*[contais(test(),'TensorFlow Useful Resources')]//ancestor::div[3]
		 * 
		 */
		// vii) Descendant - Important
		/*	This approach is used to locate element via XPath for all the children and sub children
		 * 	of the current node.
		 * 
		 * 	URL: https//www.tutorialspoint.com/latest_technologies.htm
		 * 
		 * 	Syntax: //*[@attribute='value']//descendant::tagName[number]
		 * 
		 * 	It will select the Image link based on the number
		 * 	//*[@class='mui-col-md-12']//descendant::a[7]
		 */

	}

}
