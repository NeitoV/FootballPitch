package com.football.pitch.data.dto.booking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingCreationDTO {
    private Long pitchDetailsId;
    private Date date;
    private String fullName;
    private String phoneNumber;
    private String promotionCode;
}
