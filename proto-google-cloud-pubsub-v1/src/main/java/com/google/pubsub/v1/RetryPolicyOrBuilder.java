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

public interface RetryPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.RetryPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The minimum delay between consecutive deliveries of a given
   * message. Value should be between 0 and 600 seconds. Defaults to 10 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration minimum_backoff = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the minimumBackoff field is set.
   */
  boolean hasMinimumBackoff();
  /**
   *
   *
   * <pre>
   * Optional. The minimum delay between consecutive deliveries of a given
   * message. Value should be between 0 and 600 seconds. Defaults to 10 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration minimum_backoff = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The minimumBackoff.
   */
  com.google.protobuf.Duration getMinimumBackoff();
  /**
   *
   *
   * <pre>
   * Optional. The minimum delay between consecutive deliveries of a given
   * message. Value should be between 0 and 600 seconds. Defaults to 10 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration minimum_backoff = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getMinimumBackoffOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The maximum delay between consecutive deliveries of a given
   * message. Value should be between 0 and 600 seconds. Defaults to 600
   * seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration maximum_backoff = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the maximumBackoff field is set.
   */
  boolean hasMaximumBackoff();
  /**
   *
   *
   * <pre>
   * Optional. The maximum delay between consecutive deliveries of a given
   * message. Value should be between 0 and 600 seconds. Defaults to 600
   * seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration maximum_backoff = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The maximumBackoff.
   */
  com.google.protobuf.Duration getMaximumBackoff();
  /**
   *
   *
   * <pre>
   * Optional. The maximum delay between consecutive deliveries of a given
   * message. Value should be between 0 and 600 seconds. Defaults to 600
   * seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration maximum_backoff = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getMaximumBackoffOrBuilder();
}
