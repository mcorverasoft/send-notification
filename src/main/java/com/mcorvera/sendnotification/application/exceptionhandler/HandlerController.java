package com.mcorvera.sendnotification.application.exceptionhandler;

import com.mcorvera.sendnotification.application.dtos.api.BaseResponse;
import com.mcorvera.sendnotification.application.dtos.api.ErrorBaseResponse;
import com.mcorvera.sendnotification.application.dtos.api.TypeError;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Arrays;
import java.util.stream.Collectors;

@RestControllerAdvice
public class HandlerController {
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public BaseResponse handleValidationException(MethodArgumentNotValidException ex){
        ErrorBaseResponse errorBaseResponse=ErrorBaseResponse.builder()
                .type(TypeError.VALIDATION)
                .errors((ex.getBindingResult()
                        .getAllErrors()
                        .stream().map(objectError -> {
                            String errorMessage=((FieldError) objectError).getField()+ " "+((FieldError) objectError).getDefaultMessage();
                            return errorMessage;
                        }).collect(Collectors.toList())))
                .build();

        BaseResponse baseResponse=BaseResponse.builder()
                .successful(false)
                .status(HttpStatus.BAD_REQUEST)
                .Response(0)
                .ErrorResponse(errorBaseResponse)
                .build();

        return baseResponse;
    }

    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public BaseResponse handleGenericException(Exception ex){
        ErrorBaseResponse errorBaseResponse=ErrorBaseResponse.builder()
                .type(TypeError.GENERIC_ERROR)
                .errors(Arrays.asList(ex.getMessage()))
                .build();
        BaseResponse baseResponse=BaseResponse.builder()
                .successful(false)
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .Response(0)
                .ErrorResponse(errorBaseResponse)
                .message("ERROR")
                .build();
        return baseResponse;
    }
}
