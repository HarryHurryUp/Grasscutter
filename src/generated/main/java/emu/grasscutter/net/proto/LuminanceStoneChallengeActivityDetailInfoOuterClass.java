// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LuminanceStoneChallengeActivityDetailInfo.proto

package emu.grasscutter.net.proto;

public final class LuminanceStoneChallengeActivityDetailInfoOuterClass {
  private LuminanceStoneChallengeActivityDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LuminanceStoneChallengeActivityDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LuminanceStoneChallengeActivityDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 current_stage_id = 1;</code>
     * @return The currentStageId.
     */
    int getCurrentStageId();

    /**
     * <code>uint32 best_score = 6;</code>
     * @return The bestScore.
     */
    int getBestScore();

    /**
     * <code>bool is_content_closed = 13;</code>
     * @return The isContentClosed.
     */
    boolean getIsContentClosed();

    /**
     * <code>bool is_final_gallery_complete = 9;</code>
     * @return The isFinalGalleryComplete.
     */
    boolean getIsFinalGalleryComplete();
  }
  /**
   * <pre>
   * Name: OLKDJDOFGHH
   * </pre>
   *
   * Protobuf type {@code LuminanceStoneChallengeActivityDetailInfo}
   */
  public static final class LuminanceStoneChallengeActivityDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LuminanceStoneChallengeActivityDetailInfo)
      LuminanceStoneChallengeActivityDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LuminanceStoneChallengeActivityDetailInfo.newBuilder() to construct.
    private LuminanceStoneChallengeActivityDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LuminanceStoneChallengeActivityDetailInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LuminanceStoneChallengeActivityDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LuminanceStoneChallengeActivityDetailInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              currentStageId_ = input.readUInt32();
              break;
            }
            case 48: {

              bestScore_ = input.readUInt32();
              break;
            }
            case 72: {

              isFinalGalleryComplete_ = input.readBool();
              break;
            }
            case 104: {

              isContentClosed_ = input.readBool();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.internal_static_LuminanceStoneChallengeActivityDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.internal_static_LuminanceStoneChallengeActivityDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo.class, emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo.Builder.class);
    }

    public static final int CURRENT_STAGE_ID_FIELD_NUMBER = 1;
    private int currentStageId_;
    /**
     * <code>uint32 current_stage_id = 1;</code>
     * @return The currentStageId.
     */
    @java.lang.Override
    public int getCurrentStageId() {
      return currentStageId_;
    }

    public static final int BEST_SCORE_FIELD_NUMBER = 6;
    private int bestScore_;
    /**
     * <code>uint32 best_score = 6;</code>
     * @return The bestScore.
     */
    @java.lang.Override
    public int getBestScore() {
      return bestScore_;
    }

    public static final int IS_CONTENT_CLOSED_FIELD_NUMBER = 13;
    private boolean isContentClosed_;
    /**
     * <code>bool is_content_closed = 13;</code>
     * @return The isContentClosed.
     */
    @java.lang.Override
    public boolean getIsContentClosed() {
      return isContentClosed_;
    }

    public static final int IS_FINAL_GALLERY_COMPLETE_FIELD_NUMBER = 9;
    private boolean isFinalGalleryComplete_;
    /**
     * <code>bool is_final_gallery_complete = 9;</code>
     * @return The isFinalGalleryComplete.
     */
    @java.lang.Override
    public boolean getIsFinalGalleryComplete() {
      return isFinalGalleryComplete_;
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
      if (currentStageId_ != 0) {
        output.writeUInt32(1, currentStageId_);
      }
      if (bestScore_ != 0) {
        output.writeUInt32(6, bestScore_);
      }
      if (isFinalGalleryComplete_ != false) {
        output.writeBool(9, isFinalGalleryComplete_);
      }
      if (isContentClosed_ != false) {
        output.writeBool(13, isContentClosed_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (currentStageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, currentStageId_);
      }
      if (bestScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, bestScore_);
      }
      if (isFinalGalleryComplete_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isFinalGalleryComplete_);
      }
      if (isContentClosed_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isContentClosed_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo other = (emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo) obj;

      if (getCurrentStageId()
          != other.getCurrentStageId()) return false;
      if (getBestScore()
          != other.getBestScore()) return false;
      if (getIsContentClosed()
          != other.getIsContentClosed()) return false;
      if (getIsFinalGalleryComplete()
          != other.getIsFinalGalleryComplete()) return false;
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
      hash = (37 * hash) + CURRENT_STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCurrentStageId();
      hash = (37 * hash) + BEST_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getBestScore();
      hash = (37 * hash) + IS_CONTENT_CLOSED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsContentClosed());
      hash = (37 * hash) + IS_FINAL_GALLERY_COMPLETE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinalGalleryComplete());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo prototype) {
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
     * Name: OLKDJDOFGHH
     * </pre>
     *
     * Protobuf type {@code LuminanceStoneChallengeActivityDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LuminanceStoneChallengeActivityDetailInfo)
        emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.internal_static_LuminanceStoneChallengeActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.internal_static_LuminanceStoneChallengeActivityDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo.class, emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        currentStageId_ = 0;

        bestScore_ = 0;

        isContentClosed_ = false;

        isFinalGalleryComplete_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.internal_static_LuminanceStoneChallengeActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo build() {
        emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo buildPartial() {
        emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo result = new emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo(this);
        result.currentStageId_ = currentStageId_;
        result.bestScore_ = bestScore_;
        result.isContentClosed_ = isContentClosed_;
        result.isFinalGalleryComplete_ = isFinalGalleryComplete_;
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
        if (other instanceof emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo) {
          return mergeFrom((emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo other) {
        if (other == emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo.getDefaultInstance()) return this;
        if (other.getCurrentStageId() != 0) {
          setCurrentStageId(other.getCurrentStageId());
        }
        if (other.getBestScore() != 0) {
          setBestScore(other.getBestScore());
        }
        if (other.getIsContentClosed() != false) {
          setIsContentClosed(other.getIsContentClosed());
        }
        if (other.getIsFinalGalleryComplete() != false) {
          setIsFinalGalleryComplete(other.getIsFinalGalleryComplete());
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
        emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int currentStageId_ ;
      /**
       * <code>uint32 current_stage_id = 1;</code>
       * @return The currentStageId.
       */
      @java.lang.Override
      public int getCurrentStageId() {
        return currentStageId_;
      }
      /**
       * <code>uint32 current_stage_id = 1;</code>
       * @param value The currentStageId to set.
       * @return This builder for chaining.
       */
      public Builder setCurrentStageId(int value) {
        
        currentStageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 current_stage_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurrentStageId() {
        
        currentStageId_ = 0;
        onChanged();
        return this;
      }

      private int bestScore_ ;
      /**
       * <code>uint32 best_score = 6;</code>
       * @return The bestScore.
       */
      @java.lang.Override
      public int getBestScore() {
        return bestScore_;
      }
      /**
       * <code>uint32 best_score = 6;</code>
       * @param value The bestScore to set.
       * @return This builder for chaining.
       */
      public Builder setBestScore(int value) {
        
        bestScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 best_score = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearBestScore() {
        
        bestScore_ = 0;
        onChanged();
        return this;
      }

      private boolean isContentClosed_ ;
      /**
       * <code>bool is_content_closed = 13;</code>
       * @return The isContentClosed.
       */
      @java.lang.Override
      public boolean getIsContentClosed() {
        return isContentClosed_;
      }
      /**
       * <code>bool is_content_closed = 13;</code>
       * @param value The isContentClosed to set.
       * @return This builder for chaining.
       */
      public Builder setIsContentClosed(boolean value) {
        
        isContentClosed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_content_closed = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsContentClosed() {
        
        isContentClosed_ = false;
        onChanged();
        return this;
      }

      private boolean isFinalGalleryComplete_ ;
      /**
       * <code>bool is_final_gallery_complete = 9;</code>
       * @return The isFinalGalleryComplete.
       */
      @java.lang.Override
      public boolean getIsFinalGalleryComplete() {
        return isFinalGalleryComplete_;
      }
      /**
       * <code>bool is_final_gallery_complete = 9;</code>
       * @param value The isFinalGalleryComplete to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinalGalleryComplete(boolean value) {
        
        isFinalGalleryComplete_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_final_gallery_complete = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinalGalleryComplete() {
        
        isFinalGalleryComplete_ = false;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:LuminanceStoneChallengeActivityDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:LuminanceStoneChallengeActivityDetailInfo)
    private static final emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo();
    }

    public static emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LuminanceStoneChallengeActivityDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<LuminanceStoneChallengeActivityDetailInfo>() {
      @java.lang.Override
      public LuminanceStoneChallengeActivityDetailInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LuminanceStoneChallengeActivityDetailInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LuminanceStoneChallengeActivityDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LuminanceStoneChallengeActivityDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LuminanceStoneChallengeActivityDetailInfoOuterClass.LuminanceStoneChallengeActivityDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LuminanceStoneChallengeActivityDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LuminanceStoneChallengeActivityDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/LuminanceStoneChallengeActivityDetailI" +
      "nfo.proto\"\227\001\n)LuminanceStoneChallengeAct" +
      "ivityDetailInfo\022\030\n\020current_stage_id\030\001 \001(" +
      "\r\022\022\n\nbest_score\030\006 \001(\r\022\031\n\021is_content_clos" +
      "ed\030\r \001(\010\022!\n\031is_final_gallery_complete\030\t " +
      "\001(\010B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LuminanceStoneChallengeActivityDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LuminanceStoneChallengeActivityDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LuminanceStoneChallengeActivityDetailInfo_descriptor,
        new java.lang.String[] { "CurrentStageId", "BestScore", "IsContentClosed", "IsFinalGalleryComplete", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
