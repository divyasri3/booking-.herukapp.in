package Http_Request.Get_Request;

import Annotation.FrameWorkAnnotation;
import Extent.BaseTest;
import Extent.ExtentLogger;
import FrameWorkConstants.Routes;
import Handlers.RequestHandler;
import Handlers.ResponseHandler;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class FetchSingleBookingId extends BaseTest {
    @FrameWorkAnnotation(author = "divya",category = "sannity")

    @Test
    public void test_GetSingleBookingId() {
        Response response = RequestHandler.sendGetRequest(Routes.base_uri + Routes.get_Single_BookingId);
        ResponseHandler responseHandler = new ResponseHandler(response);
        System.out.println(responseHandler.getResponseBody());
        ExtentLogger.logResponse(response.asPrettyString());

    }
}
