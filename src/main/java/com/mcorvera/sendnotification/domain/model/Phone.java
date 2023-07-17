package com.mcorvera.sendnotification.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone {
    private String number;
    private String citycode;
    private String contrycode;
}
