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

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Department extends AbstractEntity {
    private String name;
    private City city;
    private Set<Employee> employees = new HashSet<>();

    public Department withId(Integer id) {
        setId(id);
        return this;
    }

    public Department withName(String name) {
        setName(name);
        return this;
    }

    public Department withCity(City city) {
        setCity(city);
        return this;
    }

    public Department withEmployee(Employee employee) {
        employees.add(employee);
        return this;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", city=" + city +
//                ", employees=" + employees +
                '}';
    }
}
