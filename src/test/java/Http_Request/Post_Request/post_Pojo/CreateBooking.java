package Http_Request.Post_Request.post_Pojo;

import Annotation.FrameWorkAnnotation;
import Extent.BaseTest;
import Extent.ExtentLogger;
import FrameWorkConstants.FilePath_Constants;
import FrameWorkConstants.Routes;
import Handlers.RequestHandler;
import Helpers.Create_Booking_Helper;
import Properties.PropertiesManager;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;


public class CreateBooking extends BaseTest {


    public static Object lastname;
    public static Integer id;
    @FrameWorkAnnotation(author = "divya",category = "sannity")

    @Test(priority = 1)
    public static void test_CreateABooking() throws IOException {

        Response response = RequestHandler.sendPostRequest(Routes.base_uri + Routes.post_booking, Create_Booking_Helper.create_Booking_Details("divya sri", "kanumuri",
                121, true, "2022-01-02", "2023-05-11", "breakfast"));

        System.out.println(response.getBody().asPrettyString());

        PropertiesManager propertiesManager = new PropertiesManager(FilePath_Constants.getResponseJsonPath() + "Id.properyies");
        propertiesManager.setPropertyInt("id", response.jsonPath().getJsonObject("bookingid"));
        propertiesManager.saveProperties();
        ExtentLogger.logResponse(response.asPrettyString());
    }
}



