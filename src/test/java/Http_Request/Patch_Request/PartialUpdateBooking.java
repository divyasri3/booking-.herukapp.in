package Http_Request.Patch_Request;

import Annotation.FrameWorkAnnotation;
import Extent.BaseTest;
import Extent.ExtentLogger;
import FrameWorkConstants.Routes;
import Handlers.RequestHandler;
import Helpers.PartialUpdate_Helper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PartialUpdateBooking extends BaseTest {
    @FrameWorkAnnotation(author = "divya",category = "sannity")

    @Test
    public static void test_PartialUpdateDetails() {

        Response response = RequestHandler.sendPatchRequest(Routes.base_uri + Routes.patch_booking_Id,
                PartialUpdate_Helper.PartialUpdate_Booking_Details("lalitha", "lvitha", 555));
        System.out.println(response.getBody().asPrettyString());
        System.out.println(response.getStatusCode());
        ExtentLogger.logResponse(response.asPrettyString());


    }
}
