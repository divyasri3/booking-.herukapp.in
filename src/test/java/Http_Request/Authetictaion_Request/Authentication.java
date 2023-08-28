package Http_Request.Authetictaion_Request;

import Annotation.FrameWorkAnnotation;
import Extent.BaseTest;
import Extent.ExtentLogger;
import FrameWorkConstants.Authentication_Constants;
import FrameWorkConstants.FilePath_Constants;
import FrameWorkConstants.Routes;
import Handlers.RequestHandler;
import Helpers.Authentication_Helper;
import Properties.PropertiesManager;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

public class Authentication extends BaseTest {

@FrameWorkAnnotation(author = "divya",category = "sannity")
    @Test
    public static void test_Generate_Token() throws IOException {
//sending request to the server
        Response response = RequestHandler.sendPostRequest
                (Routes.base_uri + Routes.post_auth, Authentication_Helper.Generate_Token());

        System.out.println(response.getBody().asPrettyString());
        //Storing Authentication in a file
        PropertiesManager propertiesManager = new PropertiesManager(FilePath_Constants.getResponseJsonPath() + "Authentication");

        propertiesManager.setProperty("generated_Token", response.jsonPath().getJsonObject("token"));
        propertiesManager.saveProperties();

        String sut = Authentication_Constants.auth_Constant();

        System.out.println(sut);
        ExtentLogger.logResponse(sut);
    }
}
