package Http_Request.Get_Request;

import Annotation.FrameWorkAnnotation;
import Extent.BaseTest;
import Extent.ExtentLogger;
import FrameWorkConstants.Routes;
import Handlers.RequestHandler;
import Handlers.ResponseHandler;
import Http_Request.Get_Request.Pojo.Booking;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class FetchBookinIds extends BaseTest {
    @FrameWorkAnnotation(author = "divya",category = "sannity")

    @Test
    public void test_GetAllBookingIds() {
        Response response = RequestHandler.sendGetRequest(Routes.base_uri + Routes.get_BookingIds);
        ResponseHandler responseHandler = new ResponseHandler(response);
        System.out.println(responseHandler.getResponseBody());

        Booking[] bookings = responseHandler.getResponseObject(Booking[].class);

        for (Booking booking : bookings) {
            System.out.println(booking);
            ExtentLogger.logResponse(booking.toString());
        }


    }

}