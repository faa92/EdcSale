package models;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserModel implements Serializable {
    @CsvBindByName(column = "email")
    String email;
    @CsvBindByName(column = "password")
    String password;

    @Override
    public String toString() {
        return "UserModel: " + email + " " + password;
    }
}
