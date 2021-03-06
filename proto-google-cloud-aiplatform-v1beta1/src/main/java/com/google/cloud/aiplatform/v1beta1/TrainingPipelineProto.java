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
// source: google/cloud/aiplatform/v1beta1/training_pipeline.proto

package com.google.cloud.aiplatform.v1beta1;

public final class TrainingPipelineProto {
  private TrainingPipelineProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_InputDataConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_InputDataConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FractionSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FractionSplit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FilterSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FilterSplit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PredefinedSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PredefinedSplit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_TimestampSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_TimestampSplit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/aiplatform/v1beta1/traini"
          + "ng_pipeline.proto\022\037google.cloud.aiplatfo"
          + "rm.v1beta1\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\032(google/c"
          + "loud/aiplatform/v1beta1/io.proto\0327google"
          + "/cloud/aiplatform/v1beta1/machine_resour"
          + "ces.proto\032Dgoogle/cloud/aiplatform/v1bet"
          + "a1/manual_batch_tuning_parameters.proto\032"
          + "+google/cloud/aiplatform/v1beta1/model.p"
          + "roto\0324google/cloud/aiplatform/v1beta1/pi"
          + "peline_state.proto\032\034google/protobuf/stru"
          + "ct.proto\032\037google/protobuf/timestamp.prot"
          + "o\032\027google/rpc/status.proto\032\034google/api/a"
          + "nnotations.proto\"\253\007\n\020TrainingPipeline\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003"
          + "\340A\002\022K\n\021input_data_config\030\003 \001(\01320.google."
          + "cloud.aiplatform.v1beta1.InputDataConfig"
          + "\022%\n\030training_task_definition\030\004 \001(\tB\003\340A\002\022"
          + "9\n\024training_task_inputs\030\005 \001(\0132\026.google.p"
          + "rotobuf.ValueB\003\340A\002\022;\n\026training_task_meta"
          + "data\030\006 \001(\0132\026.google.protobuf.ValueB\003\340A\003\022"
          + "?\n\017model_to_upload\030\007 \001(\0132&.google.cloud."
          + "aiplatform.v1beta1.Model\022B\n\005state\030\t \001(\0162"
          + "..google.cloud.aiplatform.v1beta1.Pipeli"
          + "neStateB\003\340A\003\022&\n\005error\030\n \001(\0132\022.google.rpc"
          + ".StatusB\003\340A\003\0224\n\013create_time\030\013 \001(\0132\032.goog"
          + "le.protobuf.TimestampB\003\340A\003\0223\n\nstart_time"
          + "\030\014 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022"
          + "1\n\010end_time\030\r \001(\0132\032.google.protobuf.Time"
          + "stampB\003\340A\003\0224\n\013update_time\030\016 \001(\0132\032.google"
          + ".protobuf.TimestampB\003\340A\003\022M\n\006labels\030\017 \003(\013"
          + "2=.google.cloud.aiplatform.v1beta1.Train"
          + "ingPipeline.LabelsEntry\032-\n\013LabelsEntry\022\013"
          + "\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:~\352A{\n*aip"
          + "latform.googleapis.com/TrainingPipeline\022"
          + "Mprojects/{project}/locations/{location}"
          + "/trainingPipelines/{training_pipeline}\"\311"
          + "\004\n\017InputDataConfig\022H\n\016fraction_split\030\002 \001"
          + "(\0132..google.cloud.aiplatform.v1beta1.Fra"
          + "ctionSplitH\000\022D\n\014filter_split\030\003 \001(\0132,.goo"
          + "gle.cloud.aiplatform.v1beta1.FilterSplit"
          + "H\000\022L\n\020predefined_split\030\004 \001(\01320.google.cl"
          + "oud.aiplatform.v1beta1.PredefinedSplitH\000"
          + "\022J\n\017timestamp_split\030\005 \001(\0132/.google.cloud"
          + ".aiplatform.v1beta1.TimestampSplitH\000\022J\n\017"
          + "gcs_destination\030\010 \001(\0132/.google.cloud.aip"
          + "latform.v1beta1.GcsDestinationH\001\022T\n\024bigq"
          + "uery_destination\030\n \001(\01324.google.cloud.ai"
          + "platform.v1beta1.BigQueryDestinationH\001\022\027"
          + "\n\ndataset_id\030\001 \001(\tB\003\340A\002\022\032\n\022annotations_f"
          + "ilter\030\006 \001(\t\022\035\n\025annotation_schema_uri\030\t \001"
          + "(\tB\007\n\005splitB\r\n\013destination\"^\n\rFractionSp"
          + "lit\022\031\n\021training_fraction\030\001 \001(\001\022\033\n\023valida"
          + "tion_fraction\030\002 \001(\001\022\025\n\rtest_fraction\030\003 \001"
          + "(\001\"e\n\013FilterSplit\022\034\n\017training_filter\030\001 \001"
          + "(\tB\003\340A\002\022\036\n\021validation_filter\030\002 \001(\tB\003\340A\002\022"
          + "\030\n\013test_filter\030\003 \001(\tB\003\340A\002\"#\n\017PredefinedS"
          + "plit\022\020\n\003key\030\001 \001(\tB\003\340A\002\"q\n\016TimestampSplit"
          + "\022\031\n\021training_fraction\030\001 \001(\001\022\033\n\023validatio"
          + "n_fraction\030\002 \001(\001\022\025\n\rtest_fraction\030\003 \001(\001\022"
          + "\020\n\003key\030\004 \001(\tB\003\340A\002B\211\001\n#com.google.cloud.a"
          + "iplatform.v1beta1B\025TrainingPipelineProto"
          + "P\001ZIgoogle.golang.org/genproto/googleapi"
          + "s/cloud/aiplatform/v1beta1;aiplatformb\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParametersProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ModelProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.PipelineStateProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "InputDataConfig",
              "TrainingTaskDefinition",
              "TrainingTaskInputs",
              "TrainingTaskMetadata",
              "ModelToUpload",
              "State",
              "Error",
              "CreateTime",
              "StartTime",
              "EndTime",
              "UpdateTime",
              "Labels",
            });
    internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_TrainingPipeline_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_InputDataConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_InputDataConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_InputDataConfig_descriptor,
            new java.lang.String[] {
              "FractionSplit",
              "FilterSplit",
              "PredefinedSplit",
              "TimestampSplit",
              "GcsDestination",
              "BigqueryDestination",
              "DatasetId",
              "AnnotationsFilter",
              "AnnotationSchemaUri",
              "Split",
              "Destination",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FractionSplit_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_FractionSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FractionSplit_descriptor,
            new java.lang.String[] {
              "TrainingFraction", "ValidationFraction", "TestFraction",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FilterSplit_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_FilterSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FilterSplit_descriptor,
            new java.lang.String[] {
              "TrainingFilter", "ValidationFilter", "TestFilter",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PredefinedSplit_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_PredefinedSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PredefinedSplit_descriptor,
            new java.lang.String[] {
              "Key",
            });
    internal_static_google_cloud_aiplatform_v1beta1_TimestampSplit_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_TimestampSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_TimestampSplit_descriptor,
            new java.lang.String[] {
              "TrainingFraction", "ValidationFraction", "TestFraction", "Key",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParametersProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ModelProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.PipelineStateProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
