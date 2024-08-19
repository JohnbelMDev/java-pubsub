/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

// Protobuf Java Version: 3.25.4
package com.google.pubsub.v1;

public interface TopicOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.Topic)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the topic. It must have the format
   * `"projects/{project}/topics/{topic}"`. `{topic}` must start with a letter,
   * and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`),
   * underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent
   * signs (`%`). It must be between 3 and 255 characters in length, and it
   * must not start with `"goog"`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the topic. It must have the format
   * `"projects/{project}/topics/{topic}"`. `{topic}` must start with a letter,
   * and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`),
   * underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent
   * signs (`%`). It must be between 3 and 255 characters in length, and it
   * must not start with `"goog"`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. See [Creating and managing labels]
   * (https://cloud.google.com/pubsub/docs/labels).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. See [Creating and managing labels]
   * (https://cloud.google.com/pubsub/docs/labels).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. See [Creating and managing labels]
   * (https://cloud.google.com/pubsub/docs/labels).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. See [Creating and managing labels]
   * (https://cloud.google.com/pubsub/docs/labels).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. See [Creating and managing labels]
   * (https://cloud.google.com/pubsub/docs/labels).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Policy constraining the set of Google Cloud Platform regions
   * where messages published to the topic may be stored. If not present, then
   * no constraints are in effect.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.MessageStoragePolicy message_storage_policy = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the messageStoragePolicy field is set.
   */
  boolean hasMessageStoragePolicy();
  /**
   *
   *
   * <pre>
   * Optional. Policy constraining the set of Google Cloud Platform regions
   * where messages published to the topic may be stored. If not present, then
   * no constraints are in effect.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.MessageStoragePolicy message_storage_policy = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The messageStoragePolicy.
   */
  com.google.pubsub.v1.MessageStoragePolicy getMessageStoragePolicy();
  /**
   *
   *
   * <pre>
   * Optional. Policy constraining the set of Google Cloud Platform regions
   * where messages published to the topic may be stored. If not present, then
   * no constraints are in effect.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.MessageStoragePolicy message_storage_policy = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.pubsub.v1.MessageStoragePolicyOrBuilder getMessageStoragePolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The resource name of the Cloud KMS CryptoKey to be used to
   * protect access to messages published on this topic.
   *
   * The expected format is `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;`.
   * </pre>
   *
   * <code>string kms_key_name = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The kmsKeyName.
   */
  java.lang.String getKmsKeyName();
  /**
   *
   *
   * <pre>
   * Optional. The resource name of the Cloud KMS CryptoKey to be used to
   * protect access to messages published on this topic.
   *
   * The expected format is `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;`.
   * </pre>
   *
   * <code>string kms_key_name = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for kmsKeyName.
   */
  com.google.protobuf.ByteString getKmsKeyNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Settings for validating messages published against a schema.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.SchemaSettings schema_settings = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the schemaSettings field is set.
   */
  boolean hasSchemaSettings();
  /**
   *
   *
   * <pre>
   * Optional. Settings for validating messages published against a schema.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.SchemaSettings schema_settings = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The schemaSettings.
   */
  com.google.pubsub.v1.SchemaSettings getSchemaSettings();
  /**
   *
   *
   * <pre>
   * Optional. Settings for validating messages published against a schema.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.SchemaSettings schema_settings = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.pubsub.v1.SchemaSettingsOrBuilder getSchemaSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Reserved for future use. This field is set only in responses from
   * the server; it is ignored if it is set in any requests.
   * </pre>
   *
   * <code>bool satisfies_pzs = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The satisfiesPzs.
   */
  boolean getSatisfiesPzs();

  /**
   *
   *
   * <pre>
   * Optional. Indicates the minimum duration to retain a message after it is
   * published to the topic. If this field is set, messages published to the
   * topic in the last `message_retention_duration` are always available to
   * subscribers. For instance, it allows any attached subscription to [seek to
   * a
   * timestamp](https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time)
   * that is up to `message_retention_duration` in the past. If this field is
   * not set, message retention is controlled by settings on individual
   * subscriptions. Cannot be more than 31 days or less than 10 minutes.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration message_retention_duration = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the messageRetentionDuration field is set.
   */
  boolean hasMessageRetentionDuration();
  /**
   *
   *
   * <pre>
   * Optional. Indicates the minimum duration to retain a message after it is
   * published to the topic. If this field is set, messages published to the
   * topic in the last `message_retention_duration` are always available to
   * subscribers. For instance, it allows any attached subscription to [seek to
   * a
   * timestamp](https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time)
   * that is up to `message_retention_duration` in the past. If this field is
   * not set, message retention is controlled by settings on individual
   * subscriptions. Cannot be more than 31 days or less than 10 minutes.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration message_retention_duration = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The messageRetentionDuration.
   */
  com.google.protobuf.Duration getMessageRetentionDuration();
  /**
   *
   *
   * <pre>
   * Optional. Indicates the minimum duration to retain a message after it is
   * published to the topic. If this field is set, messages published to the
   * topic in the last `message_retention_duration` are always available to
   * subscribers. For instance, it allows any attached subscription to [seek to
   * a
   * timestamp](https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time)
   * that is up to `message_retention_duration` in the past. If this field is
   * not set, message retention is controlled by settings on individual
   * subscriptions. Cannot be more than 31 days or less than 10 minutes.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration message_retention_duration = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getMessageRetentionDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. An output-only field indicating the state of the topic.
   * </pre>
   *
   * <code>.google.pubsub.v1.Topic.State state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. An output-only field indicating the state of the topic.
   * </pre>
   *
   * <code>.google.pubsub.v1.Topic.State state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.pubsub.v1.Topic.State getState();

  /**
   *
   *
   * <pre>
   * Optional. Settings for ingestion from a data source into this topic.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionDataSourceSettings ingestion_data_source_settings = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the ingestionDataSourceSettings field is set.
   */
  boolean hasIngestionDataSourceSettings();
  /**
   *
   *
   * <pre>
   * Optional. Settings for ingestion from a data source into this topic.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionDataSourceSettings ingestion_data_source_settings = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The ingestionDataSourceSettings.
   */
  com.google.pubsub.v1.IngestionDataSourceSettings getIngestionDataSourceSettings();
  /**
   *
   *
   * <pre>
   * Optional. Settings for ingestion from a data source into this topic.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionDataSourceSettings ingestion_data_source_settings = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.pubsub.v1.IngestionDataSourceSettingsOrBuilder
      getIngestionDataSourceSettingsOrBuilder();
}
