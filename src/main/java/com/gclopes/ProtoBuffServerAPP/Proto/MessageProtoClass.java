// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package com.gclopes.ProtoBuffServerAPP.Proto;

public final class MessageProtoClass {
  private MessageProtoClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gclopes_message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gclopes_message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmessage.proto\022\007gclopes\"\034\n\007message\022\021\n\tm" +
      "sgToSend\030\001 \002(\tB;\n$com.gclopes.ProtoBuffS" +
      "erverAPP.ProtoB\021MessageProtoClassP\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_gclopes_message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gclopes_message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gclopes_message_descriptor,
        new java.lang.String[] { "MsgToSend", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
