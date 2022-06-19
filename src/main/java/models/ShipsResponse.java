package models;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ShipsResponse extends BaseResponse {
    private String name;
    private String model;
    private String manufacturer;
    @SerializedName(value = "cost_in_credits")
    private String costInCredits;
    private double length;
    @SerializedName(value = "max_atmosphering_speed")
    private String maxAtmospheringSpeed;
    private String crew;
    private String passengers;
    @SerializedName(value = "cargo_capacity")
    private double cargoCapacity;
    private String consumables;
    private float hyperdrive_rating;
    private int MGLT;
    @SerializedName(value = "starship_class")
    private String starshipClass;
    private PilotsResponse[] pilots;
    private String[] films;
    private String created;
    private String edited;
    private String url;


}