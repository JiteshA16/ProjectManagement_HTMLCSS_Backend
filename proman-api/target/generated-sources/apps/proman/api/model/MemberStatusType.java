package apps.proman.api.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Status of the board
 */
public enum MemberStatusType {
  
  REGISTERED("REGISTERED"),
  
  ACTIVE("ACTIVE"),
  
  INACTIVE("INACTIVE"),
  
  LOCKED("LOCKED");

  private String value;

  MemberStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MemberStatusType fromValue(String text) {
    for (MemberStatusType b : MemberStatusType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

