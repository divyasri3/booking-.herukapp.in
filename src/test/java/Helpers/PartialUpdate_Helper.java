package Helpers;

import java.util.HashMap;
import java.util.Map;

public class PartialUpdate_Helper {
    public static Map<String, Object> PartialUpdate_Booking_Details(String fname, String lastnm, int totalp) {


        Map<String, Object> updateData = new HashMap<>();
        updateData.put("firstname", fname);
        updateData.put("lastname", lastnm);
        updateData.put("totalprice", totalp);

//        Booking booking = new Booking();
//
//        booking.setFirstname(firstname);
////        booking.setLastname(lastname);
//        Integer totalprice = null;
//        booking.setTotalprice(totalprice);
//        booking.setDepositpaid(depositpaid);
//        Bookingdates bookingDate = new Bookingdates();
//        booking.setBookingdates(bookingDate);
//        bookingDate.setCheckin(checkin);
//        bookingDate.setCheckout(checkout);
//        booking.setAdditionalneeds(additionalneeds);
        return updateData;
    }
}
