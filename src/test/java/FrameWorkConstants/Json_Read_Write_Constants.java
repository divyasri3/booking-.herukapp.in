package FrameWorkConstants;

import io.restassured.response.Response;
import lombok.SneakyThrows;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Json_Read_Write_Constants {
    private Json_Read_Write_Constants() {
    }

    @SneakyThrows
    public static String readJsonAndGetAsString(String filepath) {
        return new String(Files.readAllBytes(Paths.get(filepath)));
    }

    public static void storeStringJson(String filepath, Response res) throws IOException {
        Files.write(Paths.get(filepath), res.asByteArray());

    }
}
