package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import junit.framework.Assert;
import resources.ResponseValidity;
import resources.RestPOJOFile;
import utilities.ExcellUtility;

public class EndToEndTest {

	int userID;

	@Test (dataProvider="getDataByExcell")
	public void CreatUserByPOJOAndExcell(String firstName, String title, String middleName, String lastName,
			String suffix, String gender, String maritalStatus, String employmentStatus, String birthDate,
			String languagePref) {
		RestAssured.baseURI="http://tekschool-test-env.herokuapp.com";
		RestPOJOFile restpojofile=new RestPOJOFile(firstName, title, middleName, lastName, suffix, gender, maritalStatus, employmentStatus, birthDate, languagePref);
Response response=given().contentType("application/json").body(restpojofile).when().post();
String allResponse=response.getBody().asString();
System.out.println(allResponse);
ResponseBody body=response.body();
ResponseValidity responseBody=body.as(ResponseValidity.class);
Assert.assertEquals("jgkjg", responseBody.firstName);
	}

	@DataProvider
	public Object[][] getDataByExcell() {
		Object[][] dataInfo = ExcellUtility.getDataFromExcell("sheetName1");
		return dataInfo;

	}
}
