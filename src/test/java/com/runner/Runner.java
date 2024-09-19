package com.runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlPackage;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlSuite.ParallelMode;
import org.testng.xml.XmlTest;

public class Runner {

	public static String ComponentType, testType, name;

	public static void main(String[] args) {

		ComponentType = args[0];//api, ui, mobile
		testType = args[1];//sanity,smoke
		name = ComponentType + "-" + testType;

		System.out.println(ComponentType);
		System.out.println(testType);

		TestNG testNG = new TestNG();
		XmlSuite suite = new XmlSuite();
		suite.setName("Phoenix Test Suite");// <suite name="Suite1" verbose="1">

		XmlTest myTest = new XmlTest(suite);
		myTest.setName(name + "MyTest");// <test name="api sanity_MyTest">

		// <pacakage name="com.api.tests"
		XmlPackage package1 = new XmlPackage("com." + ComponentType + ".tests");

		List<XmlPackage> PackageList = new ArrayList<XmlPackage>();//create XML package List
		PackageList.add(package1);// Add XML package to the list
		myTest.setPackages(PackageList);//And package list is added here

		//Above 3 lines will create this//

		/*

		<packages>
			<package name="com.api.tests"></package>
		</packages>
		 */

		myTest.addIncludedGroup(testType);// sanity, smoke etc
		myTest.setParallel(ParallelMode.METHODS);//parallel mode

		List<XmlTest> xmlList=new  ArrayList<XmlTest>();
		xmlList.add(myTest);
		suite.setTests(xmlList);
		
		
		List<XmlSuite> xmlListSuite=new  ArrayList<XmlSuite>();
		xmlListSuite.add(suite);
		testNG.setXmlSuites(xmlListSuite);
		 
		testNG.run();//Starts execution//
		
		
		




	}

}
