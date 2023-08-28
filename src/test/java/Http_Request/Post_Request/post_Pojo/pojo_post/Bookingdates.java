package Http_Request.Post_Request.post_Pojo.pojo_post;

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