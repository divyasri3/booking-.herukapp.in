package Http_Request.Patch_Request.Put_Pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingRequest {
    private String firstname;
    private String lastname;
    private Integer totalprice;
    private Boolean depositpaid;
    private BookingDates bookingdates;
    private String additionalneeds;

} // Getters and setters