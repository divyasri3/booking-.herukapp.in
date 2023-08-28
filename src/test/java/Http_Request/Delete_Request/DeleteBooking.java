package Http_Request.Delete_Request;

import Annotation.FrameWorkAnnotation;
import Extent.ExtentLogger;
import FrameWorkConstants.Routes;
import Handlers.RequestHandler;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class DeleteBooking {

    @FrameWorkAnnotation(author = "divya",category = "sannity")

    @Test
    public static void test_DeleteBooking() {

        Response response = RequestHandler.sendDeleteRequest(Routes.base_uri + Routes.delete_booking_Id);
        System.out.println(response.getBody().asPrettyString());
        System.out.println(response.getStatusCode());
        ExtentLogger.logResponse(response.getBody().asPrettyString());
    }
}
