import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

//Anotation that will ignore all propertie exept one that was added : @JsonIgnoreProperties(ignoreUnknown = true)
//It help if api was changed, but you dont have time or dont want to change tests

public class ResponseEmployeeBody {

    private String status;

    private ResponceDataId data;

    private String message;

}
