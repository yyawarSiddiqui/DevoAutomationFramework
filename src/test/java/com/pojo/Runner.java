package com.pojo;

import static com.utility.TestUtility.*;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Step 1: Creation of java Object//

		CreateJobPOJO createjobPOJO = getCreateJobJsonData();
		String data = convertPOJOTOJSON(createjobPOJO);
		System.out.println(data);

	}

}
