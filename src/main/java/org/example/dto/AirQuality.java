package org.example.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class AirQuality {
    private Double co;
    private Double no2;
    private Double o3;
    private Double so2;
    private Double pm_5;
    private Double pm10;
    @SerializedName("us-epa-index")
    private Double UsEpaIndex;
    @SerializedName("gb-defra-index")
    private Double GbDefraIndex;

}
