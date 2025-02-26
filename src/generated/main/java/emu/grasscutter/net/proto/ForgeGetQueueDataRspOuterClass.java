// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ForgeGetQueueDataRsp.proto

package emu.grasscutter.net.proto;

public final class ForgeGetQueueDataRspOuterClass {
  private ForgeGetQueueDataRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ForgeGetQueueDataRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ForgeGetQueueDataRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 max_queue_num = 14;</code>
     * @return The maxQueueNum.
     */
    int getMaxQueueNum();

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 8;</code>
     */
    int getForgeQueueMapCount();
    /**
     * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 8;</code>
     */
    boolean containsForgeQueueMap(
        int key);
    /**
     * Use {@link #getForgeQueueMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData>
    getForgeQueueMap();
    /**
     * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 8;</code>
     */
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData>
    getForgeQueueMapMap();
    /**
     * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 8;</code>
     */

    emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrDefault(
        int key,
        emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData defaultValue);
    /**
     * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 8;</code>
     */

    emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * CmdId: 643
   * Name: NDJNIINPNCE
   * </pre>
   *
   * Protobuf type {@code ForgeGetQueueDataRsp}
   */
  public static final class ForgeGetQueueDataRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ForgeGetQueueDataRsp)
      ForgeGetQueueDataRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ForgeGetQueueDataRsp.newBuilder() to construct.
    private ForgeGetQueueDataRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ForgeGetQueueDataRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ForgeGetQueueDataRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ForgeGetQueueDataRsp(
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
            case 40: {

              retcode_ = input.readInt32();
              break;
            }
            case 66: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                forgeQueueMap_ = com.google.protobuf.MapField.newMapField(
                    ForgeQueueMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData>
              forgeQueueMap__ = input.readMessage(
                  ForgeQueueMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              forgeQueueMap_.getMutableMap().put(
                  forgeQueueMap__.getKey(), forgeQueueMap__.getValue());
              break;
            }
            case 112: {

              maxQueueNum_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.internal_static_ForgeGetQueueDataRsp_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 8:
          return internalGetForgeQueueMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.internal_static_ForgeGetQueueDataRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp.class, emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp.Builder.class);
    }

    public static final int MAX_QUEUE_NUM_FIELD_NUMBER = 14;
    private int maxQueueNum_;
    /**
     * <code>uint32 max_queue_num = 14;</code>
     * @return The maxQueueNum.
     */
    @java.lang.Override
    public int getMaxQueueNum() {
      return maxQueueNum_;
    }

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_;
    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int FORGE_QUEUE_MAP_FIELD_NUMBER = 8;
    private static final class ForgeQueueMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData>newDefaultInstance(
                  emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.internal_static_ForgeGetQueueDataRsp_ForgeQueueMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> forgeQueueMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData>
    internalGetForgeQueueMap() {
      if (forgeQueueMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ForgeQueueMapDefaultEntryHolder.defaultEntry);
      }
      return forgeQueueMap_;
    }

    public int getForgeQueueMapCount() {
      return internalGetForgeQueueMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 8;</code>
     */

    @java.lang.Override
    public boolean containsForgeQueueMap(
        int key) {
      
      return internalGetForgeQueueMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getForgeQueueMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> getForgeQueueMap() {
      return getForgeQueueMapMap();
    }
    /**
     * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 8;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> getForgeQueueMapMap() {
      return internalGetForgeQueueMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 8;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrDefault(
        int key,
        emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData defaultValue) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> map =
          internalGetForgeQueueMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 8;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> map =
          internalGetForgeQueueMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      if (retcode_ != 0) {
        output.writeInt32(5, retcode_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetForgeQueueMap(),
          ForgeQueueMapDefaultEntryHolder.defaultEntry,
          8);
      if (maxQueueNum_ != 0) {
        output.writeUInt32(14, maxQueueNum_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, retcode_);
      }
      for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> entry
           : internalGetForgeQueueMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData>
        forgeQueueMap__ = ForgeQueueMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(8, forgeQueueMap__);
      }
      if (maxQueueNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, maxQueueNum_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp other = (emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp) obj;

      if (getMaxQueueNum()
          != other.getMaxQueueNum()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!internalGetForgeQueueMap().equals(
          other.internalGetForgeQueueMap())) return false;
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
      hash = (37 * hash) + MAX_QUEUE_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getMaxQueueNum();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (!internalGetForgeQueueMap().getMap().isEmpty()) {
        hash = (37 * hash) + FORGE_QUEUE_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetForgeQueueMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp prototype) {
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
     * CmdId: 643
     * Name: NDJNIINPNCE
     * </pre>
     *
     * Protobuf type {@code ForgeGetQueueDataRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ForgeGetQueueDataRsp)
        emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.internal_static_ForgeGetQueueDataRsp_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 8:
            return internalGetForgeQueueMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 8:
            return internalGetMutableForgeQueueMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.internal_static_ForgeGetQueueDataRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp.class, emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp.newBuilder()
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
        maxQueueNum_ = 0;

        retcode_ = 0;

        internalGetMutableForgeQueueMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.internal_static_ForgeGetQueueDataRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp build() {
        emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp buildPartial() {
        emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp result = new emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp(this);
        int from_bitField0_ = bitField0_;
        result.maxQueueNum_ = maxQueueNum_;
        result.retcode_ = retcode_;
        result.forgeQueueMap_ = internalGetForgeQueueMap();
        result.forgeQueueMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp) {
          return mergeFrom((emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp other) {
        if (other == emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp.getDefaultInstance()) return this;
        if (other.getMaxQueueNum() != 0) {
          setMaxQueueNum(other.getMaxQueueNum());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        internalGetMutableForgeQueueMap().mergeFrom(
            other.internalGetForgeQueueMap());
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
        emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int maxQueueNum_ ;
      /**
       * <code>uint32 max_queue_num = 14;</code>
       * @return The maxQueueNum.
       */
      @java.lang.Override
      public int getMaxQueueNum() {
        return maxQueueNum_;
      }
      /**
       * <code>uint32 max_queue_num = 14;</code>
       * @param value The maxQueueNum to set.
       * @return This builder for chaining.
       */
      public Builder setMaxQueueNum(int value) {
        
        maxQueueNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_queue_num = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxQueueNum() {
        
        maxQueueNum_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> forgeQueueMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData>
      internalGetForgeQueueMap() {
        if (forgeQueueMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              ForgeQueueMapDefaultEntryHolder.defaultEntry);
        }
        return forgeQueueMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData>
      internalGetMutableForgeQueueMap() {
        onChanged();;
        if (forgeQueueMap_ == null) {
          forgeQueueMap_ = com.google.protobuf.MapField.newMapField(
              ForgeQueueMapDefaultEntryHolder.defaultEntry);
        }
        if (!forgeQueueMap_.isMutable()) {
          forgeQueueMap_ = forgeQueueMap_.copy();
        }
        return forgeQueueMap_;
      }

      public int getForgeQueueMapCount() {
        return internalGetForgeQueueMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 8;</code>
       */

      @java.lang.Override
      public boolean containsForgeQueueMap(
          int key) {
        
        return internalGetForgeQueueMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getForgeQueueMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> getForgeQueueMap() {
        return getForgeQueueMapMap();
      }
      /**
       * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 8;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> getForgeQueueMapMap() {
        return internalGetForgeQueueMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 8;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrDefault(
          int key,
          emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData defaultValue) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> map =
            internalGetForgeQueueMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 8;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> map =
            internalGetForgeQueueMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearForgeQueueMap() {
        internalGetMutableForgeQueueMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 8;</code>
       */

      public Builder removeForgeQueueMap(
          int key) {
        
        internalGetMutableForgeQueueMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData>
      getMutableForgeQueueMap() {
        return internalGetMutableForgeQueueMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 8;</code>
       */
      public Builder putForgeQueueMap(
          int key,
          emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData value) {
        
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableForgeQueueMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .ForgeQueueData&gt; forge_queue_map = 8;</code>
       */

      public Builder putAllForgeQueueMap(
          java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData> values) {
        internalGetMutableForgeQueueMap().getMutableMap()
            .putAll(values);
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


      // @@protoc_insertion_point(builder_scope:ForgeGetQueueDataRsp)
    }

    // @@protoc_insertion_point(class_scope:ForgeGetQueueDataRsp)
    private static final emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp();
    }

    public static emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ForgeGetQueueDataRsp>
        PARSER = new com.google.protobuf.AbstractParser<ForgeGetQueueDataRsp>() {
      @java.lang.Override
      public ForgeGetQueueDataRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ForgeGetQueueDataRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ForgeGetQueueDataRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ForgeGetQueueDataRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ForgeGetQueueDataRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ForgeGetQueueDataRsp_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ForgeGetQueueDataRsp_ForgeQueueMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ForgeGetQueueDataRsp_ForgeQueueMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032ForgeGetQueueDataRsp.proto\032\024ForgeQueue" +
      "Data.proto\"\310\001\n\024ForgeGetQueueDataRsp\022\025\n\rm" +
      "ax_queue_num\030\016 \001(\r\022\017\n\007retcode\030\005 \001(\005\022A\n\017f" +
      "orge_queue_map\030\010 \003(\0132(.ForgeGetQueueData" +
      "Rsp.ForgeQueueMapEntry\032E\n\022ForgeQueueMapE" +
      "ntry\022\013\n\003key\030\001 \001(\r\022\036\n\005value\030\002 \001(\0132\017.Forge" +
      "QueueData:\0028\001B\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ForgeQueueDataOuterClass.getDescriptor(),
        });
    internal_static_ForgeGetQueueDataRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ForgeGetQueueDataRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ForgeGetQueueDataRsp_descriptor,
        new java.lang.String[] { "MaxQueueNum", "Retcode", "ForgeQueueMap", });
    internal_static_ForgeGetQueueDataRsp_ForgeQueueMapEntry_descriptor =
      internal_static_ForgeGetQueueDataRsp_descriptor.getNestedTypes().get(0);
    internal_static_ForgeGetQueueDataRsp_ForgeQueueMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ForgeGetQueueDataRsp_ForgeQueueMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.ForgeQueueDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
