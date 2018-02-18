package pl.sunflux.HRFlux.rest.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("success")
public class EndpointResponse {

    @ApiModelProperty("status")
    private String status = "OK";

    @ApiModelProperty("message")
    private String message;

    public EndpointResponse(String message) {
        this.message = message;
    }
}
