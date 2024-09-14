package org.example.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Current {

    @SerializedName("last_updated_epoch")
    private Long lastUpdatedEpoch;
    @SerializedName("last_updated")
    private String lastUpdated;
    @SerializedName("temp_c")
    private Double tempC;
    @SerializedName("temp_f")
    private Double tempF;
    @SerializedName("is_day")
    private Integer isDay;
    @SerializedName("wind_mph")
    private Double windMph;
    @SerializedName("wind_kph")
    private Double windKph;
    @SerializedName("wind_degree")
    private Double wind_degree;
    @SerializedName("wind_dir")
    private String wind_dir;
    @SerializedName("pressure_mb")
    private Double pressure_mb;
    @SerializedName("pressure_in")
    private Double pressure_in;
    @SerializedName("precip_mm")
    private Double precip_mm;
    @SerializedName("precip_in")
    private Double precip_in;

    private Double humidity;

    private Double cloud;
    @SerializedName("feelslike_c")
    private Double feelslikeC;
    @SerializedName("feelslike_f")
    private Double feelslikeF;
    @SerializedName("vis_km")
    private Double visKm;
    @SerializedName("vis_miles")
    private Double visMiles;

    private Double uv;
    @SerializedName("gust_mph")
    private Double gustMph;
    @SerializedName("gust_kph")
    private Double gustKph;
    @SerializedName("air_quality")
    private AirQuality airQuality;

}
