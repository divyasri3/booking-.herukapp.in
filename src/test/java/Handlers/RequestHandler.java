package Handlers;

import FrameWorkConstants.Authentication_Constants;
import FrameWorkConstants.CreateBooking_Constants;
import FrameWorkConstants.Routes;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

/*
This is the class used for  all HTTPS REQUEST METHODS
 */
public class RequestHandler {


    //This method for Get method
    public static Response sendGetRequest(String endpoint) {

        if (endpoint.equalsIgnoreCase(Routes.base_uri + Routes.get_Single_BookingId)) {
            // return the response of the get http request
            return given().header("accept", "application/json")
                    .pathParam("id_path", CreateBooking_Constants.id())
                    .get(endpoint);
        } else
            return given().header("accept", "application/json")
                    .get(endpoint);

    }

    //This method for Post method
    public static Response sendPostRequest(String endpoint, Object requestBody) {

        //serilization:
        String jsonResponse = null;
        try {
            jsonResponse = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(requestBody);

        } catch (JsonProcessingException e) {
            e.printStackTrace();

        }

        // return the reponse of the post http request
        return given()

                // setting the content type
                .contentType("application/json")

//               .header("accept", "application/json")
                //Setting the headers
                .header("contentType", "Application/json")

                // Setting the body with serilizationn
                .body(jsonResponse)

                // sending the post call
                .post(endpoint);

    }

    //This method for Put method

    public static Response sendPutRequest(String endpoint, Object requestBody) {

        //serilization:
        String jsonResponse = null;
        try {
            jsonResponse = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(requestBody);

        } catch (JsonProcessingException e) {
            e.printStackTrace();

        }


        // return the reponse of the get http request
        return given()

                // setting the content type
                .contentType("application/json")

                //Setting the headers
                .header("contentType", "Application/json")

                //.header("accept", "application/json")

                //Setting the cookie as a token
                .header("Cookie", "token=" + Authentication_Constants.auth_Constant())
                .pathParam("id_path", CreateBooking_Constants.id())

                // Setting the body with serilization
                .body(jsonResponse)

                // Sending the put call
                .put(endpoint);
    }

    public static Response sendPatchRequest(String endpoint, Object requestBody) {

        //serilization:
        String jsonResponse = null;
        try {
            jsonResponse = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(requestBody);

        } catch (JsonProcessingException e) {
            e.printStackTrace();

        }


        // return the reponse of the get http request
        return given()

                // setting the content type
                .contentType("application/json")

                //Setting the headers
                .header("contentType", "application/json")

                //.header("accept", "application/json")

                //Setting the cookie as a token
                .header("Cookie", "token=" + Authentication_Constants.auth_Constant())
                .pathParam("id_post", CreateBooking_Constants.id())

                // Setting the body with serilization
                .body(jsonResponse)

                // Sending the put call
                .patch(endpoint);

    }


    //This method for Delete method
    public static Response sendDeleteRequest(String endpoint) {

        // return the reponse of the delete http request
        return given()
                .contentType("application/json")

                //Setting the headers
                .header("contentType", "application/json")

                //.header("accept", "application/json")

                //Setting the cookie as a token
                .header("Cookie", "token=" + Authentication_Constants.auth_Constant())
                .pathParam("id_post", CreateBooking_Constants.id())
                .delete(endpoint);

    }

}

