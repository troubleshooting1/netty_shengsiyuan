// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

package com.inspur.grpc.proto;

public interface StudentResponseListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc_proto.StudentResponseList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .grpc_proto.StudentResponse studentResponse = 1;</code>
   */
  java.util.List<com.inspur.grpc.proto.StudentResponse> 
      getStudentResponseList();
  /**
   * <code>repeated .grpc_proto.StudentResponse studentResponse = 1;</code>
   */
  com.inspur.grpc.proto.StudentResponse getStudentResponse(int index);
  /**
   * <code>repeated .grpc_proto.StudentResponse studentResponse = 1;</code>
   */
  int getStudentResponseCount();
  /**
   * <code>repeated .grpc_proto.StudentResponse studentResponse = 1;</code>
   */
  java.util.List<? extends com.inspur.grpc.proto.StudentResponseOrBuilder> 
      getStudentResponseOrBuilderList();
  /**
   * <code>repeated .grpc_proto.StudentResponse studentResponse = 1;</code>
   */
  com.inspur.grpc.proto.StudentResponseOrBuilder getStudentResponseOrBuilder(
      int index);
}