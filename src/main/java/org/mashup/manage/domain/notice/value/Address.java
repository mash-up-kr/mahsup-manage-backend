package org.mashup.manage.domain.notice.value;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Address {

    private double latitude;
    private double longitude;
    private String location;

    public static Address of(double latitude, double longitude, String location) {
        return new Address(latitude, longitude, location);
    }
}
