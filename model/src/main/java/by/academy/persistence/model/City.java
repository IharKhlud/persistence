package by.academy.persistence.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true, exclude = "departments")
@Data
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class City extends AbstractEntity {
    private String name;

    private Set<Department> departments = new HashSet<>();
    public City withId(Integer id) {
        setId(id);
        return this;
    }

    public City withDepartment(Department department) {
        departments.add(department);
        return this;
    }

    public City withName(String name) {
        setName(name);
        return this;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
//                ", departments=" + departments +
                '}';
    }
}
