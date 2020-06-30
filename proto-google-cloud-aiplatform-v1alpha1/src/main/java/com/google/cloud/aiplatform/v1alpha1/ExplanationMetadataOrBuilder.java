/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/aiplatform/v1alpha1/explanation_metadata.proto

package com.google.cloud.aiplatform.v1alpha1;

public interface ExplanationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1alpha1.ExplanationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Map from feature names to feature input metadata. Keys are the name of the
   * features. Values are the specification of the feature.
   * An empty InputMetadata is valid. It describes a text feature which has the
   * name specified as the key in [ExplanationMetadata.inputs][google.cloud.aiplatform.v1alpha1.ExplanationMetadata.inputs]. The baseline
   * of the empty feature is chosen by AI Platform.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1alpha1.ExplanationMetadata.InputMetadata&gt; inputs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getInputsCount();
  /**
   *
   *
   * <pre>
   * Required. Map from feature names to feature input metadata. Keys are the name of the
   * features. Values are the specification of the feature.
   * An empty InputMetadata is valid. It describes a text feature which has the
   * name specified as the key in [ExplanationMetadata.inputs][google.cloud.aiplatform.v1alpha1.ExplanationMetadata.inputs]. The baseline
   * of the empty feature is chosen by AI Platform.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1alpha1.ExplanationMetadata.InputMetadata&gt; inputs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean containsInputs(java.lang.String key);
  /** Use {@link #getInputsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String, com.google.cloud.aiplatform.v1alpha1.ExplanationMetadata.InputMetadata>
      getInputs();
  /**
   *
   *
   * <pre>
   * Required. Map from feature names to feature input metadata. Keys are the name of the
   * features. Values are the specification of the feature.
   * An empty InputMetadata is valid. It describes a text feature which has the
   * name specified as the key in [ExplanationMetadata.inputs][google.cloud.aiplatform.v1alpha1.ExplanationMetadata.inputs]. The baseline
   * of the empty feature is chosen by AI Platform.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1alpha1.ExplanationMetadata.InputMetadata&gt; inputs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.Map<
          java.lang.String, com.google.cloud.aiplatform.v1alpha1.ExplanationMetadata.InputMetadata>
      getInputsMap();
  /**
   *
   *
   * <pre>
   * Required. Map from feature names to feature input metadata. Keys are the name of the
   * features. Values are the specification of the feature.
   * An empty InputMetadata is valid. It describes a text feature which has the
   * name specified as the key in [ExplanationMetadata.inputs][google.cloud.aiplatform.v1alpha1.ExplanationMetadata.inputs]. The baseline
   * of the empty feature is chosen by AI Platform.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1alpha1.ExplanationMetadata.InputMetadata&gt; inputs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1alpha1.ExplanationMetadata.InputMetadata getInputsOrDefault(
      java.lang.String key,
      com.google.cloud.aiplatform.v1alpha1.ExplanationMetadata.InputMetadata defaultValue);
  /**
   *
   *
   * <pre>
   * Required. Map from feature names to feature input metadata. Keys are the name of the
   * features. Values are the specification of the feature.
   * An empty InputMetadata is valid. It describes a text feature which has the
   * name specified as the key in [ExplanationMetadata.inputs][google.cloud.aiplatform.v1alpha1.ExplanationMetadata.inputs]. The baseline
   * of the empty feature is chosen by AI Platform.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1alpha1.ExplanationMetadata.InputMetadata&gt; inputs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1alpha1.ExplanationMetadata.InputMetadata getInputsOrThrow(
      java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. Map from output names to output metadata.
   * Keys are the name of the output field in the prediction to be explained.
   * Currently only one key is allowed.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1alpha1.ExplanationMetadata.OutputMetadata&gt; outputs = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getOutputsCount();
  /**
   *
   *
   * <pre>
   * Required. Map from output names to output metadata.
   * Keys are the name of the output field in the prediction to be explained.
   * Currently only one key is allowed.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1alpha1.ExplanationMetadata.OutputMetadata&gt; outputs = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean containsOutputs(java.lang.String key);
  /** Use {@link #getOutputsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String, com.google.cloud.aiplatform.v1alpha1.ExplanationMetadata.OutputMetadata>
      getOutputs();
  /**
   *
   *
   * <pre>
   * Required. Map from output names to output metadata.
   * Keys are the name of the output field in the prediction to be explained.
   * Currently only one key is allowed.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1alpha1.ExplanationMetadata.OutputMetadata&gt; outputs = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.Map<
          java.lang.String, com.google.cloud.aiplatform.v1alpha1.ExplanationMetadata.OutputMetadata>
      getOutputsMap();
  /**
   *
   *
   * <pre>
   * Required. Map from output names to output metadata.
   * Keys are the name of the output field in the prediction to be explained.
   * Currently only one key is allowed.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1alpha1.ExplanationMetadata.OutputMetadata&gt; outputs = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1alpha1.ExplanationMetadata.OutputMetadata getOutputsOrDefault(
      java.lang.String key,
      com.google.cloud.aiplatform.v1alpha1.ExplanationMetadata.OutputMetadata defaultValue);
  /**
   *
   *
   * <pre>
   * Required. Map from output names to output metadata.
   * Keys are the name of the output field in the prediction to be explained.
   * Currently only one key is allowed.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1alpha1.ExplanationMetadata.OutputMetadata&gt; outputs = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1alpha1.ExplanationMetadata.OutputMetadata getOutputsOrThrow(
      java.lang.String key);

  /**
   *
   *
   * <pre>
   * Points to a YAML file stored on Google Cloud Storage describing the format
   * of the [feature attributions][Attributions.feature_attributions].
   * The schema is defined as an OpenAPI 3.0.2 [Schema Object](
   * https:
   * //github.com/OAI/OpenAPI-Specification/b
   * // lob/master/versions/3.0.2.md#schema-object)
   * AutoML Tables Models always have this field populated by AI Platform.
   * Note: The URI given on output may be different, including the URI scheme,
   * than the one given on input. The output URI will point to a location where
   * the user only has a read access.
   * </pre>
   *
   * <code>string feature_attributions_schema_uri = 3;</code>
   *
   * @return The featureAttributionsSchemaUri.
   */
  java.lang.String getFeatureAttributionsSchemaUri();
  /**
   *
   *
   * <pre>
   * Points to a YAML file stored on Google Cloud Storage describing the format
   * of the [feature attributions][Attributions.feature_attributions].
   * The schema is defined as an OpenAPI 3.0.2 [Schema Object](
   * https:
   * //github.com/OAI/OpenAPI-Specification/b
   * // lob/master/versions/3.0.2.md#schema-object)
   * AutoML Tables Models always have this field populated by AI Platform.
   * Note: The URI given on output may be different, including the URI scheme,
   * than the one given on input. The output URI will point to a location where
   * the user only has a read access.
   * </pre>
   *
   * <code>string feature_attributions_schema_uri = 3;</code>
   *
   * @return The bytes for featureAttributionsSchemaUri.
   */
  com.google.protobuf.ByteString getFeatureAttributionsSchemaUriBytes();
}