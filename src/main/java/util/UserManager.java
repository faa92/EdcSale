package util;


import data.Config;
import models.UserModel;

import java.util.List;

public class UserManager {

    public List<UserModel> getUserListFromCsv(Config filePath) {
        CsvReader csvReader = new CsvReader();
        return csvReader.readFileCsv(filePath.toString());
    }

}
