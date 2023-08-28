package Http_Request.Post_Request.post_Pojo.pojo_post;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//        "firstname",
//        "lastname",
//        "totalprice",
//        "depositpaid",
//        "bookingdates",
//        "additionalneeds"
//})
@Getter
@Setter

public class Booking {

    @JsonProperty("firstname")
    private Object firstname;
    @JsonProperty("lastname")
    private Object lastname;
    @JsonProperty("totalprice")
    private Object totalprice;
    @JsonProperty("depositpaid")
    private Object depositpaid;
    @JsonProperty("bookingdates")
    private Bookingdates bookingdates;
    @JsonProperty("additionalneeds")
    private Object additionalneeds;
}
