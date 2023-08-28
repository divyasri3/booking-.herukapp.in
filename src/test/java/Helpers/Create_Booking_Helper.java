package Helpers;

import Http_Request.Post_Request.post_Pojo.pojo_post.Booking;
import Http_Request.Post_Request.post_Pojo.pojo_post.Bookingdates;
import Http_Request.Post_Request.post_Pojo.pojo_post.Inter;

/*
{
    "firstname" : "Jim",
    "lastname" : "Brown",
    "totalprice" : 111,
    "depositpaid" : true,
    "bookingdates" : {
        "checkin" : "2018-01-01",
        "checkout" : "2019-01-01"
    },
    "additionalneeds" : "Breakfast"
}'
 */
public class Create_Booking_Helper {

    public static Booking create_Booking_Details(Object firstname, Object lastname, Object totalprice,
                                                 Object depositpaid, Object checkin, Object checkout, Object additionalneeds) {

        Inter p = new Inter();
        Booking booking = new Booking();
        p.setBooking(booking);
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
