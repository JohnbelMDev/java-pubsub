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

// Protobuf Java Version: 3.25.2
package com.google.pubsub.v1;

public interface AcknowledgeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.AcknowledgeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The subscription whose message is being acknowledged.
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
   * Required. The subscription whose message is being acknowledged.
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
   * Required. The acknowledgment ID for the messages being acknowledged that
   * was returned by the Pub/Sub system in the `Pull` response. Must not be
   * empty.
   * </pre>
   *
   * <code>repeated string ack_ids = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the ackIds.
   */
  java.util.List<java.lang.String> getAckIdsList();
  /**
   *
   *
   * <pre>
   * Required. The acknowledgment ID for the messages being acknowledged that
   * was returned by the Pub/Sub system in the `Pull` response. Must not be
   * empty.
   * </pre>
   *
   * <code>repeated string ack_ids = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of ackIds.
   */
  int getAckIdsCount();
  /**
   *
   *
   * <pre>
   * Required. The acknowledgment ID for the messages being acknowledged that
   * was returned by the Pub/Sub system in the `Pull` response. Must not be
   * empty.
   * </pre>
   *
   * <code>repeated string ack_ids = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The ackIds at the given index.
   */
  java.lang.String getAckIds(int index);
  /**
   *
   *
   * <pre>
   * Required. The acknowledgment ID for the messages being acknowledged that
   * was returned by the Pub/Sub system in the `Pull` response. Must not be
   * empty.
   * </pre>
   *
   * <code>repeated string ack_ids = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the ackIds at the given index.
   */
  com.google.protobuf.ByteString getAckIdsBytes(int index);
}
