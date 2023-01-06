package com.training.javaee.rest.models;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PersonRest {

    @NotNull(message = "name null olamaz")
    @NotEmpty(message = "name boş olamaz")
    @NotBlank(message = "name sadece boşluk karakteri olamaz")
    @Size(min = 2, max = 18, message = "name {min} ile {max} arasında olmalı")
    private String          name;
    @NotNull(message = "surname null olamaz")
    @NotEmpty(message = "surname boş olamaz")
    @NotBlank(message = "surname sadece boşluk karakteri olamaz")
    @Size(min = 3, max = 25, message = "surname {min} ile {max} arasında olmalı")
    private String          surname;
    @Max(300)
    @Min(60)
    private Integer         height;
    @Max(500)
    @Min(10)
    private Integer         weight;
    private List<String>    nicknames;
    @Valid
    private AddressRest     address;
    @Size(min = 1)
    private List<PhoneRest> phones;

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public Integer getHeight() {
        return this.height;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public List<String> getNicknames() {
        return this.nicknames;
    }

    public AddressRest getAddress() {
        return this.address;
    }

    public List<PhoneRest> getPhones() {
        return this.phones;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public void setHeight(final Integer heightParam) {
        this.height = heightParam;
    }

    public void setWeight(final Integer weightParam) {
        this.weight = weightParam;
    }

    public void setNicknames(final List<String> nicknamesParam) {
        this.nicknames = nicknamesParam;
    }

    public void setAddress(final AddressRest addressParam) {
        this.address = addressParam;
    }

    public void setPhones(final List<PhoneRest> phonesParam) {
        this.phones = phonesParam;
    }

    @Override
    public String toString() {
        return "PersonRest [name="
               + this.name
               + ", surname="
               + this.surname
               + ", height="
               + this.height
               + ", weight="
               + this.weight
               + ", nicknames="
               + this.nicknames
               + ", address="
               + this.address
               + ", phones="
               + this.phones
               + "]";
    }

}
