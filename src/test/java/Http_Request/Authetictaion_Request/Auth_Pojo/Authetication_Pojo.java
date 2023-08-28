package Http_Request.Authetictaion_Request.Auth_Pojo;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "username",
        "password"
})
@Setter
@Getter

public class Authetication_Pojo {

    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;

    @JsonProperty("token")
    private String token;

    @JsonProperty("reason")
    private String reason;

}
