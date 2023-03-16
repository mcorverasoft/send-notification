package hipotecario.com.sv.sendnotification.application.dtos.api;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class ErrorBaseResponse {
    @Builder.Default
    private Long idLog=0L;
    @Builder.Default
    private TypeError type=TypeError.NO_ERROR;
    @Builder.Default
    List<String> errors=new ArrayList<>();

}
