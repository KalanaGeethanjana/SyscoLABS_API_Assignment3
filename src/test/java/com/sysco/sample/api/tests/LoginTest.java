package com.sysco.sample.api.tests;

import com.jayway.restassured.response.Response;
import com.sysco.sample.api.common.StatusCodes;
import com.sysco.sample.api.requests.functions.Project;
import com.sysco.sample.api.response.model.GetEmployeeRes;
import com.sysco.sample.api.response.model.ProjectModel;
import com.sysco.sample.api.util.ResponseUtil;
import com.sysco.sample.api.util.TestBase;
import org.json.JSONException;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {


    @BeforeClass
    public static void initiate(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Login - ValidLogin");
    }

    @Test(description = "ID-001", alwaysRun = true)
    public static void testGetEmployee() throws JSONException {

        SoftAssert softAssert = new SoftAssert();
       /*
       Getting the project list as [{},{},]
        */
        Response employeeList = Project.getEmployees();
        GetEmployeeRes  getEmployeeRes = (GetEmployeeRes)ResponseUtil.getObject(employeeList.asString(), GetEmployeeRes.class);

        softAssert.assertEquals(getEmployeeRes.status, "success", "Wrong Success message");
        softAssert.assertEquals(getEmployeeRes.data.get(0).id, "1", "Wrong Id");
        softAssert.assertEquals(getEmployeeRes.data.get(0).employeeName, "Tiger Nixon", "Wrong Employee Name");
        softAssert.assertEquals(getEmployeeRes.data.get(0).employeeSalary, "320800", "Wrong Salary");
        softAssert.assertEquals(getEmployeeRes.data.get(0).employeeAge, "61", "Wrong Age");
        softAssert.assertEquals(getEmployeeRes.data.get(0).profileImage, "","Profile pic exists");

        //System.out.println(getEmployeeRes.status);
        //System.out.println(getEmployeeRes.data.get(0).employeeName);

        softAssert.assertAll();;
    }

}
