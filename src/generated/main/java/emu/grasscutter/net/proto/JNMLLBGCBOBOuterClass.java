// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JNMLLBGCBOB.proto

package emu.grasscutter.net.proto;

public final class JNMLLBGCBOBOuterClass {
  private JNMLLBGCBOBOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JNMLLBGCBOBOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JNMLLBGCBOB)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
     */
    java.util.List<emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB> 
        getLevelInfoListList();
    /**
     * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
     */
    emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB getLevelInfoList(int index);
    /**
     * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
     */
    int getLevelInfoListCount();
    /**
     * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMBOrBuilder> 
        getLevelInfoListOrBuilderList();
    /**
     * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
     */
    emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMBOrBuilder getLevelInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Name: JNMLLBGCBOB
   * </pre>
   *
   * Protobuf type {@code JNMLLBGCBOB}
   */
  public static final class JNMLLBGCBOB extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:JNMLLBGCBOB)
      JNMLLBGCBOBOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JNMLLBGCBOB.newBuilder() to construct.
    private JNMLLBGCBOB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JNMLLBGCBOB() {
      levelInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new JNMLLBGCBOB();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private JNMLLBGCBOB(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                levelInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB>();
                mutable_bitField0_ |= 0x00000001;
              }
              levelInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          levelInfoList_ = java.util.Collections.unmodifiableList(levelInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.internal_static_JNMLLBGCBOB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.internal_static_JNMLLBGCBOB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB.class, emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB.Builder.class);
    }

    public static final int LEVEL_INFO_LIST_FIELD_NUMBER = 4;
    private java.util.List<emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB> levelInfoList_;
    /**
     * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB> getLevelInfoListList() {
      return levelInfoList_;
    }
    /**
     * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMBOrBuilder> 
        getLevelInfoListOrBuilderList() {
      return levelInfoList_;
    }
    /**
     * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
     */
    @java.lang.Override
    public int getLevelInfoListCount() {
      return levelInfoList_.size();
    }
    /**
     * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB getLevelInfoList(int index) {
      return levelInfoList_.get(index);
    }
    /**
     * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMBOrBuilder getLevelInfoListOrBuilder(
        int index) {
      return levelInfoList_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < levelInfoList_.size(); i++) {
        output.writeMessage(4, levelInfoList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < levelInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, levelInfoList_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB other = (emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB) obj;

      if (!getLevelInfoListList()
          .equals(other.getLevelInfoListList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getLevelInfoListCount() > 0) {
        hash = (37 * hash) + LEVEL_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getLevelInfoListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Name: JNMLLBGCBOB
     * </pre>
     *
     * Protobuf type {@code JNMLLBGCBOB}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JNMLLBGCBOB)
        emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOBOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.internal_static_JNMLLBGCBOB_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.internal_static_JNMLLBGCBOB_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB.class, emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getLevelInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (levelInfoListBuilder_ == null) {
          levelInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          levelInfoListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.internal_static_JNMLLBGCBOB_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB build() {
        emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB buildPartial() {
        emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB result = new emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB(this);
        int from_bitField0_ = bitField0_;
        if (levelInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            levelInfoList_ = java.util.Collections.unmodifiableList(levelInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.levelInfoList_ = levelInfoList_;
        } else {
          result.levelInfoList_ = levelInfoListBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB) {
          return mergeFrom((emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB other) {
        if (other == emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB.getDefaultInstance()) return this;
        if (levelInfoListBuilder_ == null) {
          if (!other.levelInfoList_.isEmpty()) {
            if (levelInfoList_.isEmpty()) {
              levelInfoList_ = other.levelInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureLevelInfoListIsMutable();
              levelInfoList_.addAll(other.levelInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.levelInfoList_.isEmpty()) {
            if (levelInfoListBuilder_.isEmpty()) {
              levelInfoListBuilder_.dispose();
              levelInfoListBuilder_ = null;
              levelInfoList_ = other.levelInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              levelInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLevelInfoListFieldBuilder() : null;
            } else {
              levelInfoListBuilder_.addAllMessages(other.levelInfoList_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB> levelInfoList_ =
        java.util.Collections.emptyList();
      private void ensureLevelInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          levelInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB>(levelInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB, emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB.Builder, emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMBOrBuilder> levelInfoListBuilder_;

      /**
       * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB> getLevelInfoListList() {
        if (levelInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(levelInfoList_);
        } else {
          return levelInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
       */
      public int getLevelInfoListCount() {
        if (levelInfoListBuilder_ == null) {
          return levelInfoList_.size();
        } else {
          return levelInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
       */
      public emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB getLevelInfoList(int index) {
        if (levelInfoListBuilder_ == null) {
          return levelInfoList_.get(index);
        } else {
          return levelInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
       */
      public Builder setLevelInfoList(
          int index, emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB value) {
        if (levelInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLevelInfoListIsMutable();
          levelInfoList_.set(index, value);
          onChanged();
        } else {
          levelInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
       */
      public Builder setLevelInfoList(
          int index, emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB.Builder builderForValue) {
        if (levelInfoListBuilder_ == null) {
          ensureLevelInfoListIsMutable();
          levelInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          levelInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
       */
      public Builder addLevelInfoList(emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB value) {
        if (levelInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLevelInfoListIsMutable();
          levelInfoList_.add(value);
          onChanged();
        } else {
          levelInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
       */
      public Builder addLevelInfoList(
          int index, emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB value) {
        if (levelInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLevelInfoListIsMutable();
          levelInfoList_.add(index, value);
          onChanged();
        } else {
          levelInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
       */
      public Builder addLevelInfoList(
          emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB.Builder builderForValue) {
        if (levelInfoListBuilder_ == null) {
          ensureLevelInfoListIsMutable();
          levelInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          levelInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
       */
      public Builder addLevelInfoList(
          int index, emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB.Builder builderForValue) {
        if (levelInfoListBuilder_ == null) {
          ensureLevelInfoListIsMutable();
          levelInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          levelInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
       */
      public Builder addAllLevelInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB> values) {
        if (levelInfoListBuilder_ == null) {
          ensureLevelInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, levelInfoList_);
          onChanged();
        } else {
          levelInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
       */
      public Builder clearLevelInfoList() {
        if (levelInfoListBuilder_ == null) {
          levelInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          levelInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
       */
      public Builder removeLevelInfoList(int index) {
        if (levelInfoListBuilder_ == null) {
          ensureLevelInfoListIsMutable();
          levelInfoList_.remove(index);
          onChanged();
        } else {
          levelInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
       */
      public emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB.Builder getLevelInfoListBuilder(
          int index) {
        return getLevelInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
       */
      public emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMBOrBuilder getLevelInfoListOrBuilder(
          int index) {
        if (levelInfoListBuilder_ == null) {
          return levelInfoList_.get(index);  } else {
          return levelInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMBOrBuilder> 
           getLevelInfoListOrBuilderList() {
        if (levelInfoListBuilder_ != null) {
          return levelInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(levelInfoList_);
        }
      }
      /**
       * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
       */
      public emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB.Builder addLevelInfoListBuilder() {
        return getLevelInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB.getDefaultInstance());
      }
      /**
       * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
       */
      public emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB.Builder addLevelInfoListBuilder(
          int index) {
        return getLevelInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB.getDefaultInstance());
      }
      /**
       * <code>repeated .CKMJBOGJFMB level_info_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB.Builder> 
           getLevelInfoListBuilderList() {
        return getLevelInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB, emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB.Builder, emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMBOrBuilder> 
          getLevelInfoListFieldBuilder() {
        if (levelInfoListBuilder_ == null) {
          levelInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB, emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB.Builder, emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMBOrBuilder>(
                  levelInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          levelInfoList_ = null;
        }
        return levelInfoListBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:JNMLLBGCBOB)
    }

    // @@protoc_insertion_point(class_scope:JNMLLBGCBOB)
    private static final emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB();
    }

    public static emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JNMLLBGCBOB>
        PARSER = new com.google.protobuf.AbstractParser<JNMLLBGCBOB>() {
      @java.lang.Override
      public JNMLLBGCBOB parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JNMLLBGCBOB(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<JNMLLBGCBOB> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JNMLLBGCBOB> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.JNMLLBGCBOBOuterClass.JNMLLBGCBOB getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JNMLLBGCBOB_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JNMLLBGCBOB_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021JNMLLBGCBOB.proto\032\021CKMJBOGJFMB.proto\"4" +
      "\n\013JNMLLBGCBOB\022%\n\017level_info_list\030\004 \003(\0132\014" +
      ".CKMJBOGJFMBB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.getDescriptor(),
        });
    internal_static_JNMLLBGCBOB_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JNMLLBGCBOB_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JNMLLBGCBOB_descriptor,
        new java.lang.String[] { "LevelInfoList", });
    emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
