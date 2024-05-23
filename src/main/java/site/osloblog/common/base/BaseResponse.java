package site.osloblog.common.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@ToString
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse<T> {

  private T data;
  private HttpStatus status;
  private String message;

  public BaseResponse(HttpStatus status, String message) {
    this.status = status;
    this.message = message;
  }

  // 요청 성공
  public static <T> BaseResponse<T> success(T data) {
    return new BaseResponse<>(data, HttpStatus.OK, HttpStatus.OK.name());
  }

  // 요청 실패
  public static <T> BaseResponse<T> fail(HttpStatus status, String message) {
    return new BaseResponse<>(status, message);
  }

  public static <T> BaseResponse<T> of(T data, HttpStatus status, String message) {
    return new BaseResponse<>(data, status, message);
  }




}