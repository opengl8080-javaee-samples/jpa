package sample.javaee.jpa.converter;

import java.util.Objects;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class LettyWhiterockConverter implements AttributeConverter<String, Integer>{

    @Override
    public Integer convertToDatabaseColumn(String attribute) {
        return "hoge".equals(attribute) ? 1 : 0;
    }

    @Override
    public String convertToEntityAttribute(Integer dbData) {
        return Objects.equals(dbData, 1) ? "hoge" : "fuga";
    }
}
