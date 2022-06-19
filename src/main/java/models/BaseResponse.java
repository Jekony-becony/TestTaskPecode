package models;

import lombok.Getter;

@Getter
public class BaseResponse {
    protected String message;
    protected String errorType;
    protected String timestamp;
}