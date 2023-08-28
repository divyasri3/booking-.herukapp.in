package Http_Request.Put_Request;

import Annotation.FrameWorkAnnotation;
import Extent.BaseTest;
import Extent.ExtentLogger;
import FrameWorkConstants.Routes;
import Handlers.RequestHandler;
import Helpers.Update_Booking_Helper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Date;


public class UpdateBooking extends BaseTest {

    //public static String token;
//@Test(priority = 1)
//    public static void test_Generate_Token() throws IOException {
////sending request to the server
//        Response response = RequestHandler.sendPostRequest
//                (Routes.base_uri + Routes.post_auth, Authentication_Helper.Generate_Token());
//  token=  response.jsonPath().get("token").toString();
//    System.out.println(token);
//    System.out.println("=============121212");
//        Json_Read_Write_Constants.storeStringJson(FilePath_Constants.getResponseJsonPath() + "Authentication", response);
//
//    }
    @FrameWorkAnnotation(author = "divya",category = "sannity")

    @Test(priority = 2)
    public static void test_UpdateBooking() {

        Response response = RequestHandler.sendPutRequest(Routes.base_uri + Routes.put_booking_Id, Update_Booking_Helper.Update_Booking_Details("kavitha", "kanumuri",
                121, true, new Date(2018, 01, 01), new Date(2019, 01, 01), "lunch"));
        System.out.println(response.getBody().asPrettyString());
        System.out.println(response.getStatusCode());
        ExtentLogger.logResponse(response.asPrettyString());

    }
}
