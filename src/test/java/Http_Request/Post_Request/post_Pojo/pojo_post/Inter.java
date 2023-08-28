package Http_Request.Post_Request.post_Pojo.pojo_post;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
//   // @JsonPropertyOrder({
//            "bookingid",
//            "booking"
//    })
@Getter
@Setter
public class Inter {

    @JsonProperty("bookingid")
    private Object bookingid;
    @JsonProperty("booking")
    private Booking booking;

}