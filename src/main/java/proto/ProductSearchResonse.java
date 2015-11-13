package proto;
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

/**
 * Protobuf type {@code ProductSearchResonse}
 */
public  final class ProductSearchResonse extends
    com.google.protobuf.GeneratedMessage
    implements ProductSearchResonseOrBuilder {
  // Use ProductSearchResonse.newBuilder() to construct.
  private ProductSearchResonse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private ProductSearchResonse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final ProductSearchResonse defaultInstance;
  public static ProductSearchResonse getDefaultInstance() {
    return defaultInstance;
  }

  public ProductSearchResonse getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private ProductSearchResonse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    initFields();
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
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            Product.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = product_.toBuilder();
            }
            product_ = input.readMessage(Product.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(product_);
              product_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ProductProtos.internal_static_ProductSearchResonse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ProductProtos.internal_static_ProductSearchResonse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ProductSearchResonse.class, ProductSearchResonse.Builder.class);
  }

  public static com.google.protobuf.Parser<ProductSearchResonse> PARSER =
      new com.google.protobuf.AbstractParser<ProductSearchResonse>() {
    public ProductSearchResonse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductSearchResonse(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<ProductSearchResonse> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  // optional .Product product = 1;
  public static final int PRODUCT_FIELD_NUMBER = 1;
  private Product product_;
  /**
   * <code>optional .Product product = 1;</code>
   */
  public boolean hasProduct() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .Product product = 1;</code>
   */
  public Product getProduct() {
    return product_;
  }
  /**
   * <code>optional .Product product = 1;</code>
   */
  public ProductOrBuilder getProductOrBuilder() {
    return product_;
  }

  private void initFields() {
    product_ = Product.getDefaultInstance();
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized != -1) return isInitialized == 1;

    if (hasProduct()) {
      if (!getProduct().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, product_);
    }
    getUnknownFields().writeTo(output);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, product_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static ProductSearchResonse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ProductSearchResonse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ProductSearchResonse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ProductSearchResonse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ProductSearchResonse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static ProductSearchResonse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static ProductSearchResonse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static ProductSearchResonse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static ProductSearchResonse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static ProductSearchResonse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(ProductSearchResonse prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ProductSearchResonse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements ProductSearchResonseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ProductProtos.internal_static_ProductSearchResonse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ProductProtos.internal_static_ProductSearchResonse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ProductSearchResonse.class, ProductSearchResonse.Builder.class);
    }

    // Construct using ProductSearchResonse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        getProductFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      if (productBuilder_ == null) {
        product_ = Product.getDefaultInstance();
      } else {
        productBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ProductProtos.internal_static_ProductSearchResonse_descriptor;
    }

    public ProductSearchResonse getDefaultInstanceForType() {
      return ProductSearchResonse.getDefaultInstance();
    }

    public ProductSearchResonse build() {
      ProductSearchResonse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ProductSearchResonse buildPartial() {
      ProductSearchResonse result = new ProductSearchResonse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      if (productBuilder_ == null) {
        result.product_ = product_;
      } else {
        result.product_ = productBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ProductSearchResonse) {
        return mergeFrom((ProductSearchResonse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ProductSearchResonse other) {
      if (other == ProductSearchResonse.getDefaultInstance()) return this;
      if (other.hasProduct()) {
        mergeProduct(other.getProduct());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }

    public final boolean isInitialized() {
      if (hasProduct()) {
        if (!getProduct().isInitialized()) {
          
          return false;
        }
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ProductSearchResonse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ProductSearchResonse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // optional .Product product = 1;
    private Product product_ = Product.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        Product, Product.Builder, ProductOrBuilder> productBuilder_;
    /**
     * <code>optional .Product product = 1;</code>
     */
    public boolean hasProduct() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .Product product = 1;</code>
     */
    public Product getProduct() {
      if (productBuilder_ == null) {
        return product_;
      } else {
        return productBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Product product = 1;</code>
     */
    public Builder setProduct(Product value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        product_ = value;
        onChanged();
      } else {
        productBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .Product product = 1;</code>
     */
    public Builder setProduct(
        Product.Builder builderForValue) {
      if (productBuilder_ == null) {
        product_ = builderForValue.build();
        onChanged();
      } else {
        productBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .Product product = 1;</code>
     */
    public Builder mergeProduct(Product value) {
      if (productBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001) &&
            product_ != Product.getDefaultInstance()) {
          product_ =
            Product.newBuilder(product_).mergeFrom(value).buildPartial();
        } else {
          product_ = value;
        }
        onChanged();
      } else {
        productBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .Product product = 1;</code>
     */
    public Builder clearProduct() {
      if (productBuilder_ == null) {
        product_ = Product.getDefaultInstance();
        onChanged();
      } else {
        productBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .Product product = 1;</code>
     */
    public Product.Builder getProductBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getProductFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Product product = 1;</code>
     */
    public ProductOrBuilder getProductOrBuilder() {
      if (productBuilder_ != null) {
        return productBuilder_.getMessageOrBuilder();
      } else {
        return product_;
      }
    }
    /**
     * <code>optional .Product product = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        Product, Product.Builder, ProductOrBuilder> 
        getProductFieldBuilder() {
      if (productBuilder_ == null) {
        productBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            Product, Product.Builder, ProductOrBuilder>(
                product_,
                getParentForChildren(),
                isClean());
        product_ = null;
      }
      return productBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:ProductSearchResonse)
  }

  static {
    defaultInstance = new ProductSearchResonse(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:ProductSearchResonse)
}
