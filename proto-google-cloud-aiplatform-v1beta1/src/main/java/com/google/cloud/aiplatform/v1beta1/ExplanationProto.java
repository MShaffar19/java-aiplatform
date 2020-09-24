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
// source: google/cloud/aiplatform/v1beta1/explanation.proto

package com.google.cloud.aiplatform.v1beta1;

public final class ExplanationProto {
  private ExplanationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Explanation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Explanation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Attribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Attribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/aiplatform/v1beta1/explan"
          + "ation.proto\022\037google.cloud.aiplatform.v1b"
          + "eta1\032\037google/api/field_behavior.proto\032:g"
          + "oogle/cloud/aiplatform/v1beta1/explanati"
          + "on_metadata.proto\032\034google/protobuf/struc"
          + "t.proto\032\034google/api/annotations.proto\"V\n"
          + "\013Explanation\022G\n\014attributions\030\001 \003(\0132,.goo"
          + "gle.cloud.aiplatform.v1beta1.Attribution"
          + "B\003\340A\003\"`\n\020ModelExplanation\022L\n\021mean_attrib"
          + "utions\030\001 \003(\0132,.google.cloud.aiplatform.v"
          + "1beta1.AttributionB\003\340A\003\"\357\001\n\013Attribution\022"
          + "\"\n\025baseline_output_value\030\001 \001(\001B\003\340A\003\022\"\n\025i"
          + "nstance_output_value\030\002 \001(\001B\003\340A\003\0229\n\024featu"
          + "re_attributions\030\003 \001(\0132\026.google.protobuf."
          + "ValueB\003\340A\003\022\031\n\014output_index\030\004 \003(\005B\003\340A\003\022 \n"
          + "\023output_display_name\030\005 \001(\tB\003\340A\003\022 \n\023appro"
          + "ximation_error\030\006 \001(\001B\003\340A\003\"\257\001\n\017Explanatio"
          + "nSpec\022O\n\nparameters\030\001 \001(\01326.google.cloud"
          + ".aiplatform.v1beta1.ExplanationParameter"
          + "sB\003\340A\002\022K\n\010metadata\030\002 \001(\01324.google.cloud."
          + "aiplatform.v1beta1.ExplanationMetadataB\003"
          + "\340A\002\"x\n\025ExplanationParameters\022_\n\033sampled_"
          + "shapley_attribution\030\001 \001(\0132:.google.cloud"
          + ".aiplatform.v1beta1.SampledShapleyAttrib"
          + "ution\"4\n\031SampledShapleyAttribution\022\027\n\npa"
          + "th_count\030\001 \001(\005B\003\340A\002B\204\001\n#com.google.cloud"
          + ".aiplatform.v1beta1B\020ExplanationProtoP\001Z"
          + "Igoogle.golang.org/genproto/googleapis/c"
          + "loud/aiplatform/v1beta1;aiplatformb\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExplanationMetadataProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_Explanation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Explanation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Explanation_descriptor,
            new java.lang.String[] {
              "Attributions",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelExplanation_descriptor,
            new java.lang.String[] {
              "MeanAttributions",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Attribution_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_Attribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Attribution_descriptor,
            new java.lang.String[] {
              "BaselineOutputValue",
              "InstanceOutputValue",
              "FeatureAttributions",
              "OutputIndex",
              "OutputDisplayName",
              "ApproximationError",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplanationSpec_descriptor,
            new java.lang.String[] {
              "Parameters", "Metadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplanationParameters_descriptor,
            new java.lang.String[] {
              "SampledShapleyAttribution",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SampledShapleyAttribution_descriptor,
            new java.lang.String[] {
              "PathCount",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExplanationMetadataProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}