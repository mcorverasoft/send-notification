package hipotecario.com.sv.sendnotification.application.dtos.api;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.Instant;

@Data
@Builder
public class BaseResponse {
    @Builder.Default
    private boolean successful=true;
    @Builder.Default
    private HttpStatus status=HttpStatus.OK;
    @Builder.Default
    private Instant date=Instant.now();
    @Builder.Default
    private Object Response=0;
    @Builder.Default
    private ErrorBaseResponse ErrorResponse=new ErrorBaseResponse.ErrorBaseResponseBuilder().build();
    @Builder.Default
    private String message="TRANSACTION OK";
}
