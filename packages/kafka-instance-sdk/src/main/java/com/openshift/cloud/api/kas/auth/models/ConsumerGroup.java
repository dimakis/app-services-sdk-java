/*
 * Kafka Admin REST API
 * An API to provide REST endpoints for query Kafka for admin operations
 *
 * The version of the OpenAPI document: 0.11.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.kas.auth.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.openshift.cloud.api.kas.auth.models.Consumer;
import com.openshift.cloud.api.kas.auth.models.ConsumerGroupAllOf;
import com.openshift.cloud.api.kas.auth.models.ConsumerGroupMetrics;
import com.openshift.cloud.api.kas.auth.models.ConsumerGroupState;
import com.openshift.cloud.api.kas.auth.models.ObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ConsumerGroup
 */
@JsonPropertyOrder({
  ConsumerGroup.JSON_PROPERTY_ID,
  ConsumerGroup.JSON_PROPERTY_KIND,
  ConsumerGroup.JSON_PROPERTY_HREF,
  ConsumerGroup.JSON_PROPERTY_GROUP_ID,
  ConsumerGroup.JSON_PROPERTY_STATE,
  ConsumerGroup.JSON_PROPERTY_CONSUMERS,
  ConsumerGroup.JSON_PROPERTY_METRICS
})
@JsonTypeName("ConsumerGroup")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConsumerGroup {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_KIND = "kind";
  private String kind;

  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_GROUP_ID = "groupId";
  private String groupId;

  public static final String JSON_PROPERTY_STATE = "state";
  private ConsumerGroupState state;

  public static final String JSON_PROPERTY_CONSUMERS = "consumers";
  private List<Consumer> consumers = new ArrayList<>();

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private ConsumerGroupMetrics metrics;

  public ConsumerGroup() { 
  }

  @JsonCreator
  public ConsumerGroup(
    @JsonProperty(JSON_PROPERTY_KIND) String kind
  ) {
    this();
    this.kind = kind;
  }

  public ConsumerGroup id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the object. Not supported for all object kinds.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the object. Not supported for all object kinds.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKind() {
    return kind;
  }




  public ConsumerGroup href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Link path to request the object. Not supported for all object kinds.
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Link path to request the object. Not supported for all object kinds.")
  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHref() {
    return href;
  }


  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHref(String href) {
    this.href = href;
  }


  public ConsumerGroup groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Unique identifier for the consumer group
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier for the consumer group")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public ConsumerGroup state(ConsumerGroupState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConsumerGroupState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(ConsumerGroupState state) {
    this.state = state;
  }


  public ConsumerGroup consumers(List<Consumer> consumers) {
    
    this.consumers = consumers;
    return this;
  }

  public ConsumerGroup addConsumersItem(Consumer consumersItem) {
    this.consumers.add(consumersItem);
    return this;
  }

   /**
   * The list of consumers associated with this consumer group
   * @return consumers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of consumers associated with this consumer group")
  @JsonProperty(JSON_PROPERTY_CONSUMERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Consumer> getConsumers() {
    return consumers;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConsumers(List<Consumer> consumers) {
    this.consumers = consumers;
  }


  public ConsumerGroup metrics(ConsumerGroupMetrics metrics) {
    
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConsumerGroupMetrics getMetrics() {
    return metrics;
  }


  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetrics(ConsumerGroupMetrics metrics) {
    this.metrics = metrics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerGroup consumerGroup = (ConsumerGroup) o;
    return Objects.equals(this.id, consumerGroup.id) &&
        Objects.equals(this.kind, consumerGroup.kind) &&
        Objects.equals(this.href, consumerGroup.href) &&
        Objects.equals(this.groupId, consumerGroup.groupId) &&
        Objects.equals(this.state, consumerGroup.state) &&
        Objects.equals(this.consumers, consumerGroup.consumers) &&
        Objects.equals(this.metrics, consumerGroup.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, href, groupId, state, consumers, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    consumers: ").append(toIndentedString(consumers)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

