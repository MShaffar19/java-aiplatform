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
// source: google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_tables.proto

package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

public interface AutoMlTablesInputsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTablesInputs)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required when optimization_objective is "maximize-precision-at-recall".
   * Must be between 0 and 1, inclusive.
   * </pre>
   *
   * <code>float optimization_objective_recall_value = 5;</code>
   *
   * @return The optimizationObjectiveRecallValue.
   */
  float getOptimizationObjectiveRecallValue();

  /**
   *
   *
   * <pre>
   * Required when optimization_objective is "maximize-recall-at-precision".
   * Must be between 0 and 1, inclusive.
   * </pre>
   *
   * <code>float optimization_objective_precision_value = 6;</code>
   *
   * @return The optimizationObjectivePrecisionValue.
   */
  float getOptimizationObjectivePrecisionValue();

  /**
   *
   *
   * <pre>
   * The type of prediction the Model is to produce.
   *   "classification" - Predict one out of multiple target values is
   *                      picked for each row.
   *   "regression" - Predict a value based on its relation to other values.
   *                  This type is available only to columns that contain
   *                  semantically numeric values, i.e. integers or floating
   *                  point number, even if stored as e.g. strings.
   * </pre>
   *
   * <code>string prediction_type = 1;</code>
   *
   * @return The predictionType.
   */
  java.lang.String getPredictionType();
  /**
   *
   *
   * <pre>
   * The type of prediction the Model is to produce.
   *   "classification" - Predict one out of multiple target values is
   *                      picked for each row.
   *   "regression" - Predict a value based on its relation to other values.
   *                  This type is available only to columns that contain
   *                  semantically numeric values, i.e. integers or floating
   *                  point number, even if stored as e.g. strings.
   * </pre>
   *
   * <code>string prediction_type = 1;</code>
   *
   * @return The bytes for predictionType.
   */
  com.google.protobuf.ByteString getPredictionTypeBytes();

  /**
   *
   *
   * <pre>
   * The column name of the target column that the model is to predict.
   * </pre>
   *
   * <code>string target_column = 2;</code>
   *
   * @return The targetColumn.
   */
  java.lang.String getTargetColumn();
  /**
   *
   *
   * <pre>
   * The column name of the target column that the model is to predict.
   * </pre>
   *
   * <code>string target_column = 2;</code>
   *
   * @return The bytes for targetColumn.
   */
  com.google.protobuf.ByteString getTargetColumnBytes();

  /**
   *
   *
   * <pre>
   * Each transformation will apply transform function to given input column.
   * And the result will be used for training.
   * When creating transformation for BigQuery Struct column, the column should
   * be flattened using "." as the delimiter.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTablesInputs.Transformation transformations = 3;
   * </code>
   */
  java.util.List<
          com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTablesInputs
              .Transformation>
      getTransformationsList();
  /**
   *
   *
   * <pre>
   * Each transformation will apply transform function to given input column.
   * And the result will be used for training.
   * When creating transformation for BigQuery Struct column, the column should
   * be flattened using "." as the delimiter.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTablesInputs.Transformation transformations = 3;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTablesInputs
          .Transformation
      getTransformations(int index);
  /**
   *
   *
   * <pre>
   * Each transformation will apply transform function to given input column.
   * And the result will be used for training.
   * When creating transformation for BigQuery Struct column, the column should
   * be flattened using "." as the delimiter.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTablesInputs.Transformation transformations = 3;
   * </code>
   */
  int getTransformationsCount();
  /**
   *
   *
   * <pre>
   * Each transformation will apply transform function to given input column.
   * And the result will be used for training.
   * When creating transformation for BigQuery Struct column, the column should
   * be flattened using "." as the delimiter.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTablesInputs.Transformation transformations = 3;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTablesInputs
                  .TransformationOrBuilder>
      getTransformationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Each transformation will apply transform function to given input column.
   * And the result will be used for training.
   * When creating transformation for BigQuery Struct column, the column should
   * be flattened using "." as the delimiter.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTablesInputs.Transformation transformations = 3;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTablesInputs
          .TransformationOrBuilder
      getTransformationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Objective function the model is optimizing towards. The training process
   * creates a model that maximizes/minimizes the value of the objective
   * function over the validation set.
   * The supported optimization objectives depend on the prediction type.
   * If the field is not set, a default objective function is used.
   * classification (binary):
   *   "maximize-au-roc" (default) - Maximize the area under the receiver
   *                                 operating characteristic (ROC) curve.
   *   "minimize-log-loss" - Minimize log loss.
   *   "maximize-au-prc" - Maximize the area under the precision-recall curve.
   *   "maximize-precision-at-recall" - Maximize precision for a specified
   *                                   recall value.
   *   "maximize-recall-at-precision" - Maximize recall for a specified
   *                                    precision value.
   * classification (multi-class):
   *   "minimize-log-loss" (default) - Minimize log loss.
   * regression:
   *   "minimize-rmse" (default) - Minimize root-mean-squared error (RMSE).
   *   "minimize-mae" - Minimize mean-absolute error (MAE).
   *   "minimize-rmsle" - Minimize root-mean-squared log error (RMSLE).
   * </pre>
   *
   * <code>string optimization_objective = 4;</code>
   *
   * @return The optimizationObjective.
   */
  java.lang.String getOptimizationObjective();
  /**
   *
   *
   * <pre>
   * Objective function the model is optimizing towards. The training process
   * creates a model that maximizes/minimizes the value of the objective
   * function over the validation set.
   * The supported optimization objectives depend on the prediction type.
   * If the field is not set, a default objective function is used.
   * classification (binary):
   *   "maximize-au-roc" (default) - Maximize the area under the receiver
   *                                 operating characteristic (ROC) curve.
   *   "minimize-log-loss" - Minimize log loss.
   *   "maximize-au-prc" - Maximize the area under the precision-recall curve.
   *   "maximize-precision-at-recall" - Maximize precision for a specified
   *                                   recall value.
   *   "maximize-recall-at-precision" - Maximize recall for a specified
   *                                    precision value.
   * classification (multi-class):
   *   "minimize-log-loss" (default) - Minimize log loss.
   * regression:
   *   "minimize-rmse" (default) - Minimize root-mean-squared error (RMSE).
   *   "minimize-mae" - Minimize mean-absolute error (MAE).
   *   "minimize-rmsle" - Minimize root-mean-squared log error (RMSLE).
   * </pre>
   *
   * <code>string optimization_objective = 4;</code>
   *
   * @return The bytes for optimizationObjective.
   */
  com.google.protobuf.ByteString getOptimizationObjectiveBytes();

  /**
   *
   *
   * <pre>
   * Required. The train budget of creating this model, expressed in milli node
   * hours i.e. 1,000 value in this field means 1 node hour.
   * The training cost of the model will not exceed this budget. The final cost
   * will be attempted to be close to the budget, though may end up being (even)
   * noticeably smaller - at the backend's discretion. This especially may
   * happen when further model training ceases to provide any improvements.
   * If the budget is set to a value known to be insufficient to train a
   * model for the given dataset, the training won't be attempted and
   * will error.
   * The train budget must be between 1,000 and 72,000 milli node hours,
   * inclusive.
   * </pre>
   *
   * <code>int64 train_budget_milli_node_hours = 7;</code>
   *
   * @return The trainBudgetMilliNodeHours.
   */
  long getTrainBudgetMilliNodeHours();

  /**
   *
   *
   * <pre>
   * Use the entire training budget. This disables the early stopping feature.
   * By default, the early stopping feature is enabled, which means that AutoML
   * Tables might stop training before the entire training budget has been used.
   * </pre>
   *
   * <code>bool disable_early_stopping = 8;</code>
   *
   * @return The disableEarlyStopping.
   */
  boolean getDisableEarlyStopping();

  /**
   *
   *
   * <pre>
   * Column name that should be used as the weight column.
   * Higher values in this column give more importance to the row
   * during model training. The column must have numeric values between 0 and
   * 10000 inclusively; 0 means the row is ignored for training. If weight
   * column field is not set, then all rows are assumed to have equal weight
   * of 1.
   * </pre>
   *
   * <code>string weight_column_name = 9;</code>
   *
   * @return The weightColumnName.
   */
  java.lang.String getWeightColumnName();
  /**
   *
   *
   * <pre>
   * Column name that should be used as the weight column.
   * Higher values in this column give more importance to the row
   * during model training. The column must have numeric values between 0 and
   * 10000 inclusively; 0 means the row is ignored for training. If weight
   * column field is not set, then all rows are assumed to have equal weight
   * of 1.
   * </pre>
   *
   * <code>string weight_column_name = 9;</code>
   *
   * @return The bytes for weightColumnName.
   */
  com.google.protobuf.ByteString getWeightColumnNameBytes();

  /**
   *
   *
   * <pre>
   * Configuration for exporting test set predictions to a BigQuery table. If
   * this configuration is absent, then the export is not performed.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig export_evaluated_data_items_config = 10;
   * </code>
   *
   * @return Whether the exportEvaluatedDataItemsConfig field is set.
   */
  boolean hasExportEvaluatedDataItemsConfig();
  /**
   *
   *
   * <pre>
   * Configuration for exporting test set predictions to a BigQuery table. If
   * this configuration is absent, then the export is not performed.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig export_evaluated_data_items_config = 10;
   * </code>
   *
   * @return The exportEvaluatedDataItemsConfig.
   */
  com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig
      getExportEvaluatedDataItemsConfig();
  /**
   *
   *
   * <pre>
   * Configuration for exporting test set predictions to a BigQuery table. If
   * this configuration is absent, then the export is not performed.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig export_evaluated_data_items_config = 10;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .ExportEvaluatedDataItemsConfigOrBuilder
      getExportEvaluatedDataItemsConfigOrBuilder();

  public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTablesInputs
          .AdditionalOptimizationObjectiveConfigCase
      getAdditionalOptimizationObjectiveConfigCase();
}