package by.academy.persistence.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Title extends AbstractEntity {
    private String name;

    public Title withId(Integer id) {
        setId(id);
        return this;
    }

    public Title withName(String name) {
        setName(name);
        return this;
    }
}
