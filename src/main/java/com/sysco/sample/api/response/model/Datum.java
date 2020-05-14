
package com.sysco.sample.api.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "employee_name",
    "employee_salary",
    "employee_age",
    "profile_image"
})
public class Datum {

    @JsonProperty("id")
    public String id;
    @JsonProperty("employee_name")
    public String employeeName;
    @JsonProperty("employee_salary")
    public String employeeSalary;
    @JsonProperty("employee_age")
    public String employeeAge;
    @JsonProperty("profile_image")
    public String profileImage;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum() {
    }

    /**
     * 
     * @param employeeName
     * @param employeeAge
     * @param id
     * @param profileImage
     * @param employeeSalary
     */
    public Datum(String id, String employeeName, String employeeSalary, String employeeAge, String profileImage) {
        super();
        this.id = id;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeAge = employeeAge;
        this.profileImage = profileImage;
    }

}
