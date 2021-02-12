package apps.proman.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateBoardProjectRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-13T01:17:10.302+05:30")

public class UpdateBoardProjectRequest   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("owner_id")
  private UUID ownerId = null;

  @JsonProperty("start_date")
  private String startDate = null;

  @JsonProperty("end_date")
  private String endDate = null;

  public UpdateBoardProjectRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the new Project
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the new Project")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateBoardProjectRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the new project
   * @return description
  **/
  @ApiModelProperty(value = "Description of the new project")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateBoardProjectRequest ownerId(UUID ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Unique identifier of the board project owner in a standard UUID format
   * @return ownerId
  **/
  @ApiModelProperty(value = "Unique identifier of the board project owner in a standard UUID format")

  @Valid

  public UUID getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(UUID ownerId) {
    this.ownerId = ownerId;
  }

  public UpdateBoardProjectRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date of the project
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "Start date of the project")
  @NotNull


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public UpdateBoardProjectRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date of the project
   * @return endDate
  **/
  @ApiModelProperty(required = true, value = "End date of the project")
  @NotNull


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBoardProjectRequest updateBoardProjectRequest = (UpdateBoardProjectRequest) o;
    return Objects.equals(this.name, updateBoardProjectRequest.name) &&
        Objects.equals(this.description, updateBoardProjectRequest.description) &&
        Objects.equals(this.ownerId, updateBoardProjectRequest.ownerId) &&
        Objects.equals(this.startDate, updateBoardProjectRequest.startDate) &&
        Objects.equals(this.endDate, updateBoardProjectRequest.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, ownerId, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBoardProjectRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

