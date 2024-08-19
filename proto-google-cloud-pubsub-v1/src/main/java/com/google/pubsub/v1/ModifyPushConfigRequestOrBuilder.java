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

public interface ModifyPushConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.ModifyPushConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the subscription.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>
   * string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The subscription.
   */
  java.lang.String getSubscription();
  /**
   *
   *
   * <pre>
   * Required. The name of the subscription.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>
   * string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for subscription.
   */
  com.google.protobuf.ByteString getSubscriptionBytes();

  /**
   *
   *
   * <pre>
   * Required. The push configuration for future deliveries.
   *
   * An empty `pushConfig` indicates that the Pub/Sub system should
   * stop pushing messages from the given subscription and allow
   * messages to be pulled and acknowledged - effectively pausing
   * the subscription if `Pull` or `StreamingPull` is not called.
   * </pre>
   *
   * <code>.google.pubsub.v1.PushConfig push_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the pushConfig field is set.
   */
  boolean hasPushConfig();
  /**
   *
   *
   * <pre>
   * Required. The push configuration for future deliveries.
   *
   * An empty `pushConfig` indicates that the Pub/Sub system should
   * stop pushing messages from the given subscription and allow
   * messages to be pulled and acknowledged - effectively pausing
   * the subscription if `Pull` or `StreamingPull` is not called.
   * </pre>
   *
   * <code>.google.pubsub.v1.PushConfig push_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The pushConfig.
   */
  com.google.pubsub.v1.PushConfig getPushConfig();
  /**
   *
   *
   * <pre>
   * Required. The push configuration for future deliveries.
   *
   * An empty `pushConfig` indicates that the Pub/Sub system should
   * stop pushing messages from the given subscription and allow
   * messages to be pulled and acknowledged - effectively pausing
   * the subscription if `Pull` or `StreamingPull` is not called.
   * </pre>
   *
   * <code>.google.pubsub.v1.PushConfig push_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.pubsub.v1.PushConfigOrBuilder getPushConfigOrBuilder();
}
