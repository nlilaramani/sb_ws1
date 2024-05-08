package com.sb.ecomm.contract;

import org.springframework.boot.jackson.JsonComponent;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonComponent
@AllArgsConstructor()
@NoArgsConstructor
@Getter @Setter
public class UserContract {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private String email;
}
