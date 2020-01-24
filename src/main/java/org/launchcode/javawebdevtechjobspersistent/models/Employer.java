package org.launchcode.javawebdevtechjobspersistent.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required")
    @Size(min = 3, max = 120, message = "Location must be between 3 and 120 characters")
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
