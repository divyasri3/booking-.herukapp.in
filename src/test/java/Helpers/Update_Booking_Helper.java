package Helpers;

import Http_Request.Post_Request.post_Pojo.pojo_post.Booking;
import Http_Request.Post_Request.post_Pojo.pojo_post.Bookingdates;

import java.util.Date;

public class Update_Booking_Helper {
    public static Booking Update_Booking_Details(String firstname, String lastname, int totalprice,
                                                 boolean depositpaid, Date checkin, Date checkout, String additionalneeds) {


        Booking booking = new Booking();
        booking.setFirstname(firstname);
        booking.setLastname(lastname);
        booking.setTotalprice(totalprice);
        booking.setDepositpaid(depositpaid);
        Bookingdates bookingDate = new Bookingdates();
        booking.setBookingdates(bookingDate);
        bookingDate.setCheckin(checkin);
        bookingDate.setCheckout(checkout);
        booking.setAdditionalneeds(additionalneeds);
        return booking;
    }
}


