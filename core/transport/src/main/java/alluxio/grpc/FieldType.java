// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/catalog_master.proto

package alluxio.grpc;

/**
 * Protobuf type {@code alluxio.grpc.FieldType}
 */
public  final class FieldType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.FieldType)
    FieldTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FieldType.newBuilder() to construct.
  private FieldType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FieldType() {
    repetition_ = 1;
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FieldType(
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
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();
            alluxio.grpc.Repetition value = alluxio.grpc.Repetition.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              repetition_ = rawValue;
            }
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            name_ = bs;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();
            alluxio.grpc.PrimitiveTypeName value = alluxio.grpc.PrimitiveTypeName.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(3, rawValue);
            } else {
              typeInfoCase_ = 3;
              typeInfo_ = rawValue;
            }
            break;
          }
          case 34: {
            alluxio.grpc.GroupType.Builder subBuilder = null;
            if (typeInfoCase_ == 4) {
              subBuilder = ((alluxio.grpc.GroupType) typeInfo_).toBuilder();
            }
            typeInfo_ =
                input.readMessage(alluxio.grpc.GroupType.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((alluxio.grpc.GroupType) typeInfo_);
              typeInfo_ = subBuilder.buildPartial();
            }
            typeInfoCase_ = 4;
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
    return alluxio.grpc.CatalogMasterProto.internal_static_alluxio_grpc_FieldType_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.CatalogMasterProto.internal_static_alluxio_grpc_FieldType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.FieldType.class, alluxio.grpc.FieldType.Builder.class);
  }

  private int bitField0_;
  private int typeInfoCase_ = 0;
  private java.lang.Object typeInfo_;
  public enum TypeInfoCase
      implements com.google.protobuf.Internal.EnumLite {
    TYPE_ID(3),
    GROUP(4),
    TYPEINFO_NOT_SET(0);
    private final int value;
    private TypeInfoCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TypeInfoCase valueOf(int value) {
      return forNumber(value);
    }

    public static TypeInfoCase forNumber(int value) {
      switch (value) {
        case 3: return TYPE_ID;
        case 4: return GROUP;
        case 0: return TYPEINFO_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TypeInfoCase
  getTypeInfoCase() {
    return TypeInfoCase.forNumber(
        typeInfoCase_);
  }

  public static final int REPETITION_FIELD_NUMBER = 1;
  private int repetition_;
  /**
   * <code>optional .alluxio.grpc.Repetition repetition = 1;</code>
   */
  public boolean hasRepetition() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .alluxio.grpc.Repetition repetition = 1;</code>
   */
  public alluxio.grpc.Repetition getRepetition() {
    alluxio.grpc.Repetition result = alluxio.grpc.Repetition.valueOf(repetition_);
    return result == null ? alluxio.grpc.Repetition.REPEATED : result;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>optional string name = 2;</code>
   */
  public boolean hasName() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        name_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_ID_FIELD_NUMBER = 3;
  /**
   * <code>optional .alluxio.grpc.PrimitiveTypeName type_id = 3;</code>
   */
  public boolean hasTypeId() {
    return typeInfoCase_ == 3;
  }
  /**
   * <code>optional .alluxio.grpc.PrimitiveTypeName type_id = 3;</code>
   */
  public alluxio.grpc.PrimitiveTypeName getTypeId() {
    if (typeInfoCase_ == 3) {
      alluxio.grpc.PrimitiveTypeName result = alluxio.grpc.PrimitiveTypeName.valueOf(
          (java.lang.Integer) typeInfo_);
      return result == null ? alluxio.grpc.PrimitiveTypeName.PARQUETTYPE_INT64 : result;
    }
    return alluxio.grpc.PrimitiveTypeName.PARQUETTYPE_INT64;
  }

  public static final int GROUP_FIELD_NUMBER = 4;
  /**
   * <code>optional .alluxio.grpc.GroupType group = 4;</code>
   */
  public boolean hasGroup() {
    return typeInfoCase_ == 4;
  }
  /**
   * <code>optional .alluxio.grpc.GroupType group = 4;</code>
   */
  public alluxio.grpc.GroupType getGroup() {
    if (typeInfoCase_ == 4) {
       return (alluxio.grpc.GroupType) typeInfo_;
    }
    return alluxio.grpc.GroupType.getDefaultInstance();
  }
  /**
   * <code>optional .alluxio.grpc.GroupType group = 4;</code>
   */
  public alluxio.grpc.GroupTypeOrBuilder getGroupOrBuilder() {
    if (typeInfoCase_ == 4) {
       return (alluxio.grpc.GroupType) typeInfo_;
    }
    return alluxio.grpc.GroupType.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeEnum(1, repetition_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (typeInfoCase_ == 3) {
      output.writeEnum(3, ((java.lang.Integer) typeInfo_));
    }
    if (typeInfoCase_ == 4) {
      output.writeMessage(4, (alluxio.grpc.GroupType) typeInfo_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, repetition_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (typeInfoCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, ((java.lang.Integer) typeInfo_));
    }
    if (typeInfoCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, (alluxio.grpc.GroupType) typeInfo_);
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
    if (!(obj instanceof alluxio.grpc.FieldType)) {
      return super.equals(obj);
    }
    alluxio.grpc.FieldType other = (alluxio.grpc.FieldType) obj;

    boolean result = true;
    result = result && (hasRepetition() == other.hasRepetition());
    if (hasRepetition()) {
      result = result && repetition_ == other.repetition_;
    }
    result = result && (hasName() == other.hasName());
    if (hasName()) {
      result = result && getName()
          .equals(other.getName());
    }
    result = result && getTypeInfoCase().equals(
        other.getTypeInfoCase());
    if (!result) return false;
    switch (typeInfoCase_) {
      case 3:
        result = result && getTypeId()
            .equals(other.getTypeId());
        break;
      case 4:
        result = result && getGroup()
            .equals(other.getGroup());
        break;
      case 0:
      default:
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRepetition()) {
      hash = (37 * hash) + REPETITION_FIELD_NUMBER;
      hash = (53 * hash) + repetition_;
    }
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    switch (typeInfoCase_) {
      case 3:
        hash = (37 * hash) + TYPE_ID_FIELD_NUMBER;
        hash = (53 * hash) + getTypeId().getNumber();
        break;
      case 4:
        hash = (37 * hash) + GROUP_FIELD_NUMBER;
        hash = (53 * hash) + getGroup().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.FieldType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.FieldType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.FieldType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.FieldType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.FieldType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.FieldType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.FieldType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.FieldType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.FieldType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.FieldType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.FieldType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.FieldType parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(alluxio.grpc.FieldType prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code alluxio.grpc.FieldType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.FieldType)
      alluxio.grpc.FieldTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.CatalogMasterProto.internal_static_alluxio_grpc_FieldType_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.CatalogMasterProto.internal_static_alluxio_grpc_FieldType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.FieldType.class, alluxio.grpc.FieldType.Builder.class);
    }

    // Construct using alluxio.grpc.FieldType.newBuilder()
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
    public Builder clear() {
      super.clear();
      repetition_ = 1;
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      typeInfoCase_ = 0;
      typeInfo_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.CatalogMasterProto.internal_static_alluxio_grpc_FieldType_descriptor;
    }

    public alluxio.grpc.FieldType getDefaultInstanceForType() {
      return alluxio.grpc.FieldType.getDefaultInstance();
    }

    public alluxio.grpc.FieldType build() {
      alluxio.grpc.FieldType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.FieldType buildPartial() {
      alluxio.grpc.FieldType result = new alluxio.grpc.FieldType(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.repetition_ = repetition_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.name_ = name_;
      if (typeInfoCase_ == 3) {
        result.typeInfo_ = typeInfo_;
      }
      if (typeInfoCase_ == 4) {
        if (groupBuilder_ == null) {
          result.typeInfo_ = typeInfo_;
        } else {
          result.typeInfo_ = groupBuilder_.build();
        }
      }
      result.bitField0_ = to_bitField0_;
      result.typeInfoCase_ = typeInfoCase_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof alluxio.grpc.FieldType) {
        return mergeFrom((alluxio.grpc.FieldType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.FieldType other) {
      if (other == alluxio.grpc.FieldType.getDefaultInstance()) return this;
      if (other.hasRepetition()) {
        setRepetition(other.getRepetition());
      }
      if (other.hasName()) {
        bitField0_ |= 0x00000002;
        name_ = other.name_;
        onChanged();
      }
      switch (other.getTypeInfoCase()) {
        case TYPE_ID: {
          setTypeId(other.getTypeId());
          break;
        }
        case GROUP: {
          mergeGroup(other.getGroup());
          break;
        }
        case TYPEINFO_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      alluxio.grpc.FieldType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.FieldType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int typeInfoCase_ = 0;
    private java.lang.Object typeInfo_;
    public TypeInfoCase
        getTypeInfoCase() {
      return TypeInfoCase.forNumber(
          typeInfoCase_);
    }

    public Builder clearTypeInfo() {
      typeInfoCase_ = 0;
      typeInfo_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private int repetition_ = 1;
    /**
     * <code>optional .alluxio.grpc.Repetition repetition = 1;</code>
     */
    public boolean hasRepetition() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .alluxio.grpc.Repetition repetition = 1;</code>
     */
    public alluxio.grpc.Repetition getRepetition() {
      alluxio.grpc.Repetition result = alluxio.grpc.Repetition.valueOf(repetition_);
      return result == null ? alluxio.grpc.Repetition.REPEATED : result;
    }
    /**
     * <code>optional .alluxio.grpc.Repetition repetition = 1;</code>
     */
    public Builder setRepetition(alluxio.grpc.Repetition value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      repetition_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.Repetition repetition = 1;</code>
     */
    public Builder clearRepetition() {
      bitField0_ = (bitField0_ & ~0x00000001);
      repetition_ = 1;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 2;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000002);
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      name_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>optional .alluxio.grpc.PrimitiveTypeName type_id = 3;</code>
     */
    public boolean hasTypeId() {
      return typeInfoCase_ == 3;
    }
    /**
     * <code>optional .alluxio.grpc.PrimitiveTypeName type_id = 3;</code>
     */
    public alluxio.grpc.PrimitiveTypeName getTypeId() {
      if (typeInfoCase_ == 3) {
        alluxio.grpc.PrimitiveTypeName result = alluxio.grpc.PrimitiveTypeName.valueOf(
            (java.lang.Integer) typeInfo_);
        return result == null ? alluxio.grpc.PrimitiveTypeName.PARQUETTYPE_INT64 : result;
      }
      return alluxio.grpc.PrimitiveTypeName.PARQUETTYPE_INT64;
    }
    /**
     * <code>optional .alluxio.grpc.PrimitiveTypeName type_id = 3;</code>
     */
    public Builder setTypeId(alluxio.grpc.PrimitiveTypeName value) {
      if (value == null) {
        throw new NullPointerException();
      }
      typeInfoCase_ = 3;
      typeInfo_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.PrimitiveTypeName type_id = 3;</code>
     */
    public Builder clearTypeId() {
      if (typeInfoCase_ == 3) {
        typeInfoCase_ = 0;
        typeInfo_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.GroupType, alluxio.grpc.GroupType.Builder, alluxio.grpc.GroupTypeOrBuilder> groupBuilder_;
    /**
     * <code>optional .alluxio.grpc.GroupType group = 4;</code>
     */
    public boolean hasGroup() {
      return typeInfoCase_ == 4;
    }
    /**
     * <code>optional .alluxio.grpc.GroupType group = 4;</code>
     */
    public alluxio.grpc.GroupType getGroup() {
      if (groupBuilder_ == null) {
        if (typeInfoCase_ == 4) {
          return (alluxio.grpc.GroupType) typeInfo_;
        }
        return alluxio.grpc.GroupType.getDefaultInstance();
      } else {
        if (typeInfoCase_ == 4) {
          return groupBuilder_.getMessage();
        }
        return alluxio.grpc.GroupType.getDefaultInstance();
      }
    }
    /**
     * <code>optional .alluxio.grpc.GroupType group = 4;</code>
     */
    public Builder setGroup(alluxio.grpc.GroupType value) {
      if (groupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        typeInfo_ = value;
        onChanged();
      } else {
        groupBuilder_.setMessage(value);
      }
      typeInfoCase_ = 4;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.GroupType group = 4;</code>
     */
    public Builder setGroup(
        alluxio.grpc.GroupType.Builder builderForValue) {
      if (groupBuilder_ == null) {
        typeInfo_ = builderForValue.build();
        onChanged();
      } else {
        groupBuilder_.setMessage(builderForValue.build());
      }
      typeInfoCase_ = 4;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.GroupType group = 4;</code>
     */
    public Builder mergeGroup(alluxio.grpc.GroupType value) {
      if (groupBuilder_ == null) {
        if (typeInfoCase_ == 4 &&
            typeInfo_ != alluxio.grpc.GroupType.getDefaultInstance()) {
          typeInfo_ = alluxio.grpc.GroupType.newBuilder((alluxio.grpc.GroupType) typeInfo_)
              .mergeFrom(value).buildPartial();
        } else {
          typeInfo_ = value;
        }
        onChanged();
      } else {
        if (typeInfoCase_ == 4) {
          groupBuilder_.mergeFrom(value);
        }
        groupBuilder_.setMessage(value);
      }
      typeInfoCase_ = 4;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.GroupType group = 4;</code>
     */
    public Builder clearGroup() {
      if (groupBuilder_ == null) {
        if (typeInfoCase_ == 4) {
          typeInfoCase_ = 0;
          typeInfo_ = null;
          onChanged();
        }
      } else {
        if (typeInfoCase_ == 4) {
          typeInfoCase_ = 0;
          typeInfo_ = null;
        }
        groupBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.GroupType group = 4;</code>
     */
    public alluxio.grpc.GroupType.Builder getGroupBuilder() {
      return getGroupFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .alluxio.grpc.GroupType group = 4;</code>
     */
    public alluxio.grpc.GroupTypeOrBuilder getGroupOrBuilder() {
      if ((typeInfoCase_ == 4) && (groupBuilder_ != null)) {
        return groupBuilder_.getMessageOrBuilder();
      } else {
        if (typeInfoCase_ == 4) {
          return (alluxio.grpc.GroupType) typeInfo_;
        }
        return alluxio.grpc.GroupType.getDefaultInstance();
      }
    }
    /**
     * <code>optional .alluxio.grpc.GroupType group = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.GroupType, alluxio.grpc.GroupType.Builder, alluxio.grpc.GroupTypeOrBuilder> 
        getGroupFieldBuilder() {
      if (groupBuilder_ == null) {
        if (!(typeInfoCase_ == 4)) {
          typeInfo_ = alluxio.grpc.GroupType.getDefaultInstance();
        }
        groupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            alluxio.grpc.GroupType, alluxio.grpc.GroupType.Builder, alluxio.grpc.GroupTypeOrBuilder>(
                (alluxio.grpc.GroupType) typeInfo_,
                getParentForChildren(),
                isClean());
        typeInfo_ = null;
      }
      typeInfoCase_ = 4;
      onChanged();;
      return groupBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.FieldType)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.FieldType)
  private static final alluxio.grpc.FieldType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.FieldType();
  }

  public static alluxio.grpc.FieldType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<FieldType>
      PARSER = new com.google.protobuf.AbstractParser<FieldType>() {
    public FieldType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FieldType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FieldType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FieldType> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.FieldType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

