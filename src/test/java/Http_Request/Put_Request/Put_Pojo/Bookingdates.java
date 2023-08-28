package Http_Request.Put_Request.Put_Pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//        "checkin",
//        "checkout"
//})
@Setter
@Getter
public class Bookingdates {

    @JsonProperty("checkin")
    private Object checkin;
    @JsonProperty("checkout")
    private Object checkout;

}