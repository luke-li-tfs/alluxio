/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tachyon.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-12-30")
public class SetStateTOptions implements org.apache.thrift.TBase<SetStateTOptions, SetStateTOptions._Fields>, java.io.Serializable, Cloneable, Comparable<SetStateTOptions> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SetStateTOptions");

  private static final org.apache.thrift.protocol.TField PINNED_FIELD_DESC = new org.apache.thrift.protocol.TField("pinned", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField TTL_FIELD_DESC = new org.apache.thrift.protocol.TField("ttl", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField PERSISTED_FIELD_DESC = new org.apache.thrift.protocol.TField("persisted", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SetStateTOptionsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SetStateTOptionsTupleSchemeFactory());
  }

  public boolean pinned; // optional
  public long ttl; // optional
  public boolean persisted; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PINNED((short)1, "pinned"),
    TTL((short)2, "ttl"),
    PERSISTED((short)3, "persisted");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PINNED
          return PINNED;
        case 2: // TTL
          return TTL;
        case 3: // PERSISTED
          return PERSISTED;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PINNED_ISSET_ID = 0;
  private static final int __TTL_ISSET_ID = 1;
  private static final int __PERSISTED_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PINNED,_Fields.TTL,_Fields.PERSISTED};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PINNED, new org.apache.thrift.meta_data.FieldMetaData("pinned", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TTL, new org.apache.thrift.meta_data.FieldMetaData("ttl", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PERSISTED, new org.apache.thrift.meta_data.FieldMetaData("persisted", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SetStateTOptions.class, metaDataMap);
  }

  public SetStateTOptions() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SetStateTOptions(SetStateTOptions other) {
    __isset_bitfield = other.__isset_bitfield;
    this.pinned = other.pinned;
    this.ttl = other.ttl;
    this.persisted = other.persisted;
  }

  public SetStateTOptions deepCopy() {
    return new SetStateTOptions(this);
  }

  @Override
  public void clear() {
    setPinnedIsSet(false);
    this.pinned = false;
    setTtlIsSet(false);
    this.ttl = 0;
    setPersistedIsSet(false);
    this.persisted = false;
  }

  public boolean isPinned() {
    return this.pinned;
  }

  public SetStateTOptions setPinned(boolean pinned) {
    this.pinned = pinned;
    setPinnedIsSet(true);
    return this;
  }

  public void unsetPinned() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PINNED_ISSET_ID);
  }

  /** Returns true if field pinned is set (has been assigned a value) and false otherwise */
  public boolean isSetPinned() {
    return EncodingUtils.testBit(__isset_bitfield, __PINNED_ISSET_ID);
  }

  public void setPinnedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PINNED_ISSET_ID, value);
  }

  public long getTtl() {
    return this.ttl;
  }

  public SetStateTOptions setTtl(long ttl) {
    this.ttl = ttl;
    setTtlIsSet(true);
    return this;
  }

  public void unsetTtl() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TTL_ISSET_ID);
  }

  /** Returns true if field ttl is set (has been assigned a value) and false otherwise */
  public boolean isSetTtl() {
    return EncodingUtils.testBit(__isset_bitfield, __TTL_ISSET_ID);
  }

  public void setTtlIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TTL_ISSET_ID, value);
  }

  public boolean isPersisted() {
    return this.persisted;
  }

  public SetStateTOptions setPersisted(boolean persisted) {
    this.persisted = persisted;
    setPersistedIsSet(true);
    return this;
  }

  public void unsetPersisted() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PERSISTED_ISSET_ID);
  }

  /** Returns true if field persisted is set (has been assigned a value) and false otherwise */
  public boolean isSetPersisted() {
    return EncodingUtils.testBit(__isset_bitfield, __PERSISTED_ISSET_ID);
  }

  public void setPersistedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PERSISTED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PINNED:
      if (value == null) {
        unsetPinned();
      } else {
        setPinned((Boolean)value);
      }
      break;

    case TTL:
      if (value == null) {
        unsetTtl();
      } else {
        setTtl((Long)value);
      }
      break;

    case PERSISTED:
      if (value == null) {
        unsetPersisted();
      } else {
        setPersisted((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PINNED:
      return Boolean.valueOf(isPinned());

    case TTL:
      return Long.valueOf(getTtl());

    case PERSISTED:
      return Boolean.valueOf(isPersisted());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PINNED:
      return isSetPinned();
    case TTL:
      return isSetTtl();
    case PERSISTED:
      return isSetPersisted();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SetStateTOptions)
      return this.equals((SetStateTOptions)that);
    return false;
  }

  public boolean equals(SetStateTOptions that) {
    if (that == null)
      return false;

    boolean this_present_pinned = true && this.isSetPinned();
    boolean that_present_pinned = true && that.isSetPinned();
    if (this_present_pinned || that_present_pinned) {
      if (!(this_present_pinned && that_present_pinned))
        return false;
      if (this.pinned != that.pinned)
        return false;
    }

    boolean this_present_ttl = true && this.isSetTtl();
    boolean that_present_ttl = true && that.isSetTtl();
    if (this_present_ttl || that_present_ttl) {
      if (!(this_present_ttl && that_present_ttl))
        return false;
      if (this.ttl != that.ttl)
        return false;
    }

    boolean this_present_persisted = true && this.isSetPersisted();
    boolean that_present_persisted = true && that.isSetPersisted();
    if (this_present_persisted || that_present_persisted) {
      if (!(this_present_persisted && that_present_persisted))
        return false;
      if (this.persisted != that.persisted)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_pinned = true && (isSetPinned());
    list.add(present_pinned);
    if (present_pinned)
      list.add(pinned);

    boolean present_ttl = true && (isSetTtl());
    list.add(present_ttl);
    if (present_ttl)
      list.add(ttl);

    boolean present_persisted = true && (isSetPersisted());
    list.add(present_persisted);
    if (present_persisted)
      list.add(persisted);

    return list.hashCode();
  }

  @Override
  public int compareTo(SetStateTOptions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPinned()).compareTo(other.isSetPinned());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPinned()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pinned, other.pinned);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTtl()).compareTo(other.isSetTtl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTtl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ttl, other.ttl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPersisted()).compareTo(other.isSetPersisted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPersisted()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.persisted, other.persisted);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SetStateTOptions(");
    boolean first = true;

    if (isSetPinned()) {
      sb.append("pinned:");
      sb.append(this.pinned);
      first = false;
    }
    if (isSetTtl()) {
      if (!first) sb.append(", ");
      sb.append("ttl:");
      sb.append(this.ttl);
      first = false;
    }
    if (isSetPersisted()) {
      if (!first) sb.append(", ");
      sb.append("persisted:");
      sb.append(this.persisted);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SetStateTOptionsStandardSchemeFactory implements SchemeFactory {
    public SetStateTOptionsStandardScheme getScheme() {
      return new SetStateTOptionsStandardScheme();
    }
  }

  private static class SetStateTOptionsStandardScheme extends StandardScheme<SetStateTOptions> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SetStateTOptions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PINNED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.pinned = iprot.readBool();
              struct.setPinnedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TTL
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.ttl = iprot.readI64();
              struct.setTtlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PERSISTED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.persisted = iprot.readBool();
              struct.setPersistedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SetStateTOptions struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetPinned()) {
        oprot.writeFieldBegin(PINNED_FIELD_DESC);
        oprot.writeBool(struct.pinned);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTtl()) {
        oprot.writeFieldBegin(TTL_FIELD_DESC);
        oprot.writeI64(struct.ttl);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPersisted()) {
        oprot.writeFieldBegin(PERSISTED_FIELD_DESC);
        oprot.writeBool(struct.persisted);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SetStateTOptionsTupleSchemeFactory implements SchemeFactory {
    public SetStateTOptionsTupleScheme getScheme() {
      return new SetStateTOptionsTupleScheme();
    }
  }

  private static class SetStateTOptionsTupleScheme extends TupleScheme<SetStateTOptions> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SetStateTOptions struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPinned()) {
        optionals.set(0);
      }
      if (struct.isSetTtl()) {
        optionals.set(1);
      }
      if (struct.isSetPersisted()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetPinned()) {
        oprot.writeBool(struct.pinned);
      }
      if (struct.isSetTtl()) {
        oprot.writeI64(struct.ttl);
      }
      if (struct.isSetPersisted()) {
        oprot.writeBool(struct.persisted);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SetStateTOptions struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.pinned = iprot.readBool();
        struct.setPinnedIsSet(true);
      }
      if (incoming.get(1)) {
        struct.ttl = iprot.readI64();
        struct.setTtlIsSet(true);
      }
      if (incoming.get(2)) {
        struct.persisted = iprot.readBool();
        struct.setPersistedIsSet(true);
      }
    }
  }

}

