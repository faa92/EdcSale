package util;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import models.UserModel;

import javax.annotation.Nullable;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

public class CsvReader {

    @Nullable
    public List<UserModel> readFileCsv(String filePath) {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        CsvToBean<UserModel> csvReader = new CsvToBeanBuilder<UserModel>(reader)
                .withType(UserModel.class)
                .withSeparator(',')
                .withIgnoreLeadingWhiteSpace(true)
                .withIgnoreEmptyLine(true)
                .build();
        List<UserModel> parse = csvReader.parse();
        return parse;
    }

//    public List<UserModel> readCsv(String filePath) {
//        Map<String, String> mapping = new HashMap<>();
//        mapping.put("email", "email");
//        mapping.put("password", "password");
//
//        HeaderColumnNameTranslateMappingStrategy<UserModel> strategy = new HeaderColumnNameTranslateMappingStrategy<>();
//        strategy.setType(UserModel.class);
//        strategy.setColumnMapping(mapping);
//
//        CSVReader csvReader = null;
//        try {
//            csvReader = new CSVReader(new FileReader(filePath));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        CsvToBean<UserModel> csvToBean = new CsvToBean<>();
//        return csvToBean.parse(strategy, csvReader);   //todo ???
//    }


}
