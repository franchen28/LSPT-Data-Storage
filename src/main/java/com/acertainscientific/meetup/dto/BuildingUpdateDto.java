package com.acertainscientific.meetup.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BuildingUpdateDto {
    private int id;
    private String name;
    private int floorStart;
    private int floorEnd;
}
